package com.cihon.changan.project.controller;


import com.cihon.changan.common.model.dto.R;
import com.cihon.changan.project.service.IOrderService;
import com.cihon.changan.project.service.IStatisticalService;
import com.cihon.changan.project.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("index")
public class UserController {

    @Autowired
    IUserService userService;

    @Autowired
    IOrderService orderService;

    @Autowired
    IStatisticalService statisticalService;

    @RequestMapping("getAllUser")
    public R getAllUser(){
        R r = new R();
        r.setCode(0);
        r.setData(userService.getAccount());
        return r;
    }

    @RequestMapping("getAllOrder")
    public R getAllOrder(){
        R r= new R();
        r.setCode(0);
        r.setData(orderService.getAllOrder());
        return r;
    }


    @RequestMapping("getAllStatistical")
    public R getAllStatistical(){
        R r= new R();
        r.setCode(0);
        r.setData(statisticalService.getAllPara());
        return r;
    }

}
