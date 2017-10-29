package com.test.spring_study.aop.dao;

/**
 * Created by IntelliJ IDEA
 * Project: spring-app
 * User: DaiYan
 * Date: 2017/10/29
 */
public interface IUserDAO {
    default void sayHello(){
        System.out.println("hello");
    }
}
