package com.itheina.day01;

import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;

/**
 * Created by DaiYan on 2017/4/15.
 */
public class Demo2 {

    /**
     * 以前采用的方法，即需要什么new什么
     */
    @Test
    public void run1(){
        //直接new对象，调用方法
        IUserService us1=new UserService();
        us1.sayHello();
    }

    /**
     * 使用spring框架
     */
    public void run2(){
        //通过读取xml配置文件得到spring的工厂
        ApplicationContext context= new ClassPathXmlApplicationContext("com/itheina/day01/applicationContext.xml");

        //从文件加载配置
        //context=new FileSystemXmlApplicationContext("file://path");

        //从spring工厂里得到服务对象,默认的创建的都是单例对象,当加载文件后就会自动创建对象
        //IUserService us= (IUserService)context.getBean("userService");
        //调用服务对象的方法
        //us.sayHello();
    }

    /**
     * 旧的spring工厂方法
     */
    public void run3(){
        //旧方法：老工厂，加载文件后不会创建对象，只是在getBean的时候才会创建
        BeanFactory bf= new XmlBeanFactory(new FileSystemResource("com/itheina/day01/applicationContext.xml"));
        IUserService userService=(IUserService)bf.getBean("userService");
        userService.sayHello();
    }

    /**
     * 配置init-method 和 destroy-method方法
     */
    @Test
    public void run4(){
        ApplicationContext context=new ClassPathXmlApplicationContext("com/itheina/day01/applicationContext.xml");
        IUserService us=(IUserService)context.getBean("userService");
        us.sayHello();
    }

    /**
     * 查看destroy效果
     */
    @Test
    public void run5(){
        ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("com/itheina/day01/applicationContext.xml");
        IUserService us=(IUserService)context.getBean("userService");
        context.close();
    }

    /**
     * 注入字段
     */
    @Test
    public void run6(){
        ApplicationContext context=new ClassPathXmlApplicationContext("com/itheina/day01/applicationContext.xml");
        IUserService us=(IUserService)context.getBean("userService");
        us.sayHello();
    }

}
