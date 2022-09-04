package com.xxyw.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestViewController {

    @RequestMapping("/test/view/thymeleaf")
    public String testThymeleaf() {

        return "success2";
    }

    @RequestMapping("/test/view/forward")
    public String testForward() {

        return "forward:/hello";
    }

    @RequestMapping("/test/view/redirect")
    public String testRedirect() {

        return "redirect:/hello";
    }
}
