package com.online.stuauth.service;

import com.online.stuauth.entity.User;
import com.online.stuauth.mapper.UserMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class UserService {
    @Resource
    private UserMapper userMapper;

    public User user(String phone,String password){
        User user;
        user=userMapper.find(phone,password);
        return user;
    }

}
