package com.xxyw.spring.test;

import com.xxyw.spring.controller.UserController;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestAutowire {
    @Test
    public void test() {
        ApplicationContext ioc = new ClassPathXmlApplicationContext("spring_autowire.xml");
        UserController userController = ioc.getBean(UserController.class);
        userController.saveUser();
    }
}
