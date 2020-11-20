package com.isoftstone.demo.service.impl;

import com.isoftstone.demo.common.exception.OrderStatusException;
import com.isoftstone.demo.dao.OrderDao;
import com.isoftstone.demo.pojo.Order;
import com.isoftstone.demo.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.HashMap;
import java.util.Map;

public class OrderServiceImpl implements OrderService {

    @Autowired
    private OrderDao orderDao;

    @Override
    public Order findById(int id) {
        return orderDao.findById(id);
    }

    @Override
    public void updateStatus(int statusCode, int id) throws OrderStatusException{
        if(null == findById(id)) {
            throw new OrderStatusException("Order not exist.");
        }
        if(statusCode < 0 || statusCode > 8) {
            throw new OrderStatusException("Order status is illegal.");
        }
        Map<String, Integer> status = new HashMap<>();
        status.put("statusCode", statusCode);
        status.put("id", id);
        orderDao.updateStatus(status);
    }
}
