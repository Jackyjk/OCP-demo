package com.isoftstone.demo.dao;

import com.isoftstone.demo.pojo.AgentUser;

import java.util.Map;

public interface AgentUserDao {

    /**
     * 根据名称和密码查询经销商用户
     * @param map
     * @return
     */
    public AgentUser getUserByNameAndPassword(Map<String, Object> map);
}
