package com.isoftstone.demo.service;

import com.isoftstone.demo.pojo.WareHouseProduct;

import java.util.List;

public interface WareHouseProductService {

    public List<WareHouseProduct> getWarehouseProductById(int id) throws Exception;
}
