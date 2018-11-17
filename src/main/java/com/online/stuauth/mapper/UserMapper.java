package com.online.stuauth.mapper;

import com.online.stuauth.entity.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface UserMapper {

    @Insert("INSERT INTO user (`phone`, `password`, `name`, `identity`) VALUES (#{phone},#{pwd},#{name},#{identity})")
    int register(@Param("phone") String phone, @Param("pwd") String pwd, @Param("name") String name, @Param("identity") String identity);

    @Select("SELECT * FROM user WHERE `phone`=#{phone}")
    User regQueryPhone(@Param("phone") String key);

    @Select("SELECT * FROM user WHERE `identity`=#{identity}")
    User regQueryName(@Param("identity") String identity);

    @Select("SELECT * FROM user WHERE `phone`=#{phone} AND `password`=#{pwd}")
    User queryLogin(@Param("phone") String phone, @Param("pwd") String pwd);
}
