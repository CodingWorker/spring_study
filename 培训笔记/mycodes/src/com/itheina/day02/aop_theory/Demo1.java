package com.itheina.day02.aop_theory;

import org.junit.Test;

/**
 * Created by DaiYan on 2017/4/16.
 */
public class Demo1 {
    /**
     * 使用jdk的代理方式来创建
     */
    @Test
    public void run1(){
        //目标对象
        IUserDAO dao=new UserDAO();
        dao.save();
        dao.update();
        System.out.println("//==============");
        IUserDAO proxy=MyProxyUtils.getProxy(dao);
        proxy.save();
        proxy.update();
    }

    /**
     * 使用cglib代理
     */
    @Test
    public void run2(){
        //目标对象
        BookDAO dao=new BookDAO();
        dao.save();
        dao.delete();
        System.out.println("//================");
        BookDAO proxy=new MyCglibUtils().createProxy();
        proxy.save();
        proxy.update();
        proxy.delete();
    }
}
