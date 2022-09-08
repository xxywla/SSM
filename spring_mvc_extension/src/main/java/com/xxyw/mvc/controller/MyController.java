package com.xxyw.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MyController {

    @RequestMapping("/hello")
    public String hello() {
        return "success";
    }

    @RequestMapping("/hello/xml")
    public String testExceptionByXML() {
        System.out.println(1 / 0);
        return "success";
    }

    @RequestMapping("/hello/annotation")
    public String testExceptionByAnnotation() {
        int[] arr = new int[1];
        System.out.println(arr[100]);
        return "success";
    }
}
