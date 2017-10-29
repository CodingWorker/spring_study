package com.itheina.day02.aop_theory;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * 使用jdk的方式来生成代理对象
 * Created by DaiYan on 2017/4/16.
 */
public class MyProxyUtils {
    public static IUserDAO getProxy(final IUserDAO dao){
        IUserDAO proxy=(IUserDAO)Proxy.newProxyInstance(dao.getClass().getClassLoader(),
                dao.getClass().getInterfaces(),
                new InvocationHandler() {
                    /**
                     * 代理方法一执行则invoke方法就会执行一次
                     * 所以可以从在invoke方法
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

                    }
                     */
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        //System.out.println("afadf");
                        //使得dao对象的对应方法执行
                        //增强
                        if("save".equals(method.getName())){
                            System.out.println("save增强");
                        }else if("update".equals(method.getName())){
                            System.out.println("update 增强");
                        }
                        method.invoke(dao,args);

                        return null;
                    }
                });

        //返回代理对象
        return proxy;
    }
}
