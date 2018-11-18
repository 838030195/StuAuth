package com.online.stuauth.mapper;

import com.online.stuauth.entity.User;
import org.apache.ibatis.annotations.*;

@Mapper
public interface UserMapper {

    @Options(useGeneratedKeys = true, keyProperty = "id")
    @Insert("INSERT INTO user (`phone`, `password`, `name`, `identity`) VALUES (#{phone},#{pwd},#{name},#{identity})")
    void register(@Param("phone") String phone, @Param("pwd") String pwd, @Param("name") String name, @Param("identity") String identity);

    @Select("SELECT * FROM user WHERE `phone`=#{phone}")
    User regQueryPhone(@Param("phone") String key);

    @Select("SELECT * FROM user WHERE `identity`=#{identity}")
    User regQueryName(@Param("identity") String identity);

    @Select("SELECT * FROM user WHERE `phone`=#{phone} AND `password`=#{pwd}")
    User queryLogin(@Param("phone") String phone, @Param("pwd") String pwd);

    @Update("UPDATE user SET diploma=#{diploma},attend_date=#{attendTime},leave_date=#{leaveTime},school=#{school} WHERE id=#{id}")
    int update(@Param("diploma")String diploma,@Param("attendTime")String attendTime,
                @Param("leaveTime")String leaveTime,@Param("school")String school,@Param("id")int id);
}
