package com.xxyw.spring.service.impl;

import com.xxyw.spring.dao.BookDao;
import com.xxyw.spring.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookServiceImpl implements BookService {

    @Autowired
    private BookDao bookDao;

    @Override
    public void buyBook(Integer userId, Integer bookId) {

        // 查找图书价格
        int price = bookDao.getPriceByBookId(bookId);

        // 更新图书库存
        bookDao.updateStock(bookId);

        // 更新用户余额
        bookDao.updateBalance(userId, price);

    }
}
