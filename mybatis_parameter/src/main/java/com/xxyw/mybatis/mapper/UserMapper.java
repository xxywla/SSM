package com.xxyw.mybatis.mapper;

import com.xxyw.mybatis.pojo.User;
import org.apache.ibatis.annotations.Param;

import java.util.Map;

public interface UserMapper {
    User getUserByName(String userName);

    User checkLoginIn(String username, String password);

    User checkLoginByMap(Map<String, Object> map);

    void insertUser(User user);

    User checkLoginByParam(@Param("username") String username, @Param("password") String password);
}
