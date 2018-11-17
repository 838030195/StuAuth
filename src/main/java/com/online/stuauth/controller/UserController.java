package com.online.stuauth.controller;

import com.alibaba.fastjson.JSONObject;
import com.online.stuauth.entity.User;
import com.online.stuauth.service.UserService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.Map;

@RestController
public class UserController {

    @Resource
    private UserService service;

    @PostMapping("")
    public JSONObject user(@RequestParam Map<String,String> map){
        String phone = map.get("phone");
        String password = map.get("pwd");
        User user = service.user(phone,password);
        JSONObject jsonObject = new JSONObject();
        if (user!=null){
            jsonObject.put("message","success");
            jsonObject.put("data",user);
        }
        else jsonObject.put("message","fail");
        return jsonObject;
    }

    @PostMapping()
    public JSONObject Reg(@RequestParam Map<String,String> map){
        return null;
    }

}
