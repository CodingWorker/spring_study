package com.test.spring_study.aop.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

/**
 * Created by IntelliJ IDEA
 * Project: spring-app
 * User: DaiYan
 * Date: 2017/10/29
 */
@Component(value = "orderDAO")
public class OrderDAO {
//    @Override
    public void save() {
        System.out.println("保存订单...");
    }

//    @Override
    public void update() {
        System.out.println("更新订单...");
    }

//    @Override
    public void delete() {
        System.out.println("取消订单...");
    }

//    @Override
    public void find() {
        System.out.println("查询订单...");
    }
}

@Component(value = "orderDAOTest")
class OrderDAOTest{
    @Autowired
    private OrderDAO orderDAO;

    public static void main(String[] args) {
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("applicationContext.xml");
        OrderDAOTest orderDAOTest=(OrderDAOTest)applicationContext.getBean("orderDAOTest");
        orderDAOTest.orderDAO.save();
        orderDAOTest.orderDAO.update();
        orderDAOTest.orderDAO.delete();
        orderDAOTest.orderDAO.find();
    }
}