package com.itheina.day01;

/**
 * Created by DaiYan on 2017/4/15.
 */
public class CustomService implements ICustomService{
    /**
     * 旧的开发方式
     */
    public void save(){
        System.out.println("the service is called");
        new CustomDAO().save();
    }

    /**
     * 为了使用dao，需要创建一个字段以便注入
     */
    private CustomDAO dao;
    public void setCustomDAO(CustomDAO dao){
        this.dao=dao;
    }

    public void save2(){
        System.out.println("the service is called");
        dao.save();
    }
}
