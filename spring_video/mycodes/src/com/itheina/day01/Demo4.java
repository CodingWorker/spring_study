package com.itheina.day01;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by DaiYan on 2017/4/15.
 */
public class Demo4 {

    /**
     * 使用构造器注入
     */
    @Test
    public void run(){
        ApplicationContext context=new ClassPathXmlApplicationContext("com/itheina/day01/applicationContext.xml");
        Person p=(Person)context.getBean("person");
        System.out.println(p);
    }

    /**
     * 使用p名称空间注入
     */
    @Test
    public void run2(){
        ApplicationContext context=new ClassPathXmlApplicationContext("com/itheina/day01/applicationContext.xml");
        Person2 p2=(Person2)context.getBean("person2");
        System.out.println(p2);
    }

    /**
     * 使用spel注入
     */
    @Test
    public void run3(){
        ApplicationContext context=new ClassPathXmlApplicationContext("com/itheina/day01/applicationContext.xml");
        Person3 p3=(Person3)context.getBean("person3");
        System.out.println(p3);
    }
}
