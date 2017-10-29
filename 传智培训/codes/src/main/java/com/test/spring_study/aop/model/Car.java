package com.test.spring_study.aop.model;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by IntelliJ IDEA
 * Project: spring-app
 * User: DaiYan
 * Date: 2017/10/29
 */
public class Car {
    private String name;
    private double price;

    //需要提供无参的构造方法以便被spring实例化
    public Car(){}

    public Car(String name,double price){
        this.name=name;
        this.price=price;
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
}

class CarTest{
    public static void main(String[] args) {
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("applicationContext.xml");
        Car car=(Car)applicationContext.getBean("car");
        System.out.println(car.getName());
        System.out.println(car.getPrice());
    }
}
