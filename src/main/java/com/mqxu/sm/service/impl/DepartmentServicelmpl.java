package com.mqxu.sm.service.impl;

import com.mqxu.sm.dao.DepartmentDao;
import entity.Department;
import com.mqxu.sm.factory.DaoFactory;
import service.DepartmentService;

import java.sql.SQLException;
import java.util.List;

/**
 * @ClassName DepartmentServicelmpl
 * @Description TODO
 * @Author yoRoll.z
 * @Date 2020/11/21
 **/

public class DepartmentServicelmpl implements DepartmentService {
    private final DepartmentDao departmentDao = DaoFactory.getDepartmentDaoInstance();

    @Override
    public List<Department> selectAll() {

        List<Department> departmentList = null;
        try {
            departmentList = departmentDao.getAll();
            {
            }
        } catch (SQLException e) {
            System.out.println("查询院系信息出现异常");
        }
      return  departmentList;
    }
}

