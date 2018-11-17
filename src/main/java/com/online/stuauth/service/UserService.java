package com.online.stuauth.service;

import com.online.stuauth.entity.User;
import com.online.stuauth.mapper.UserMapper;
import com.online.stuauth.util.Msg;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;

@Service
public class UserService {
    @Resource
    private UserMapper userMapper;

    public Msg register(String data, MultipartFile[] files){

        return null;
    }

    public Msg signIn(String phone, String password){

        return null;
    }
}
