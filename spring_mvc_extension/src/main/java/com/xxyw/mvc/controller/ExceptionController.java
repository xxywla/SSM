package com.xxyw.mvc.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ExceptionController {

    @ExceptionHandler(IndexOutOfBoundsException.class)
    public String handleException(Throwable ex, Model model) {
        model.addAttribute("ex", ex);
        return "error";
    }
}
