package com.cihon.changan.gateway.service.impl;

import com.cihon.changan.common.dao.TRoleMapper;
import com.cihon.changan.common.model.vo.TRole;
import com.cihon.changan.gateway.service.IRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@SuppressWarnings("SpringJavaInjectionPointsAutowiringInspection")
@Service
@Transactional(rollbackFor = {RuntimeException.class})
public class RoleServiceImpl implements IRoleService {

    @Autowired
    private TRoleMapper roleMapper;


    @Override
    public TRole findByRoleID(Integer roleId) {
        return roleMapper.selectByRoleId(roleId);
    }
}
