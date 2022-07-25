package com.xxyw.mybatis.mapper;

import com.xxyw.mybatis.pojo.User;

import java.util.List;

public interface UserMapper {
    // 添加用户信息
    int insertUser();

    // 修改用户信息
    void updateUser();

    // 删除用户信息
    void deleteUser();

    // 根据 id 查询用户信息
    User getUserById();

    // 查询所有用户信息
    List<User> getAllUser();
}
