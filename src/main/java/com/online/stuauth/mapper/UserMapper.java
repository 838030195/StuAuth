package com.online.stuauth.mapper;

import com.online.stuauth.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface UserMapper {

    @Select("select * from user where phone = #{phone} && password = #{password}")
    public User find(@Param("phone") String phone,@Param("password") String password);



}
