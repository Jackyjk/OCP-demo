package com.isoftstone.demo.service;

import com.github.pagehelper.PageInfo;
import com.isoftstone.demo.common.ProductVo;
import com.isoftstone.demo.pojo.Product;
import com.isoftstone.demo.pojo.WareHouseProduct;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;


public interface ProductService {
	
	public List<WareHouseProduct> findAllProducts() throws Exception;
	
	public void addProduct(WareHouseProduct product) throws Exception;
	

	
	public void delProduct(int pid) throws Exception;

	
	public void updateProduct(WareHouseProduct product, MultipartFile pimage, String rootPath) throws Exception;



	/**
	 * @author lzy
	 * 判断还有没有货物
	 * @return true 还有货 false 没有货物了
	 */
	public boolean checkNum(int id,int need)throws Exception;
	/**
	 * @author lzy
	 * 减少库存
	 */
	public void decNum(int id,int need) throws Exception;

	public  Product findOneOrderProduct(int id) throws Exception;


	public List<Product> findAllOrderProduct() throws Exception;

	public void delOrderProduct(int pid) throws Exception;

	public void updateOrderProduct(Product product) throws Exception;
}
