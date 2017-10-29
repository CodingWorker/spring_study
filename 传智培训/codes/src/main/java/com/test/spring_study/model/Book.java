package com.test.spring_study.model;

import javafx.application.Application;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.management.modelmbean.XMLParseException;

/**
 * Created by IntelliJ IDEA
 * Project: spring-app
 * User: DaiYan
 * Date: 2017/10/29
 */
public class Book {
    private int pageCount;
    private double price;
    public Book(){}

    public int getPageCount() {
        return pageCount;
    }

    public void setPageCount(int pageCount) {
        this.pageCount = pageCount;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}

class BookTest{
    public static void main(String[] args) {
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("applicationContext.xml");
        Book book=(Book)applicationContext.getBean("book");
        //使用p名称空间注入属性
        System.out.println(book.getPageCount());
        System.out.println(book.getPrice());
    }
}
