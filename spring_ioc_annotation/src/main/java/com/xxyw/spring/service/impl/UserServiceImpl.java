package com.xxyw.spring.service.impl;

import com.xxyw.spring.dao.UserDAO;
import com.xxyw.spring.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDAO userDAO;

    @Override
    public void saveUser() {
        userDAO.saveUser();
        System.out.println("Service层调用DAO层成功");
    }
}
