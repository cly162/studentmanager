package com.mqxu.sm.dao;

import entity.Department;

import java.sql.SQLException;
import java.util.List;

/**
 * @ClassName DepartmentDao
 * @Description TODO
 * @Author yoRoll.z
 * @Date 2020/11/21
 **/

public interface DepartmentDao {
    /**
     * 查询所有院系
     *
     * @return List<Department>
     * @throws java.sql.SQLException 异常
     */
    List<Department> getAll() throws SQLException;
}
