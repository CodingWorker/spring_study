package com.itheina.day01;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by DaiYan on 2017/4/16.
 */
public class Demo5 {
    /**
     * 注入集合
     */
    @Test
    public void run1(){
        //ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
        ApplicationContext context=new ClassPathXmlApplicationContext("com/itheina/day01/applicationContext.xml", "com/itheina/day01/userContext.xml");

        User user=(User)context.getBean("user");
        //array测试
        user.printArrs();
        System.out.println("\n");
        //list测试
        user.printNameList();
        //map测试
        user.printMap();
        //property测试
        user.printProperties();
    }

}
