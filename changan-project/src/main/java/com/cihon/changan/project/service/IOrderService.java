package com.cihon.changan.project.service;

import com.cihon.changan.project.model.Order;

import java.util.List;

public interface IOrderService {

    /** 获取所有的订单信息*/
    List<Order> getAllOrder();


    /** 根据id获取该用户所有的订单数*/
    int countOrder(int id);
}
