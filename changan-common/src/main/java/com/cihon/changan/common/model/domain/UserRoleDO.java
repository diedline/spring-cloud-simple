package com.cihon.changan.common.model.domain;

import lombok.Data;

import java.io.Serializable;

/**
 * 用户角色
 *
 * @author zouyutang
 * @date 2018/8/30
 * @package com.cihon.common.model.domain
 */
@Data
public class UserRoleDO implements Serializable {
    /**
     * 主键ID
     */
    private Long id;

    /**
     * 用户ID
     */
    private Long userId;

    /**
     * 角色ID
     */
    private Long roleId;
}
