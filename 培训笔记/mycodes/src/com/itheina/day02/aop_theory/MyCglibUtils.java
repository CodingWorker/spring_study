package com.itheina.day02.aop_theory;

import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * Created by DaiYan on 2017/4/16.
 */
public class MyCglibUtils implements MethodInterceptor{
    private static BookDAO dao=new BookDAO();

    public MyCglibUtils(){
    }

    public BookDAO createProxy(){
        //创建cglib核心类
        Enhancer en=new Enhancer();

        //设置父类
        en.setSuperclass(dao.getClass());

        //设置回调
        en.setCallback(this);

        //生成代理
        return (BookDAO)en.create();
    }

    public Object intercept(Object proxy,
                            Method method,
                            Object[] args,
                            MethodProxy methodProxy)
    throws Throwable{
        Object obj1=null;
        if("delete".equals(method.getName())){
            obj1=methodProxy.invokeSuper(proxy,args);
        }

        return obj1;
    }
}
