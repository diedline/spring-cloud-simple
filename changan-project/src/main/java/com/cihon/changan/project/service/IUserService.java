package com.cihon.changan.project.service;

import com.cihon.changan.common.model.vo.AccountInf;

import java.util.List;

public interface IUserService {


    /**
     *  获取所有用户对象
     * */
    List<AccountInf> getAccount();
}
