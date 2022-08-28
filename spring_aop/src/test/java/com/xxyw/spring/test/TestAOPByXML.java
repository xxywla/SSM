package com.xxyw.spring.test;

import com.xxyw.spring.aop.xml.Calculator;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestAOPByXML {
    @Test
    public void test() {
        ApplicationContext ioc = new ClassPathXmlApplicationContext("spring_aop_xml.xml");
        Calculator calculator = ioc.getBean(Calculator.class);
        System.out.println(calculator.add(1, 2));
    }
}
