package com.itheina.day02.annotions;

import org.springframework.stereotype.Repository;

/**
 * Created by DaiYan on 2017/4/16.
 */
@Repository(value="userDAO2")
public class UserDAO2 implements IUserDAO{
    public void save(){
        System.out.println("UserDAO2 called");
    }
}
