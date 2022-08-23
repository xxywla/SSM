package com.xxyw.spring.test;

import com.xxyw.spring.pojo.HelloWorld;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestHelloWorld {
    @Test
    public void testHelloWorld() {
        ApplicationContext ioc = new ClassPathXmlApplicationContext("ioc_xml.xml");
        HelloWorld helloWorld = (HelloWorld) ioc.getBean("helloWorld");
        helloWorld.sayHello();
    }
}
