package com.xxyw.spring.service;

public interface BookService {
    void buyBook(Integer userId, Integer bookId);

    void buyBooks(Integer userId, int[] bookIds);
}
