package com.isoftstone.demo.service.impl;

import com.isoftstone.demo.pojo.Shop;
import com.isoftstone.demo.service.ShopService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class ShopServiceImplTest {

    @Autowired
    private ShopService shopService;

    @Test
    public void testGetShopsByAgentId() throws Exception {
        List<Shop> shops = shopService.getShopsByAgentId(2);
        System.out.println(shops);
    }
}