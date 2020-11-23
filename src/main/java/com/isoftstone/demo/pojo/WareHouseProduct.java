package com.isoftstone.demo.pojo;

public class WareHouseProduct {
    private int id;
    private String code;
    private String name;
    private String modelNumber;
    private String type;
    private int remainNumber;
    private int price;
    private int delFlag;
    private String createTime;
    private String updateTime;
    private WareHouse wareHouse;

    public WareHouseProduct() {
    }

    public WareHouseProduct(int id, String code, String name, String modelNumber, String type, int remainNumber, int price, int delFlag, String createTime, String updateTime, WareHouse wareHouse) {
        this.id = id;
        this.code = code;
        this.name = name;
        this.modelNumber = modelNumber;
        this.type = type;
        this.remainNumber = remainNumber;
        this.price = price;
        this.delFlag = delFlag;
        this.createTime = createTime;
        this.updateTime = updateTime;
        this.wareHouse = wareHouse;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getModelNumber() {
        return modelNumber;
    }

    public void setModelNumber(String modelNumber) {
        this.modelNumber = modelNumber;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getRemainNumber() {
        return remainNumber;
    }

    public void setRemainNumber(int remainNumber) {
        this.remainNumber = remainNumber;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getDelFlag() {
        return delFlag;
    }

    public void setDelFlag(int delFlag) {
        this.delFlag = delFlag;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public String getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }

    public WareHouse getWareHouse() {
        return wareHouse;
    }

    public void setWareHouse(WareHouse wareHouse) {
        this.wareHouse = wareHouse;
    }
}
