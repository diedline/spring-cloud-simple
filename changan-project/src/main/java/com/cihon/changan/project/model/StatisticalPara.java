package com.cihon.changan.project.model;


import lombok.Data;

@Data
public class StatisticalPara {

    /** 用户id*/
    private String id;

    /** 用户名*/
    private String username;

    /** 直接好友订单数*/
    private Integer directNum;

    /** 间接好友订单数*/
    private Integer indirectNum;




}
