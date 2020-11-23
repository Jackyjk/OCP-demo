package com.isoftstone.demo.service.impl;

import com.isoftstone.demo.dao.DepartmentDao;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;


@SpringBootTest
class DepartmentServiceTest {
    @Autowired
    private DepartmentDao departmentDao;

    @Test
    public void testGetNameById() throws Exception {
        String name = departmentDao.getDepartmentNameById(1);
        System.out.println(name);
    }
}