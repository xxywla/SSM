package com.xxyw.spring.controller;

import com.xxyw.spring.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class BookController {

    @Autowired
    private BookService bookService;

    public void buyBook(Integer userId, Integer bookId) {
        bookService.buyBook(userId, bookId);
    }

}
