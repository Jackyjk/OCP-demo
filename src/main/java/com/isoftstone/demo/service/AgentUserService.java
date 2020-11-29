package com.isoftstone.demo.service;

import com.isoftstone.demo.pojo.AgentUser;

public interface AgentUserService {

    public AgentUser login(String username, String password) throws Exception;
}
