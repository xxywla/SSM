package com.xxyw.spring.controller;

import com.xxyw.spring.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class UserController {
    @Autowired
    private UserService userService;

    public void saveUser() {
        userService.saveUser();
        System.out.println("controller层调用service成功");
    }
}
