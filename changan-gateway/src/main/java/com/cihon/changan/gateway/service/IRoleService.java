package com.cihon.changan.gateway.service;

import com.cihon.changan.common.model.vo.TRole;

public interface IRoleService {
    /**
     * 通过user 的 role_id 获取角色对象
     * */
    public TRole findByRoleID(Integer roleId);
}
