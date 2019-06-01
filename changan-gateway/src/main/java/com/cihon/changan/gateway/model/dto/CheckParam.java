package com.cihon.changan.gateway.model.dto;


import lombok.Data;

/**
 *  校验参数
 * */
@Data
public class CheckParam {
    /** 判断是否是第一次登录*/
    private Boolean isFirst;

    /**  判断是否是管理员*/
    private Boolean isAdmin;
}
