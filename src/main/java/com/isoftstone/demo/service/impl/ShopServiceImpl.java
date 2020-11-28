package com.isoftstone.demo.service.impl;

import com.isoftstone.demo.dao.ShopDao;
import com.isoftstone.demo.pojo.Shop;
import com.isoftstone.demo.service.ShopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@SuppressWarnings("ALL")
@Service
public class ShopServiceImpl implements ShopService {

    @Autowired
    private ShopDao shopDao;

    @Override
    public List<Shop> getShopsByAgentId(int id) throws Exception {
        return shopDao.getShopsByAgentId(id);
    }
}
