package com.xxyw.spring.test;

import com.xxyw.spring.pojo.Student;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestScope {
    @Test
    public void test() {
        ApplicationContext ioc = new ClassPathXmlApplicationContext("spring_scope.xml");
        Student stu1 = ioc.getBean(Student.class);
        Student stu2 = ioc.getBean(Student.class);
        System.out.println(stu1 == stu2);
    }
}
