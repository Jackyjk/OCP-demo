package com.isoftstone.demo.service;

import com.isoftstone.demo.common.exception.OrderStatusException;
import com.isoftstone.demo.pojo.Order;


public interface OrderService {
    Order findById(int id);

    /**
     * 更新订单状态
     * @param statusCode
     * @param id
     * @throws OrderStatusException
     */
    void updateStatus(int statusCode, int id) throws OrderStatusException;
}
