package com.xxyw.spring.dao.impl;

import com.xxyw.spring.dao.UserDAO;
import org.springframework.stereotype.Repository;

@Repository
public class UserDAOImpl implements UserDAO {
    @Override
    public void saveUser() {
        System.out.println("DAO层保存成功");
    }
}
