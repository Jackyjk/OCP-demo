package com.isoftstone.demo.service;

import com.isoftstone.demo.common.exception.OrderStatusException;
import com.isoftstone.demo.pojo.Order;


public interface OrderService {
    Order findById(int id);

    void updateStatus(int statusCode, int id) throws OrderStatusException;
}
