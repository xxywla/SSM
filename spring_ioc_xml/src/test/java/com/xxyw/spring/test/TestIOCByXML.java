package com.xxyw.spring.test;

import com.xxyw.spring.pojo.Clazz;
import com.xxyw.spring.pojo.Student;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestIOCByXML {
    @Test
    public void test1() {
        ApplicationContext ioc = new ClassPathXmlApplicationContext("ioc_xml.xml");
        Student stu = (Student) ioc.getBean("studentOne");
        System.out.println("stu = " + stu);
    }

    @Test
    public void testDI1() {
        ApplicationContext ioc = new ClassPathXmlApplicationContext("ioc_xml.xml");
        Student stu = ioc.getBean("studentTwo", Student.class);
        System.out.println("stu = " + stu);
    }

    @Test
    public void testDI2() {
        ApplicationContext ioc = new ClassPathXmlApplicationContext("ioc_xml.xml");
        Student stu = ioc.getBean("studentThree", Student.class);
        System.out.println("stu = " + stu);
    }

    @Test
    public void testDI4() {
        ApplicationContext ioc = new ClassPathXmlApplicationContext("ioc_xml.xml");
        Student stu = ioc.getBean("studentFour", Student.class);
        System.out.println("stu = " + stu);
    }

    @Test
    public void testDI5() {
        ApplicationContext ioc = new ClassPathXmlApplicationContext("ioc_xml.xml");
        Student stu = ioc.getBean("studentEight", Student.class);
        System.out.println("stu = " + stu);
    }

    @Test
    public void testDIClazz() {
        ApplicationContext ioc = new ClassPathXmlApplicationContext("ioc_xml.xml");
        Clazz clazz = ioc.getBean("clazzTwo2", Clazz.class);
        System.out.println("stu = " + clazz);
    }
}
