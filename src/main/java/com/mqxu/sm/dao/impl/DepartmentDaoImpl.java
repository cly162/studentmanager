package com.mqxu.sm.dao.impl;

import com.mqxu.sm.dao.DepartmentDao;
import entity.Department;
import com.mqxu.sm.utils.JdbcUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName DepartmentDaoImpl
 * @Description TODO
 * @Author yoRoll.z
 * @Date 2020/11/21
 **/

public  class DepartmentDaoImpl implements DepartmentDao {
    @Override
    public List<Department> getAll() throws SQLException {
        JdbcUtil jdbcUtil=JdbcUtil.getInitJdbcUtil();
        Connection connection=jdbcUtil.getConnection();
        String sql="SELECT*FROM t_department";
        PreparedStatement psmt=connection.prepareStatement(sql);
        ResultSet rs=psmt.executeQuery();
        List<Department> departmentList=new ArrayList<>();
        while (rs.next()){
            Department department=new Department();
            department.setId(rs.getInt("id"));
            department.setDepartmentName(rs.getString("department_name"));
            department.setLogo(rs.getString("logo"));
            departmentList.add(department);
        }
        rs.close();
        psmt.close();
        jdbcUtil.closeConnection();
        return departmentList;
    }
}
