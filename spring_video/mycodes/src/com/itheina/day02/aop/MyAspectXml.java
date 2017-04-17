package com.itheina.day02.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.springframework.stereotype.Repository;

/**
 * 切面类：切入点和通知
 * Created by DaiYan on 2017/4/16.
 */
//@Repository(value="myAspectXml")
public class MyAspectXml {
    public void log(){
        System.out.println("logging ...\r\nloggin done");
    }

    public void loginOut(){
        System.out.println("login out");
    }

    public void before(){
        System.out.println("before");
    }

    public void after(){
        System.out.println("after");
    }

    /**
     * 环绕通知：在切入点方法执行之前和之后执行，
     * 默认切入点方法不会被执行
     * 因此必须手动之心切入点
     */
    public void around(ProceedingJoinPoint joinPoint){
        System.out.println("around:before");
        try {
            joinPoint.proceed();
        }catch(Throwable e) {

        }
        System.out.println("around:after");

    }

    public void finall(){
        System.out.println("finall");
    }
}
