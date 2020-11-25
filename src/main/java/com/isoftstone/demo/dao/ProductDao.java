package com.isoftstone.demo.dao;

import com.isoftstone.demo.pojo.Product;
import com.isoftstone.demo.pojo.WareHouseProduct;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;
import java.util.Map;


public interface ProductDao {

	public List<WareHouseProduct> findAll() throws Exception;
	
	public void insert(WareHouseProduct product) throws Exception;
	

	
	public void delete(int id) throws Exception;
	
	public WareHouseProduct findOne(int id) throws Exception;

	public void update(WareHouseProduct product) throws Exception;

	public Product findOrderOne(int id) throws Exception;

	public List<Product> findOrderAll() throws Exception;

	public void insertOrderProduct(Product product) throws Exception;

	public void deleteOrderProduct(int id) throws Exception;

	public void updateOderProduct(Product product) throws Exception;
}
