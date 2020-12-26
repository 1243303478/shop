package com.atzy.shop.gmailums.controller;

import com.atzy.shop.beans.UserInfo;
import com.atzy.shop.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserInfoController {

    @Autowired
    UserInfoService userInfoService;

    @RequestMapping("findAllUser")
    public List<UserInfo> findAllUser(){
        List<UserInfo> userList = userInfoService.getUserInfoList();
        return userList;
    }

}
