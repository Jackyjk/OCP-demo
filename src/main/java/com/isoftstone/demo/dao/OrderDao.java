package com.isoftstone.demo.dao;

import com.isoftstone.demo.pojo.Order;

import java.util.Map;

public interface OrderDao {
    /**
     * 查找订房
     * @param fid
     * @return
     */
    Order findById(int fid);

    /**
     * 更新订单状态
     * @param status
     */
    void updateStatus(Map<String, Integer> status);

    /**
     * 上传附件
     */
    void uploadFile();

    /**
     * 更新订单时间
     */
    void updateTime();
}
