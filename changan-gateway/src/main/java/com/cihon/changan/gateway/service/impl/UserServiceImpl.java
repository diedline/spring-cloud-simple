package com.cihon.changan.gateway.service.impl;

import com.cihon.changan.common.dao.TUserMapper;
import com.cihon.changan.common.model.vo.TUser;
import com.cihon.changan.gateway.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;



@SuppressWarnings("SpringJavaInjectionPointsAutowiringInspection")
@Service
@Transactional(rollbackFor = {RuntimeException.class})
public class UserServiceImpl implements IUserService {

    @Autowired
    private TUserMapper tUserMapper;



    @Override
    public TUser findByJobNum(String jobNum) {
        return tUserMapper.selectByJobNum(jobNum);
    }

    @Override
    public int updatePwd(TUser user) {
        return tUserMapper.updatePwd(user);
    }


}
