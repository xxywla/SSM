package com.xxyw.spring.test;

import com.xxyw.spring.pojo.User;
import org.junit.Test;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestLifeCycle {
    @Test
    public void test() {
        ConfigurableApplicationContext ioc = new ClassPathXmlApplicationContext("spring_lifecycle.xml");
        User user = ioc.getBean(User.class);
        System.out.println(user);
        ioc.close();
    }
    /*
    运行结果
生命周期1:创建对象
生命周期2:依赖注入
生命周期3:初始化
生命周期4:销毁
     */
}
