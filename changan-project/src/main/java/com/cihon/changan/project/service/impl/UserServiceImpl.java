package com.cihon.changan.project.service.impl;

import com.cihon.changan.common.dao.AccountInfMapper;
import com.cihon.changan.common.model.vo.AccountInf;
import com.cihon.changan.common.model.vo.AccountInfExample;
import com.cihon.changan.project.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;


@SuppressWarnings("ALL")
@Service
@Transactional(rollbackFor = {RuntimeException.class})
public class UserServiceImpl implements IUserService {

    @Autowired
    AccountInfMapper accountInfMapper;

    @Override
    public List<AccountInf> getAccount() {

        AccountInfExample accountInfExample = new AccountInfExample();
        AccountInfExample.Criteria criteria = accountInfExample.createCriteria();
        return accountInfMapper.selectByExample(accountInfExample);
    }




}
