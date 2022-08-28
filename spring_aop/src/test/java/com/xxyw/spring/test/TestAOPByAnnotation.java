package com.xxyw.spring.test;

import com.xxyw.spring.aop.annotation.Calculator;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestAOPByAnnotation {
    @Test
    public void test1() {
        ApplicationContext ioc = new ClassPathXmlApplicationContext("spring_aop_annotation.xml");
        Calculator calculator = ioc.getBean(Calculator.class);
        calculator.add(1, 2);
    }

    @Test
    public void test2() {
        ApplicationContext ioc = new ClassPathXmlApplicationContext("spring_aop_annotation.xml");
        Calculator calculator = ioc.getBean(Calculator.class);
        calculator.div(1, 0);
    }
}
