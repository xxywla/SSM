package com.xxyw.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestController {

    @RequestMapping("/hello")
    public String hello() {
        return "success";
    }

    @RequestMapping("/test/exception")
    public String testException() {
        System.out.println(1 / 0);
        return "success";
    }

    @RequestMapping("/test/exception2")
    public String testException2() {
        int[] arr = new int[1];
        System.out.println(arr[100]);
        return "success";
    }

}
