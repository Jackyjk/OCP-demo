package com.isoftstone.demo.service.impl;

import com.isoftstone.demo.dao.DepartmentDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@SuppressWarnings("ALL")
@Service
public class DepartmentService implements com.isoftstone.demo.service.DepartmentService {

    @Autowired
    private DepartmentDao departmentDao;

    @Override
    public String getDepartmentNameById(int id) throws Exception {
        return departmentDao.getDepartmentNameById(id);
    }
}
