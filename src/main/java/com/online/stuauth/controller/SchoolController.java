package com.online.stuauth.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by michaelod on 2018/11/18.
 */
@RequestMapping("/school")
@RestController
public class SchoolController {

    @RequestMapping("/highSchool")
    public String highSchool(){
        return "山东师范大学附属中学幸福柳校区-苏州外国语学校-苏州新草桥中学-石家庄第二十四中学-石家庄外国语学校-" +
                "石家庄第二中学-陕西师范大学附属中学-江苏省黄埭中学-深圳科学高中-成都石室天府中学-成都七中万达学校" +
                "-杭州师范大学附属中学-";
    }

    @RequestMapping("/college")
    public String college(){
        return "复旦大学-同济大学-上海交通大学-华东师范大学-华东理工大学-东华大学-上海中医药大学-上海外国语大学-" +
                "上海财经大学-上海大学-山东大学-南京理工大学-南京大学-";

    }

    @RequestMapping("/otherSchool")
    public String otherSchool(){
        return "益阳劳动职业中专学校-潮州湘桥区虹桥职业中学-广州轻工职业学校-广州盲人中等职业学校-广州旅游职业学校-" +
                "广州黄埔职业技术学校-广州花都理工职业技术学校-广州工艺美术职业高级中学-广州番禺新造职业技术学校-" +
                "广州番禺纪元职业技术学校-广州涉外经济职业技术学院（中专部）";
    }
}
