package com.isoftstone.demo.pojo;

public class WareHouse {
    private int id;
    private String name;
    private String address;
    private String delFlag;
    private String createTime;
    private String updateTime;

    public WareHouse() {
    }

    public WareHouse(int id, String name, String address, String delFlag, String createTime, String updateTime) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.delFlag = delFlag;
        this.createTime = createTime;
        this.updateTime = updateTime;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getDelFlag() {
        return delFlag;
    }

    public void setDelFlag(String delFlag) {
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
}
