package com.isoftstone.demo.dao;

import com.isoftstone.demo.pojo.WareHouseProduct;

import java.util.List;

public interface WareHouseProductDao {

    /**
     * 根据仓库id查询仓库商品列表
     * @param id
     * @return
     */
    public List<WareHouseProduct> getWarehouseProductById(int id) throws Exception;
}
