package com.xxyw.spring.aop.annotation;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
@Aspect
public class LogAspect {

    @Pointcut(value = "execution(* com.xxyw.spring.aop.annotation.CalculatorImpl.*(..))")
    public void pointCut() {
    }

    //@Before(value = "execution(public int com.xxyw.spring.aop.annotation.CalculatorImpl.add(int, int))")
    //@Before(value = "execution(* com.xxyw.spring.aop.*.*(..))")
    @Before(value = "pointCut()")
    public void beforeAdviceMethod(JoinPoint joinPoint) {
        Signature signature = joinPoint.getSignature();
        Object[] args = joinPoint.getArgs();
        System.out.println("前置通知，方法名 " + signature.getName() + "，参数 " + Arrays.toString(args));
    }

    @After(value = "pointCut()")
    public void afterAdviceMethod() {
        System.out.println("后置通知");
    }

    @AfterReturning(value = "pointCut()", returning = "result")
    public void afterReturningAdviceMethod(JoinPoint joinPoint, Object result) {
        System.out.println("返回通知，方法名 " + joinPoint.getSignature().getName() + "，返回值 " + result);
    }

    @AfterThrowing(value = "pointCut()", throwing = "ex")
    public void afterThrowingAdviceMethod(JoinPoint joinPoint, Throwable ex) {
        System.out.println("异常通知，方法名 " + joinPoint.getSignature().getName() + "，异常信息 " + ex);
    }

    @Around(value = "pointCut()")
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
