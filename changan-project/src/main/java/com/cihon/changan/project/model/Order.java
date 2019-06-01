package com.cihon.changan.project.model;

import lombok.Data;

@Data
public class Order {

    /** 订单号*/
    private Integer orderNum;

    /** 商品id*/
    private Integer commoditId;

    /** 商品名*/
    private String Trade_name;

    /** 商品类型*/
    private String type;

    /** 商品数量*/
    private Integer num;

    /** 购买人姓名*/
    private String user;

}
