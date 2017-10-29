package com.test.spring_study.dao;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.File;

/**
 * Created by IntelliJ IDEA
 * Project: spring-app
 * User: DaiYan
 * Date: 2017/10/29
 */
public class UserDAOTest {
    @Test
    public void t1(){
        File file=new File("applicationContext.xml");
        System.out.println(file.exists());
//        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("applicationContext.xml");
//        IUserDAO userDAO=(IUserDAO) applicationContext.getBean("userDAO");
//        userDAO.sayHello();
    }
}
