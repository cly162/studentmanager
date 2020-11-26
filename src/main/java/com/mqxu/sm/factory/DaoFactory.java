package com.mqxu.sm.factory;

import com.mqxu.sm.dao.DepartmentDao;
import com.mqxu.sm.dao.impl.DepartmentDaoImpl;
import com.mqxu.sm.dao.impl.AdminDaoImpl;

/**
 * @ClassName Student
 * @Description :工厂类
 * @Author :mqxu
 * @Date 2020/10/29
 **/
public class DaoFactory {
    /**
     * 获得AdminDao实例
     *
     * @return AdminDao实例
     */
    public static AdminDaoImpl getAdminDaoInstance(){
        return new AdminDaoImpl();
    }

    public static DepartmentDao getDepartmentDaoInstance() {
        return  new DepartmentDaoImpl();
    }
}
