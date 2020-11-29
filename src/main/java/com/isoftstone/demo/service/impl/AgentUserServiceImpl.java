package com.isoftstone.demo.service.impl;

import com.isoftstone.demo.dao.AgentUserDao;
import com.isoftstone.demo.pojo.AgentUser;
import com.isoftstone.demo.service.AgentUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;

@SuppressWarnings("ALL")
@Service
public class AgentUserServiceImpl implements AgentUserService {

    @Autowired
    private AgentUserDao agentUserDao;

    @Override
    public AgentUser login(String username, String password) throws Exception {
        HashMap<String, Object> map = new HashMap<String,Object>();
        map.put("username", username);
        map.put("password", password);
        return agentUserDao.getUserByNameAndPassword(map);
    }
}
