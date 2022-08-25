package com.xxyw.proxy;

public class CalculatorStaticProxy implements Calculator {

    private Calculator target = new CalculatorImpl();

    public CalculatorStaticProxy(Calculator target) {
        this.target = target;
    }

    @Override
    public int add(int i, int j) {
        System.out.println("日志，add，参数 i = " + i + " j = " + j);
        int result = target.add(i, j);
        System.out.println("日志，add，结果 " + result);
        return result;
    }

    @Override
    public int sub(int i, int j) {
        System.out.println("日志，sub，参数 i = " + i + " j = " + j);
        int result = target.sub(i, j);
        System.out.println("日志，sub，结果 " + result);
        return result;
    }

    @Override
    public int mul(int i, int j) {
        System.out.println("日志，mul，参数 i = " + i + " j = " + j);
        int result = target.mul(i, j);
        System.out.println("日志，mul，结果 " + result);
        return result;
    }

    @Override
    public int div(int i, int j) {
        System.out.println("日志，div，参数 i = " + i + " j = " + j);
        int result = target.div(i, j);
        System.out.println("日志，div，结果 " + result);
        return result;
    }
}
