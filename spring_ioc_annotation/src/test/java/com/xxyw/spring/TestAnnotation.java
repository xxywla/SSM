package com.xxyw.spring;

import com.xxyw.spring.controller.UserController;
import com.xxyw.spring.dao.UserDAO;
import com.xxyw.spring.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestAnnotation {
    @Test
    public void test() {
        ApplicationContext ioc = new ClassPathXmlApplicationContext("spring_ioc_annotation.xml");

        UserController userController = ioc.getBean(UserController.class);
        System.out.println(userController);

        UserService userService = ioc.getBean(UserService.class);
        System.out.println(userService);

        UserDAO userDAO = ioc.getBean(UserDAO.class);
        System.out.println(userDAO);
    }

    @Test
    public void test2() {
        ApplicationContext ioc = new ClassPathXmlApplicationContext("spring_ioc_annotation.xml");

        UserController userController = ioc.getBean(UserController.class);
        userController.saveUser();
    }
}
