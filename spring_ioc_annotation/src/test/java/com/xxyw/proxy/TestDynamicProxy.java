package com.xxyw.proxy;

import org.junit.Test;

public class TestDynamicProxy {
    @Test
    public void test() {
        ProxyFactory proxyFactory = new ProxyFactory(new CalculatorImpl());
        Calculator proxy = (Calculator) proxyFactory.getProxy();
        proxy.add(1, 2);
    }

    @Test
    public void test2() {
        ProxyFactory proxyFactory = new ProxyFactory(new CalculatorImpl());
        Calculator proxy = (Calculator) proxyFactory.getProxy();
        proxy.div(1, 0);
    }
}
