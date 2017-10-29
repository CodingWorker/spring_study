package com.itheina.day01;

/**
 * Created by DaiYan on 2017/4/15.
 */
public class UserService implements IUserService {
    private String Name;
    public void setName(String name){
        this.Name=name;
    }

    public void sayHello(){
        System.out.println("Hello Spring "+this.Name+" :)");
    }

    public void constructor(){
        System.out.println("constructor called");
    }

    public void destructor(){
        System.out.println("destructor called");
    }
}
