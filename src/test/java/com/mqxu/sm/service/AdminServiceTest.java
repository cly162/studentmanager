package com.mqxu.sm.service;

import com.mqxu.sm.factory.ServiceFacotry;
import com.mqxu.sm.utils.ResultEntity;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @ClassName Student
 * @Description TODO
 * @Author yoRoll.z
 * @Date 2020/10/29
 **/
public class AdminServiceTest {
private final AdminService adminService= ServiceFacotry.getAdminServiceInstance();
    @Test
    public void adminLogin() {
        ResultEntity resultEntity=adminService.adminLogin("cly@qq.com","1621592369");
        assertEquals(0,resultEntity.getCode());
        System.out.println(resultEntity);

    }
}