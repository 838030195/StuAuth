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
    public Msg register(@RequestParam("phone")String phone,@RequestParam("idcode") String idcode,
                        @RequestParam("name") String name,@RequestParam("pwd")String pwd){
        System.out.println(name);
        return userService.register(phone,idcode,name,pwd);
    }

    @RequestMapping("/signIn")
    public Msg signIn(@RequestParam("phone")String phone, @RequestParam("pwd") String password){

        return userService.signIn(phone,password);
    }

    @RequestMapping("/update")
    public Msg userupdate(@RequestParam("diploma")String diploma,@RequestParam("attendTime")String attendTime,
                          @RequestParam("leaveTime")String leaveTime,@RequestParam("school")String school,
                          @RequestParam("id")String id){

        return userService.userupdate(diploma,attendTime,leaveTime,school,Integer.parseInt(id));
    }

}
