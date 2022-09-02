package com.xxyw.mvc.controller;

import com.xxyw.mvc.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.io.UnsupportedEncodingException;

@Controller
public class TestParamController {

    @RequestMapping("/param/servletAPI")
    public String test1(HttpServletRequest request) throws UnsupportedEncodingException {

        HttpSession session = request.getSession();
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        System.out.println("username = " + username + " password = " + password);
        return "success";
    }

    @RequestMapping("/param1")
    public String test2(String username, String password) {
        System.out.println("username = " + username + " password = " + password);
        return "success";
    }

    @RequestMapping("/param2")
    public String test3(
            @RequestParam("name") String username,
            @RequestParam(defaultValue = "666") String password) {
        System.out.println("username = " + username + " password = " + password);
        return "success";
    }

    @RequestMapping("/param3")
    public String test4(String username, String password,
                        @RequestHeader("referer") String referer,
                        @CookieValue("JSESSIONID") String jSessionId) {
        System.out.println("username = " + username + " password = " + password);
        System.out.println("referer = " + referer);
        System.out.println("jSessionId = " + jSessionId);
        return "success";
    }

    @RequestMapping("/param/pojo")
    public String test5(User user) {
        System.out.println("user = " + user);
        return "success";
    }
}
