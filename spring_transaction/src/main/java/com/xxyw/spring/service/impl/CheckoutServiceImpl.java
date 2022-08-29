package com.xxyw.spring.service.impl;

import com.xxyw.spring.service.BookService;
import com.xxyw.spring.service.CheckoutService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CheckoutServiceImpl implements CheckoutService {

    @Autowired
    private BookService bookService;

    @Override
    //@Transactional
    public void checkout(Integer userId, int[] bookIds) {
        for (int bookId : bookIds) {
            bookService.buyBook(userId, bookId);
        }
    }
}
