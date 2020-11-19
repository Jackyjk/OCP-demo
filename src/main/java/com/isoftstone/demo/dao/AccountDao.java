package com.isoftstone.demo.dao;

import com.isoftstone.demo.pojo.User;

import java.util.Map;

public interface AccountDao {
	
	public User findUserByNameAndPass(Map<String, Object> map);
	
}
