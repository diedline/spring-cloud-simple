package com.cihon.changan.project.service.impl;

import com.cihon.changan.common.dao.AccountInfMapper;
import com.cihon.changan.common.model.vo.AccountInf;
import com.cihon.changan.project.model.Order;
import com.cihon.changan.project.model.StatisticalPara;
import com.cihon.changan.project.service.IStatisticalService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class StatisricalServiceImpl implements IStatisticalService {

    @Autowired
    UserServiceImpl userService;

    @Autowired
    OrderServiceImpl orderService;



    @Override
    public List<StatisticalPara> getAllPara() {
        List<AccountInf> orderList = userService.getAccount();
        //先获取所有用户，在根据用户每个Id获取对应用户的订单数量，好友数，好友订单数，
//        orderService.getAllOrder(orderList);


        return null;
    }
}
