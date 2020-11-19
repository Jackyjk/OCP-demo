package com.isoftstone.demo.service.impl;

import com.isoftstone.demo.dao.AccountDao;
import com.isoftstone.demo.pojo.User;
import com.isoftstone.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;


@SuppressWarnings("SpringJavaInjectionPointsAutowiringInspection")
@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	AccountDao ad;

	@Override
	public User login(String username, String password) throws Exception {
		HashMap<String, Object> map = new HashMap<String,Object>();
		map.put("username", username);
		map.put("password", password);
		return ad.findUserByNameAndPass(map);
	}
}
