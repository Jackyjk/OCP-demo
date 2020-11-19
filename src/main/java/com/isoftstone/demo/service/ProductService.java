package com.isoftstone.demo.service;

import com.github.pagehelper.PageInfo;
import com.isoftstone.demo.common.ProductVo;
import com.isoftstone.demo.pojo.Product;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;


public interface ProductService {
	
	public List<Product> findAllProducts() throws Exception;
	
	public void addProduct(Product product) throws Exception;
	
	public PageInfo<Product> findPages(ProductVo pvo) throws Exception;
	
	public void delProduct(int pid) throws Exception;
	
	public Product preViewProdut(int pid) throws Exception;
	
	public void updateProduct(Product product, MultipartFile pimage, String rootPath) throws Exception;

	/**
	 * @author lzy
	 * @return true 还有货 false 没有货物了
	 */
	public boolean checkNum(int id,Double need)throws Exception;

}
