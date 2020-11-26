package service;

import entity.Department;

import java.util.List;

/**
 * @ClassName DepartmentService
 * @Description TODO
 * @Author yoRoll.z
 * @Date 2020/11/21
 **/

public interface DepartmentService {
    /**
     *
     * 查询所有院系
     * @return List<Department></>
     */
    List<Department> selectAll();
}
