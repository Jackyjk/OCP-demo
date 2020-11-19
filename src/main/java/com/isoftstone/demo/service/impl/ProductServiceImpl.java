package com.isoftstone.demo.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.isoftstone.demo.common.ProductVo;
import com.isoftstone.demo.dao.ProductDao;
import com.isoftstone.demo.pojo.Product;
import com.isoftstone.demo.service.ProductService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.util.HashMap;
import java.util.List;


@SuppressWarnings("ALL")
@Service
@Transactional
public class ProductServiceImpl implements ProductService {
	
	@Autowired
	ProductDao productDao;

	@Override
	public List<Product> findAllProducts() throws Exception {
		return productDao.findAll();
	}

	@Override
	public void addProduct(Product product) throws Exception {
		productDao.insert(product);
	}

	@Override
	public PageInfo<Product> findPages(ProductVo pvo) throws Exception {
		PageHelper.startPage(pvo.getPageNum()==0 ? 1:pvo.getPageNum(), 5);
		HashMap<String, Object> map = new HashMap<String, Object>();
		if(pvo.getPo()!=null) {
			map.put("pname",pvo.getPo().getPname());
		}
		map.put("priceStart", pvo.getPriceStart());
		map.put("priceEnd", pvo.getPriceEnd());
		List<Product> products = productDao.findPages(map);
		PageInfo<Product> pageInfo = new PageInfo<Product>(products);
		return pageInfo;
	}

	@Override
	public void delProduct(int pid) throws Exception {
       productDao.delete(pid);		
	}

	@Override
	public Product preViewProdut(int pid) throws Exception {
		return productDao.findOne(pid);
	}

	@Override
	public void updateProduct(Product product, MultipartFile pimage,String rootPath) throws Exception {
        //ͼƬ�ϴ�
		System.out.println(rootPath);
	    String originalFilename = pimage.getOriginalFilename();
	    File parent = new File(rootPath);
	    pimage.transferTo(new File(parent,originalFilename));
	    Product old = productDao.findOne(product.getId());
	    BeanUtils.copyProperties(old, product);
	    product.setPimage("/upload/"+originalFilename);
	    productDao.update(product);
	}
}
