package com.itheina.day02.aop_theory;

/**
 * Created by DaiYan on 2017/4/16.
 */
public class UserDAO implements IUserDAO{
    /**
     * 连接点：joinpoint
     * 增强save方法：则save也是切入点
     * 通知/增强：具体做什么方法，如记录日志
     * 目标对象：UserDAO称为目标对象
     * 织入：过程，即把增强添加到目标对象生成代理对象的过程
     */
    public void save(){
        System.out.println("save ...");
    }

    /**
     * 连接点：joinpoint
     */
    public void update(){
        System.out.println("update ...");
    }

    /**
     * 连接点：joinpoint
     */
    public void delete(){
        System.out.println("delete ...");
    }
}
