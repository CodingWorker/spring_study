package com.test.spring_study.dao;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import sun.misc.GC;

import javax.lang.model.element.NestingKind;
import java.io.File;
import java.lang.management.GarbageCollectorMXBean;

/**
 * Created by IntelliJ IDEA
 * Project: spring-app
 * User: DaiYan
 * Date: 2017/10/29
 */
public class UserDAOTest {
    public static void main (String[] args){
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("applicationContext.xml");
        UserDAO userDAO=(UserDAO) applicationContext.getBean("userDAO");//如果设置了init-method，则会在第一次获取该类的
        //的时候调用init-method方法
        userDAO.sayHello();

        userDAO.setLocalCount(12);
        System.out.println(userDAO.getLocalCount());
        System.out.println("===========another实例========");
        UserDAO userDAO1=(UserDAO)applicationContext.getBean("userDAO");//如果在spring的配置文件中将
        //scope设置为single,则两个实例是同一个，即单例模式，这样实例只会被初始化一次，因此也只会调用一次init-method方法
        userDAO1.sayHello();
        System.out.println(userDAO1.getLocalCount());//在单例模式下，如果被其他实例设置了相关变量的值，在本实例中也能够得到
        //如果scope设置为prototype即为多例模式，则此处就箱单会类的实例化一样，得到的是类实例时成员比变量的初始值
        System.out.println(UserDAO.getGlobalCount());

        userDAO=null;//destory方法会在GC垃圾收集器收集该实例的时候调用
        for(int i=0;i<1000;i++){
            applicationContext.getBean("userDAO");
        }


    }

}
