package com.itheina.day02.annotions;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * 组件注解，标记类
 * 以前的写法:<bean id="" class=""></bean>,使用注解后就不需要此
 * 上面的写法<=>@Component(value = "userService")
 * Created by DaiYan on 2017/4/16.
 */
@Component(value = "userService")
public class UserService implements IUserService{
    //注解注入的方式不需要set方法
    @Value(value="哈哈")
    private String name;

    //按照类型自动装配
//    @Autowired
//    @Qualifier(value="userDAO2")    //按照名称装配
    @Resource(name="userDAO2")    //使用java提供的注解
    private IUserDAO userDAO;
//    public void setUserDAO(IUserDAO dao){
//        userDAO=dao;
//    }
    public UserService(){
        System.out.println("userService is created");
    }

    public void sayHello(){
        System.out.println("hello spring context "+this.name);
        userDAO.save();
    }

    public void save(){
        System.out.println("Servvice:save");
        userDAO.save();
    }
}
