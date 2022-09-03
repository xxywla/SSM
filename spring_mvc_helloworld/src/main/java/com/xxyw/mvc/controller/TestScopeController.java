package com.xxyw.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpSession;
import java.util.Map;

@Controller
public class TestScopeController {

    @RequestMapping("/test/modelAndView")
    public ModelAndView testModelAndView() {

        ModelAndView modelAndView = new ModelAndView();

        // 设置共享数据
        modelAndView.addObject("key", "hello ModelAndView");

        // 视图跳转
        modelAndView.setViewName("success2");

        return modelAndView;
    }

    @RequestMapping("/test/model")
    public String testModel(Model model) {

        System.out.println(model.getClass().getName());

        model.addAttribute("key", "你好 Model");

        return "success2";
    }

    @RequestMapping("/test/modelMap")
    public String testModelMap(ModelMap modelMap) {

        modelMap.addAttribute("key", "你好 Model Map");

        return "success2";
    }

    @RequestMapping("/test/map")
    public String testMap(Map<String, Object> map) {

        // org.springframework.validation.support.BindingAwareModelMap
        System.out.println(map.getClass().getName());

        map.put("key", "使用 Map 向共享域存放数据");

        return "success2";
    }

    @RequestMapping("/test/session")
    public String testSession(HttpSession session) {

        session.setAttribute("sessionId", "hello session !!!");

        return "success2";
    }

    @RequestMapping("/test/application")
    public String testApplication(HttpSession session) {

        ServletContext application = session.getServletContext();
        application.setAttribute("applicationId", "Application中的数据");

        return "success2";
    }
}
