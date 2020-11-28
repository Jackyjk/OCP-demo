package com.isoftstone.demo.service;

import com.isoftstone.demo.dao.ShopDao;
import com.isoftstone.demo.pojo.Shop;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

public interface ShopService {
    public List<Shop> getShopsByAgentId(int id) throws Exception;
}
