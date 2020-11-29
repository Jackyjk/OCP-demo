package com.isoftstone.demo.service.impl;

import com.isoftstone.demo.dao.WareHouseProductDao;
import com.isoftstone.demo.pojo.WareHouseProduct;
import com.isoftstone.demo.service.WareHouseProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@SuppressWarnings("ALL")
@Service
public class WareHouseProductServiceImpl implements WareHouseProductService {

    @Autowired
    private WareHouseProductDao wareHouseProductDao;

    @Override
    public List<WareHouseProduct> getWarehouseProductById(int id) throws Exception {
        return wareHouseProductDao.getWarehouseProductById(id);
    }
}
