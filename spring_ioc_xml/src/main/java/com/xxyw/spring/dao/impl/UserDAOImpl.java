package com.xxyw.spring.dao.impl;

import com.xxyw.spring.dao.UserDAO;

public class UserDAOImpl implements UserDAO {
    @Override
    public void saveUser() {
        System.out.println("保存成功");
    }
}
