package com.itheina.day02.annotions;

import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by DaiYan on 2017/4/16.
 */
//@RunWith(SpringJUnit4ClassRunner.class)
//@ContextConfiguration("classpath:com/itheina/day02/annotions/applicationContext.xml")
public class Demo1 {
    private Logger logger=Logger.getLogger(Demo1.class);

    //不使用工厂的话需要将对象注入进来
    @Autowired
    @Qualifier("userDAO")
    private IUserDAO userDAO;
    /**
     * 注解的方式
     */
    @Test
    public void run1(){
        ApplicationContext context=new ClassPathXmlApplicationContext("com/itheina/day02/annotions/applicationContext.xml");
        IUserService us=(IUserService)context.getBean("userService");
        us.sayHello();
    }

    @Test
    public void run2(){
        ApplicationContext context=new ClassPathXmlApplicationContext("com/itheina/day02/annotions/applicationContext.xml");
        IUserService us=(IUserService)context.getBean("userService");
        us.save();
    }

    /**
     * 整合junit测试
     */
    @Test
    public void run3(){
        //userDAO.save();
    }
}
