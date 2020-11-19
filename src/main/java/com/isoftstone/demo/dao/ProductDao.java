package com.isoftstone.demo.dao;

import com.isoftstone.demo.pojo.Product;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;


public interface ProductDao {

	public List<Product> findAll() throws Exception;
	
	public void insert(Product product) throws Exception;
	
	public List<Product> findPages(Map<String, Object> map) throws Exception;
	
	public void delete(int id) throws Exception;
	
	public Product findOne(int id) throws Exception;
	
	public void update(Product product) throws Exception;
}
