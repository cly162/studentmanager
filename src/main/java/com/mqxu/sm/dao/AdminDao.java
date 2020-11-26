package com.mqxu.sm.dao;

import com.mqxu.sm.entity.Admin;

import java.sql.SQLException;

/**
 * @ClassName Student
 * @Description :管理员接口
 * @Author mqxu
 * @Date 2020/10/29
 **/
public interface AdminDao {
    /**
     * 根据账号查找管理员
     *
     * @param account:账号入参
     * @return Admin:管理员信息
     * @throws SQLException:该方法会弹出SQL异常
     */
    Admin findAdminByAccount(String account) throws SQLException;
}




