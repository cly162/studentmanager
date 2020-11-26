package com.mqxu.sm.factory;

import com.mqxu.sm.service.AdminService;
import com.mqxu.sm.service.impl.AdminServiceImpl;

/**
 * @ClassName ServiceFacotry
 * @Description TODO
 * @Author yoRoll.z
 * @Date 2020/11/20
 **/

public class ServiceFacotry {
    public static AdminService getAdminServiceInstance(){

        return new AdminServiceImpl();
    }
}
