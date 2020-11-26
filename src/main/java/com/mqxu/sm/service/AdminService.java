package com.mqxu.sm.service;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import com.mqxu.sm.utils.ResultEntity;

/**
 * @ClassName AdminService
 * @Description TODO
 * @Author yoRoll.z
 * @Date 2020/11/19
 **/

public interface AdminService {
    /**
     * 管理员登录
     *
     * @param account :账号
     * @param password；密码
     * @return ResultEntity:返回结果
     */
     ResultEntity adminLogin(String account, String password);
}
