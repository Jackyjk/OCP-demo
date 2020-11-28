package com.isoftstone.demo.dao;


public interface DepartmentDao {
    /**
     * 根据id查询事业部名称
     * @param id
     * @return
     */
    public String getDepartmentNameById(int id) throws Exception;
}
