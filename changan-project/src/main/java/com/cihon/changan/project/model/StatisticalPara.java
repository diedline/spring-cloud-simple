package com.cihon.changan.project.model;


import lombok.Data;

@Data
public class StatisticalPara {

    /** 用户id*/
    private Integer id;

    /** 用户名*/
    private String username;

    /** 该用户的订单数*/
    private Integer myNum;

    /** 直接好友订单数*/
    private Integer directNum;

    /** 间接好友订单数*/
    private Integer indirectNum;




}
