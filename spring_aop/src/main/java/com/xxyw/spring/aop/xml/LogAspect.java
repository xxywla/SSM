package com.xxyw.spring.aop.xml;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component

public class LogAspect {

    public void beforeAdviceMethod(JoinPoint joinPoint) {
        Signature signature = joinPoint.getSignature();
        Object[] args = joinPoint.getArgs();
        System.out.println("前置通知，方法名 " + signature.getName() + "，参数 " + Arrays.toString(args));
    }


    public void afterAdviceMethod() {
        System.out.println("后置通知");
    }


    public void afterReturningAdviceMethod(JoinPoint joinPoint, Object result) {
        System.out.println("返回通知，方法名 " + joinPoint.getSignature().getName() + "，返回值 " + result);
    }


    public void afterThrowingAdviceMethod(JoinPoint joinPoint, Throwable ex) {
        System.out.println("异常通知，方法名 " + joinPoint.getSignature().getName() + "，异常信息 " + ex);
    }


    public Object aroundAdviceMethod(ProceedingJoinPoint joinPoint) {
        Object result = null;
        try {
            System.out.println("环绕通知-->前置通知");
            // 相当于目标方法的执行
            result = joinPoint.proceed();
            System.out.println("环绕通知-->返回通知，运行结果 " + result);
        } catch (Throwable e) {
            e.printStackTrace();
            System.out.println("环绕通知-->异常通知，异常信息 " + e);
        } finally {
            System.out.println("环绕通知-->后置通知");
        }
        return result;
    }
}
