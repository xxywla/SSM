package com.xxyw.spring.controller;

import com.xxyw.spring.service.BookService;
import com.xxyw.spring.service.CheckoutService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class BookController {

    @Autowired
    private BookService bookService;

    @Autowired
    private CheckoutService checkoutService;

    public void buyBook(Integer userId, Integer bookId) {
        bookService.buyBook(userId, bookId);
    }

    public void buyBooks(Integer userId, int[] bookIds) {
        checkoutService.checkout(userId, bookIds);
    }

}
