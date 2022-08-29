package com.xxyw.spring;

import com.xxyw.spring.controller.BookController;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:tx_xml.xml")
public class TestTxByXML {

    @Autowired
    private BookController bookController;

    @Test
    public void test() {
        bookController.buyBook(1, 1);
    }

    @Test
    public void test1() {
        bookController.buyBooks(1, new int[]{1, 2});
    }

}
