package com.test.spring_study.util;

import com.test.spring_study.aop.dao.IUserDAO;
import com.test.spring_study.aop.dao.UserDAO;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * Created by IntelliJ IDEA
 * Project: spring-app
 * User: DaiYan
 * Date: 2017/10/29
 */
public class MyProxyUtil {
    public static IUserDAO getProxy(final IUserDAO dao) {
        // 使用Proxy类生成代理对象
        IUserDAO proxy = (IUserDAO) Proxy.newProxyInstance(dao.getClass().getClassLoader(),
                dao.getClass().getInterfaces(), new InvocationHandler() {

                    // 代理对象方法一执行，invoke方法就会执行一次
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        if("save".equals(method.getName())){
                            System.out.println("记录日志...");
                            // 开启事务
                        }
                        // 提交事务
                        // 让dao类的save或者update方法正常的执行下去
                        return method.invoke(dao, args);
                    }
                });
        // 返回代理对象
        return proxy;
    }
}

class Test{
    public static void main(String[] args) {
        IUserDAO userDAO=new UserDAO();
        IUserDAO userDAO1=MyProxyUtil.getProxy(userDAO);
        userDAO1.sayHello();
    }
}

