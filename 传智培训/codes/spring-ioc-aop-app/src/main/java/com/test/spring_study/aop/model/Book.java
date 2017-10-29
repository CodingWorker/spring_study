package com.test.spring_study.aop.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Scope;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

/**
 * Created by IntelliJ IDEA
 * Project: spring-app
 * User: DaiYan
 * Date: 2017/10/29
 */
@Component(value = "book")
@Scope(value = "prototype")
public class Book {
    @Value("i don't know")//value普通注入
    private String name;
    @Value("12.00")
    private double price;

    @Autowired            //引用注入
    private Person owner;

    public Book(){}
    public Book(String name,double price){
        this.name=name;
        this.price=price;
    }

    @PostConstruct        //相当于init-method
    public void init(){
        System.out.println("a book is done");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString(){
        return "name: "+this.name+", price: "+this.price+", owner: "+this.owner.getName();
    }
}

class BookTest{
    public static void main(String[] args) {
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("applicationContext.xml");
        Book book=(Book)applicationContext.getBean("book");
        System.out.println(book);
    }
}