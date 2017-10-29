package com.test.spring_study.aop.dao;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Scope;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

/**
 * Created by IntelliJ IDEA
 * Project: spring-app
 * User: DaiYan
 * Date: 2017/10/29
 */
@Component(value="userDAO")
@Scope(value = "singleton")
public class UserDAO implements IUserDAO{
    @Override
    public void sayHello(){
        System.out.println("hello,welcome!");
    }
}

class UserDAOTest{
    public static void main(String[] args) {
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("applicationContext.xml");
        UserDAO userDAO=(UserDAO)applicationContext.getBean("userDAO");
        userDAO.sayHello();
    }
}

