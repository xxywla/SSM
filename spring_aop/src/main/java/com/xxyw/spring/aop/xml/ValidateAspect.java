package com.xxyw.spring.aop.xml;

import org.springframework.stereotype.Component;

@Component
public class ValidateAspect {


    public void beforeAdvice() {
        System.out.println("ValidateAspect 前置通知");
    }
}
