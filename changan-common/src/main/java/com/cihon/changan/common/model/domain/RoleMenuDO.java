package com.cihon.changan.common.model.domain;

import lombok.Data;

import java.io.Serializable;

/**
 * 角色菜单
 *
 * @author zouyutang
 * @date 2018/10/16
 * @package com.cihon.common.model.domain
 */
@Data
public class RoleMenuDO implements Serializable {
    /**
     * 主键ID
     */
    private Long id;

    /**
     * 菜单ID
     */
    private Long menuId;

    /**
     * 角色ID
     */
    private Long roleId;
}
