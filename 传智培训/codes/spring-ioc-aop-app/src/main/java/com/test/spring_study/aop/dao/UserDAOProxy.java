package com.test.spring_study.aop.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * Created by IntelliJ IDEA
 * Project: spring-app
 * User: DaiYan
 * Date: 2017/10/29
 */
@Component(value="userDAOProxy")
public class UserDAOProxy implements InvocationHandler{
    @Autowired
    private IUserDAO userDAO;

    public UserDAOProxy(){}

    public UserDAOProxy(IUserDAO userDAO){
        this.userDAO=userDAO;
    }

    public IUserDAO createProxy(){
        IUserDAO userDAOProxy=(IUserDAO) Proxy.newProxyInstance(
        userDAO.getClass().getClassLoader(),
                userDAO.getClass().getInterfaces(),
                this);//最后需要传入=一个参数，该参数需要实现了InvocationHandler接口，
        //而可以将当前类作为实现InvocationHandler接口，这样就可以直接传入自身，
        //创建代理的时候会自动调用InvocationHandler实现类的invoke方法,在这个invoke方法内部
        //可以写一些需要增强的操作

        return userDAOProxy;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        if(method.getName().equals("sayHello")){
            System.out.println("======对参数进行权限校验=====");
        }

        return method.invoke(userDAO,args);
    }

    public IUserDAO getUserDAO() {
        return userDAO;
    }

    public void setUserDAO(IUserDAO userDAO) {
        this.userDAO = userDAO;
    }
}

class UserDAOProxyTest{
    public static void main(String[] args) {
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("applicationContext.xml");
        UserDAOProxy userDAOProxy=(UserDAOProxy)applicationContext.getBean("userDAOProxy");
        IUserDAO userDAO= userDAOProxy.createProxy();
        userDAO.sayHello();
    }
}
