package com.cihon.changan.gateway.service.impl;

import com.cihon.changan.common.dao.TAuthMenuMapper;
import com.cihon.changan.common.dao.TMenuMapper;
import com.cihon.changan.common.model.vo.TMenu;
import com.cihon.changan.gateway.service.IMenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@SuppressWarnings("ALL")
@Service
public class MenuServiceImpl implements IMenuService {

    @Autowired
    TAuthMenuMapper tAuthMenuMapper;

    @Autowired
    TMenuMapper tMenuMapper;



    @Override
    public List<TMenu> getMenu(Integer roleId) {
        return tMenuMapper.getMenu(tAuthMenuMapper.getMenuId(roleId));
    }
}
