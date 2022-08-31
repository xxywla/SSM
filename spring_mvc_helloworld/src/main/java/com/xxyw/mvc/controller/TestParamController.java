package com.xxyw.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.io.UnsupportedEncodingException;

@Controller
public class TestParamController {

    @RequestMapping("/param/servletAPI")
    public String test1(HttpServletRequest request) throws UnsupportedEncodingException {

        String username = request.getParameter("username");
        String password = request.getParameter("password");
        System.out.println("username = " + username);
        System.out.println("password = " + password);
        return "success";
    }
}
