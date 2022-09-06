package com.xxyw.mvc.controller;

import com.xxyw.mvc.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class TestAjaxController {

    @RequestMapping("/ajax/getParam")
    public void testGetParam(Integer id, @RequestBody String requestBody, HttpServletResponse response) throws IOException {
        System.out.println("id = " + id);
        System.out.println("requestBody = " + requestBody);
        response.getWriter().write("你好 axios！");
    }

    @RequestMapping("/ajax/testRequestBody")
    public void testRequestBody(@RequestBody User user, HttpServletResponse response) throws IOException {
        System.out.println("user = " + user);
        response.getWriter().write("使用 RequestBody注解接收数据");
    }

    @RequestMapping("ajax/testRequestBodyMap")
    public void testRequestBodyMap(@RequestBody Map<String, Object> map, HttpServletResponse response) throws IOException {
        System.out.println("map = " + map);
        response.getWriter().write("使用 RequestBody注解转换成 Map 接收数据");
    }

    @RequestMapping("/ajax/testResponseBody")
    @ResponseBody
    public String testResponseBody() {
        return "success";
    }

    @RequestMapping("/ajax/testResponseBodyJson")
    @ResponseBody
    public User testResponseBodyJson() {
        return new User(1001, "橘右京", "777", 17, "男");
    }

    @RequestMapping("/ajax/testResponseBodyMap")
    @ResponseBody
    public Map<String, Object> testResponseBodyMap() {
        User user1 = new User(1001, "橘右京", "777", 17, "男");
        User user2 = new User(1002, "天庭号", "12356", 87, "男");
        Map<String, Object> map = new HashMap<>();
        map.put("1001", user1);
        map.put("1002", user2);
        return map;
    }

    @RequestMapping("/ajax/testResponseBodyList")
    @ResponseBody
    public List<User> testResponseBodyList() {
        User user1 = new User(1001, "橘右京", "777", 17, "男");
        User user2 = new User(1002, "天庭号", "12356", 87, "男");
        List<User> list = new ArrayList<>();
        list.add(user1);
        list.add(user2);
        return list;
    }
}
