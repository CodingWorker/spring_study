package com.itheina.day02.annotions;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;

/**
 * @Repository(value="userDAO")这句话将DAO的实现交给了IOC容器，
 * 会被注解扫描并创建
 * Created by DaiYan on 2017/4/16.
 */
@Repository(value="userDAO")
@Scope(value="singleton")
public class UserDAO  implements IUserDAO {
    public void save(){
        System.out.println("UserDAO called");
    }

    @PostConstruct
    public void init(){
        System.out.println("userDAO:init");
    }
}
