package com.xxyw.proxy;

import org.junit.Test;

public class TestStaticProxy {
    @Test
    public void test() {
        CalculatorStaticProxy proxy = new CalculatorStaticProxy(new CalculatorImpl());
        proxy.add(1, 2);
    }
    /*
    静态代理，不直接操作对象，使用代理对象间接操作对象
    对象只保留核心功能，在代理对象中可以在操作前后异常处理等添加自定义的内容
     */
}
