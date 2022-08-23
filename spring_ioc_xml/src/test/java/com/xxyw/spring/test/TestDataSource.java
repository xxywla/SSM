package com.xxyw.spring.test;

import com.alibaba.druid.pool.DruidDataSource;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.sql.SQLException;

public class TestDataSource {
    @Test
    public void test1() throws SQLException {
        ApplicationContext ioc = new ClassPathXmlApplicationContext("spring_datasource.xml");
        DruidDataSource dataSource = ioc.getBean("dataSource2", DruidDataSource.class);
        System.out.println(dataSource.getConnection());
    }
}
