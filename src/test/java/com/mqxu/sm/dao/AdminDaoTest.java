package com.mqxu.sm.dao;

import com.mqxu.sm.entity.Admin;
import com.mqxu.sm.factory.DaoFactory;
import org.junit.Test;

import java.sql.SQLException;

import static org.junit.Assert.*;

/**
 * @ClassName Student
 * @Description TODO
 * @Author yoRoll.z
 * @Date 2020/10/29
 **/
public class AdminDaoTest {
private  final AdminDao adminDao= DaoFactory.getAdminDaoInstance();
    @Test
    public void findAdminByAccount() {
        Admin admin;
        try {
            admin=adminDao.findAdminByAccount("taoranran@qq.com");


        } catch (SQLException e){
            System.err.println(e.getMessage());
        }
    }
}