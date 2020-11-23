package com.isoftstone.demo.dao;

import com.isoftstone.demo.pojo.Shop;

import java.util.List;

public interface ShopDao {
    /**
     * 根据经销商id查询经销商对应的所有店铺信息
     * @return
     * @throws Exception
     */
    public List<Shop> getShopsByAgentId(int id) throws Exception;
}
