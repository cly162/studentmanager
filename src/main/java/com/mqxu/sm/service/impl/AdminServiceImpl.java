package com.mqxu.sm.service.impl;

import com.mqxu.sm.dao.AdminDao;
import com.mqxu.sm.entity.Admin;
import com.mqxu.sm.factory.DaoFactory;
import com.mqxu.sm.service.AdminService;
import com.mqxu.sm.utils.ResultEntity;
import com.mqxu.sm.dao.AdminDao;
import com.mqxu.sm.entity.Admin;
import com.mqxu.sm.factory.DaoFactory;
import org.apache.commons.codec.digest.DigestUtils;
import com.mqxu.sm.service.AdminService;
import com.mqxu.sm.utils.ResultEntity;

import java.sql.SQLException;

/**
 * @ClassName AdminServiceImpl
 * @Description TODO
 * @Author yoRoll.z
 * @Date 2020/11/20
 **/

public class AdminServiceImpl implements AdminService {
    private final AdminDao adminDao = DaoFactory.getAdminDaoInstance();
   @Override
    public ResultEntity adminLogin(String account, String password) {
        ResultEntity resultEntity;
        Admin admin = null;
        try {
            admin = adminDao.findAdminByAccount(account);
        } catch (SQLException e) {
            System.out.println("根据账号查找管理员信息出现AQL异常");
        }
        if (admin != null) {
            if (DigestUtils.md5Hex(password).equals(admin.getPassword())) {
                resultEntity = ResultEntity.builder().code(0).message("登录成功").data(admin).build();

            } else {
                resultEntity = ResultEntity.builder().code(1).message("密码错误").build();
            }
            }
            else {
                resultEntity = ResultEntity.builder().code(2).message("账号不存在").build();
            }



        return resultEntity;
    }
}




