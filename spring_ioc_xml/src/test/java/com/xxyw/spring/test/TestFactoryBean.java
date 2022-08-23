package com.xxyw.spring.test;

import com.xxyw.spring.pojo.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestFactoryBean {
    @Test
    public void test() {
        ApplicationContext ioc = new ClassPathXmlApplicationContext("spring_factory.xml");
        User user = ioc.getBean(User.class);
        System.out.println(user);
    }
}
