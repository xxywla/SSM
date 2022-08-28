package com.xxyw.spring.dao;

public interface BookDao {
    int getPriceByBookId(Integer bookId);

    void updateStock(Integer bookId);

    void updateBalance(Integer userId, int price);
}
