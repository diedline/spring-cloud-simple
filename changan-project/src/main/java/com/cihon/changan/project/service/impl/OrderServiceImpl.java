package com.cihon.changan.project.service.impl;

import com.cihon.changan.common.dao.AccountInfMapper;
import com.cihon.changan.common.dao.CommodityTypesMapper;
import com.cihon.changan.common.dao.OrderDetailsMapper;
import com.cihon.changan.common.model.vo.*;
import com.cihon.changan.project.model.Order;
import com.cihon.changan.project.service.IOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@SuppressWarnings("ALL")
@Service
@Transactional(rollbackFor = {RuntimeException.class})
public class OrderServiceImpl implements IOrderService {

    @Autowired
    OrderDetailsMapper orderDetailsMapper;

    @Autowired
    CommodityTypesMapper commodityTypesMapper;

    @Autowired
    AccountInfMapper accountInfMapper;


    @Override
    public List<Order> getAllOrder() {
        // 获取所有订单
        OrderDetailsExample orderDetailsExample = new OrderDetailsExample();
        List<OrderDetails> list = orderDetailsMapper.selectByExample(orderDetailsExample);
        List<Order> orderList = new ArrayList<>();
        for (OrderDetails orderDetails : list
        ) {
            Order order = new Order();
            //设置订单号
            order.setOrderNum(orderDetails.getOrderNumber());
            //设置商品Id
            order.setCommoditId(orderDetails.getCommoditId());
            //设置商品名
            CommodityTypes commodityTypes = commodityTypesMapper.selectByPrimaryKey(orderDetails.getCommoditId());
            order.setTrade_name(commodityTypes.getTradeName());
            //设置商品类型
            order.setType(commodityTypes.getType());
            //设置商品数量
            order.setNum(orderDetails.getNumber());
            //购买人姓名
            AccountInf accountInf = accountInfMapper.selectByPrimaryKey(orderDetails.getId());
            order.setUser(accountInf.getZhifubaoname());

            orderList.add(order);
        }
        return orderList;
    }

    @Override
    public int countOrder(int id) {
        OrderDetailsExample orderDetailsExample = new OrderDetailsExample();
        OrderDetailsExample.Criteria criteria = orderDetailsExample.createCriteria();
        criteria.andIdEqualTo(id);
        List<OrderDetails> orderDetails = orderDetailsMapper.selectByExample(orderDetailsExample);
        return orderDetails.size();
    }
}
