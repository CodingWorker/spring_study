package com.itheina.day02.aop;

import org.apache.log4j.Logger;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by DaiYan on 2017/4/16.
 */
public class Demo1 {
    Logger logger=Logger.getLogger(Demo1.class);

    /**
     * 前置通知
     */
    @Test
    public void run1(){
        ApplicationContext context=new ClassPathXmlApplicationContext("com/itheina/day02/aop/applicationContext.xml");
        ICustomerDAO cd=(ICustomerDAO)context.getBean("customerDAO");
        cd.save();
    }

    /**
     * 后置通知
     */
    @Test
    public void run2(){
        ApplicationContext context=new ClassPathXmlApplicationContext("com/itheina/day02/aop/applicationContext.xml");
        ICustomerDAO cd=(ICustomerDAO)context.getBean("customerDAO");
        cd.update();
    }
}
