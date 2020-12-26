package com.atzy.shop.gmailums.service.impl;

import com.atzy.shop.beans.UserInfo;
import com.atzy.shop.mapper.UserInfoMapper;
import com.atzy.shop.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class UserInfoServiceImpl implements UserInfoService {

    @Autowired
    UserInfoMapper userInfoMapper;

    @Override
    public List<UserInfo> getUserInfoList() {
        return userInfoMapper.selectAll();
    }
}
