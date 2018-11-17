package com.online.stuauth.controller;

import com.alibaba.fastjson.JSONObject;
import com.online.stuauth.entity.User;
import com.online.stuauth.service.UserService;
import com.online.stuauth.util.Msg;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import java.util.Map;

@RequestMapping("/user")
@RestController
public class UserController {

    @Resource
    private UserService userService;

    @RequestMapping("/register")
    public Msg register(@RequestParam("data")String data,@RequestParam("file") MultipartFile[] files){
        return userService.register(data,files);
    }

    @PostMapping("/signIn")
    public Msg signIn(@RequestParam("phone")String phone, @RequestParam("password") String password){

        return userService.signIn(phone,password);
    }




}
