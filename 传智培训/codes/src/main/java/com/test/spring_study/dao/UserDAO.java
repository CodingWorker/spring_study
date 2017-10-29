package com.test.spring_study.dao;

/**
 * Created by IntelliJ IDEA
 * Project: spring-app
 * User: DaiYan
 * Date: 2017/10/29
 */
public class UserDAO implements IUserDAO {
    private int localCount;
    private static int globalCount;

    public UserDAO(){
        this.localCount=0;
    }

    public int getLocalCount() {
        return localCount;
    }

    public void setLocalCount(int localCount) {
        this.localCount = localCount;
    }

    public static int getGlobalCount() {
        return globalCount;
    }

    public static void setGlobalCount(int globalCount) {
        UserDAO.globalCount = globalCount;
    }

    @Override
    public void sayHello() {
        System.out.println("hello,welcome!");
    }

    public void destroy(){
        System.out.println("userdao desttroying");
    }
}
