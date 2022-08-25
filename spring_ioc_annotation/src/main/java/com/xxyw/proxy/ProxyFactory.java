package com.xxyw.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;

public class ProxyFactory {
    private Object target;

    public ProxyFactory(Object target) {
        this.target = target;
    }

    Object getProxy() {
        ClassLoader classLoader = target.getClass().getClassLoader();
        Class<?>[] interfaces = target.getClass().getInterfaces();
        InvocationHandler h = new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

                Object result = null;
                try {
                    System.out.println("日志，方法 " + method.getName() + " 参数 " + Arrays.toString(args));

                    result = method.invoke(target, args);

                    System.out.println("日志，方法 " + method.getName() + " 结果 " + result);
                } catch (Exception e) {
                    e.printStackTrace();
                    System.out.println("日志，方法 " + method.getName() + " 执行异常");
                } finally {
                    System.out.println("日志，方法 " + method.getName() + " 方法执行完毕");
                }

                return result;
            }
        };
        return Proxy.newProxyInstance(classLoader, interfaces, h);
    }
}
