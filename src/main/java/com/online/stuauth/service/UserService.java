package com.online.stuauth.service;

import com.alibaba.fastjson.JSONObject;
import com.online.stuauth.entity.User;
import com.online.stuauth.mapper.UserMapper;
import com.online.stuauth.util.Msg;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;

@Service
public class UserService {
    @Resource
    private UserMapper userMapper;

    public Msg register(String data){
        JSONObject obj = JSONObject.parseObject(data);
        if (userMapper.regQueryPhone(obj.getString("phone")) != null) {
            return Msg.err("手机号已存在");
        } else if (userMapper.regQueryName(obj.getString("idcode")) != null) {
            return Msg.err("身份证号已注册");
        } else {
            userMapper.register(obj.getString("phone"), obj.getString("pwd"),
                    obj.getString("name"), obj.getString("idcode"));
            return Msg.ok("success");
        }

    }

    public Msg signIn(String phone, String password){
        User user = userMapper.queryLogin(phone, password);
        if (user == null) {
            return Msg.err("Login error");
        } else return Msg.ok("success", user);
    }
}
