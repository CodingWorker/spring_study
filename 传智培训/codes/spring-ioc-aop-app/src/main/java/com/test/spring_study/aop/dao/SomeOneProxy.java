package com.test.spring_study.aop.dao;

import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import javax.xml.ws.spi.Invoker;
import java.lang.reflect.Method;

/**
 * Created by IntelliJ IDEA
 * Project: spring-app
 * User: DaiYan
 * Date: 2017/10/29
 */
public class SomeOneProxy{
    public static UserDAO createProxy(final UserDAO userDAO){
        //创建cglib核心类
        Enhancer enhancer=new Enhancer();

        //设置父类
        enhancer.setSuperclass(userDAO.getClass().getSuperclass());

        //设置回调方法
        enhancer.setCallback(new MethodInterceptor() {
            @Override
            public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
                if(method.getName().equals("sayHello")){
                    //方法增强
                    System.out.println("=====权限验证============");
                }

                return methodProxy.invokeSuper(o,objects);
            }
        });

        //返回代理对象
        return (UserDAO) enhancer.create();

    }
}

class Test{
    public static void main(String[] args) {
        UserDAO someOneDAO=new SomeOneDAO();
        UserDAO proxy=SomeOneProxy.createProxy(someOneDAO);
        proxy.sayHello();
    }
}