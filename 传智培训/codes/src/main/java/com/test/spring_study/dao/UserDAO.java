package com.test.spring_study.dao;

/**
 * Created by IntelliJ IDEA
 * Project: spring-app
 * User: DaiYan
 * Date: 2017/10/29
 */
public class UserDAO implements IUserDAO {
    @Override
    public void sayHello() {
        System.out.println("hello,welcome!");
    }
}
