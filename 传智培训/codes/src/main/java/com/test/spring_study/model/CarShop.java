package com.test.spring_study.model;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by IntelliJ IDEA
 * Project: spring-app
 * User: DaiYan
 * Date: 2017/10/29
 */
public class CarShop {
    private int carPrice;
    private Car car;

    public CarShop(){}

    public int getCarPrice() {
        return carPrice;
    }

    public void setCarPrice(int carPrice) {
        this.carPrice = carPrice;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }
}

class CarShopTest{
    public static void main(String[] args) {
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("applicationContext.xml");
        CarShop carShop=(CarShop)applicationContext.getBean("carShop");
        //通过spEL表达式注入属性
        System.out.println(carShop.getCarPrice());
    }
}
