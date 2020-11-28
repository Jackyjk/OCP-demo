package com.isoftstone.demo.service.impl;

import com.isoftstone.demo.dao.WareHouseDao;
import com.isoftstone.demo.pojo.WareHouse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@SuppressWarnings("ALL")
@Service
public class WareHouseService implements com.isoftstone.demo.service.WareHouseService {

    @Autowired
    private WareHouseDao wareHouseDao;

    @Override
    public List<WareHouse> getAllWareHouse() throws Exception {
        List<WareHouse> allWareHouse = wareHouseDao.getAllWareHouse();
        return allWareHouse;
    }
}
