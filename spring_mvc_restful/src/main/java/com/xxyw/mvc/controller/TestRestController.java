package com.xxyw.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class TestRestController {

    //@RequestMapping(value = "/user", method = RequestMethod.GET)
    @GetMapping("/user")
    public String getAllUser() {
        System.out.println("--------->查询所有用户信息-->get");
        return "success";
    }

    //@RequestMapping(value = "/user/{userId}", method = RequestMethod.GET)
    @GetMapping("/user/{userId}")
    public String getUserById(@PathVariable("userId") Integer userId) {
        System.out.println("--------->查询用户 id = " + userId + " 的信息-->get");
        return "success";
    }

    //@RequestMapping(value = "/user", method = RequestMethod.POST)
    @PostMapping("/user")
    public String addUser() {
        System.out.println("--------->添加用户信息-->post");
        return "success";
    }

    //@RequestMapping(value = "/user", method = RequestMethod.PUT)
    @PutMapping("/user")
    public String udpateUser() {
        System.out.println("--------->更新用户信息-->put");
        return "success";
    }

    //@RequestMapping(value = "/user/{userId}", method = RequestMethod.DELETE)
    @DeleteMapping("/user/{userId}")
    public String deleteUser(@PathVariable("userId") Integer userId) {
        System.out.println("--------->删除ID为 " + userId + " 用户信息-->delete");
        return "success";
    }
}
