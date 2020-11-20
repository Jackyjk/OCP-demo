package com.isoftstone.demo.common.exception;

public class OrderStatusException extends Exception{

    private String msg;

    public OrderStatusException(String msg) {
        this.msg = msg;
    }

    public String getMsg() {
        return msg;
    }
}
