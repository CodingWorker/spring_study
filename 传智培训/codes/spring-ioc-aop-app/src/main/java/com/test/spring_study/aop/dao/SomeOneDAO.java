package com.test.spring_study.aop.dao;

import javafx.util.converter.PercentageStringConverter;

/**
 * Created by IntelliJ IDEA
 * Project: spring-app
 * User: DaiYan
 * Date: 2017/10/29
 */
public class SomeOneDAO extends UserDAO {
    @Override
    public void sayHello() {
        System.out.println("hello from someOne");
    }
}
