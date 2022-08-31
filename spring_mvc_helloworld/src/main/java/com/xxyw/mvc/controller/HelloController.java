package com.xxyw.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {

    @RequestMapping("/")
    public String portal() {
        return "index";
    }

    @RequestMapping("/hello")
    public String hello() {
        return "success";
    }

    @RequestMapping("/abc/{username}/{id}")
    public String abc(@PathVariable String username, @PathVariable Integer id) {
        System.out.println("username = " + username);
        System.out.println("id = " + id);
        return "success";
    }
}
