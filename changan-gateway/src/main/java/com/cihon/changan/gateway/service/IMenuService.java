package com.cihon.changan.gateway.service;

import com.cihon.changan.common.model.vo.TMenu;

import java.util.List;

public interface IMenuService {


    /** 获取menu 对象*/
    public List<TMenu> getMenu(Integer roleId);
}
