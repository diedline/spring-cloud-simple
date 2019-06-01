package com.cihon.changan.gateway.service;


import com.cihon.changan.common.model.vo.TUser;


public interface IUserService {

    /**
     *      通过工号获取用户对象
     * @param jobNum    工号
     * @return {@link TUser}
     * */
    public TUser findByJobNum(String jobNum);

    /**
     *      首次登录更新密码
     * @param user {@link TUser}
     * */
    public int updatePwd(TUser user);
}
