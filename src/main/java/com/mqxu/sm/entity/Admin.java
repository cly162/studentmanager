package com.mqxu.sm.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
/**
 * @ClassName Student
 * @Description Admin实体类
 * @Author mqxu
 * @Date 2020/10/29
 **/

    @Data
    @AllArgsConstructor
    @NoArgsConstructor
    @Builder
    public class Admin {
        private Integer id;
        private String account;
        private String password;
        private String adminName;

    }
