package com.xxyw.spring.aop.annotation;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(1)
public class ValidateAspect {

    @Before(value = "com.xxyw.spring.aop.annotation.LogAspect.pointCut()")
    public void beforeAdvice() {
        System.out.println("ValidateAspect 前置通知");
    }
}
