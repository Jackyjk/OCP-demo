package com.isoftstone.demo.web;

import com.github.pagehelper.PageInfo;
import com.isoftstone.demo.common.ProductVo;
import com.isoftstone.demo.pojo.Product;
import com.isoftstone.demo.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.PrintWriter;
import java.util.List;


@Controller
public class ProductController {
	
	@Autowired
	ProductService productService;
	
	@RequestMapping("/list")
	public String ll(Model model) throws Exception {
		List<Product> products = productService.findAllProducts();
		model.addAttribute("list", products);
		return "list";
	}
	
	@RequestMapping("/llpage")
	public String llpage(ProductVo pvo, Model model) throws Exception {
		PageInfo<Product> page = productService.findPages(pvo);
		model.addAttribute("page", page);
		model.addAttribute("pvo", pvo);
		return "list";
	}
	
	@RequestMapping("/getone")
	@ResponseBody
	public Product getOne(@RequestBody Product pone,HttpServletResponse response) throws Exception {
		Product product = productService.preViewProdut(pone.getId());
		return product;
	}

	@RequestMapping("/showAdd")
	public String showAdd(){
      return "add";
	}

	@RequestMapping("/add")
	public String add(Product product) throws Exception{
		//��Ʒ���
		productService.addProduct(product);
		return "redirect:/llpage";
	}
	
	@RequestMapping("/del")
	public void del(HttpServletRequest request,HttpServletResponse response) throws Exception {
		String pid  = request.getParameter("id");
		PrintWriter pw = response.getWriter();
		try{
			productService.delProduct(Integer.parseInt(pid));
			pw.print(1);
		}  catch (Exception e) {
			pw.print(0);
		}
	}
	
	@RequestMapping("/preUpdate/{id}")
	public String preUpdate(@PathVariable("id") Integer id,Model model) throws Exception{
		Product product = productService.preViewProdut(id);
		model.addAttribute("product", product);
		return "update";
	}
	
	/**
	 * @param request
	 * @param product
	 * @param pictureFile
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/update")
	public String update(HttpServletRequest request,Product product,MultipartFile pictureFile) throws Exception {
		productService.updateProduct(product, pictureFile, "D:\\upload");
		return "redirect:/llpage";
	}
}
