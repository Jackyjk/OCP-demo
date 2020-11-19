package com.isoftstone.demo.service;


import com.isoftstone.demo.pojo.User;

public interface UserService {
	
	public User login(String username, String password) throws Exception;

}
