package com.itheina.day01;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by DaiYan on 2017/4/15.
 */
public class Demo3 {
    /**
     * 旧的开发方式，创建dao并调用
     */
    @Test
    public void run1(){
        ICustomService cs=new CustomService();
        cs.save();
    }

    /**
     * spring框架：在需求方增加注入字段
     */
    @Test
    public void run2(){
        ApplicationContext context=new ClassPathXmlApplicationContext("com/itheina/day01/applicationContext.xml");
        ICustomService cs=(ICustomService) context.getBean("customService");
        cs.save2();
    }
}
