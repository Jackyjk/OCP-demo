package com.isoftstone.demo.service.impl;

import com.isoftstone.demo.pojo.AgentUser;
import com.isoftstone.demo.service.AgentUserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class AgentUserServiceImplTest {

    @Autowired
    private AgentUserService agentUserService;

    @Test
    void login() throws Exception {
        AgentUser login = agentUserService.login("a", "a");
        System.out.println(login);
    }
}