package com.isoftstone.demo.dao;

import com.isoftstone.demo.pojo.Order;

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
    void updateStatus(int status);

    /**
     * 上传附件
     */
    void uploadFile();

    /**
     * 更新订单时间
     */
    void updateTime();
}
