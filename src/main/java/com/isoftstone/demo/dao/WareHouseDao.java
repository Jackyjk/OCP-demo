package com.isoftstone.demo.dao;

import com.isoftstone.demo.pojo.WareHouse;

import java.util.List;

public interface WareHouseDao {

    public List<WareHouse> getAllWareHouse(int id) throws Exception;
}
