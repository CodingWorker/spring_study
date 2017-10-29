package com.test.spring_study.portal.controller;

import org.junit.runners.Parameterized;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by IntelliJ IDEA
 * Project: spring-app
 * User: DaiYan
 * Date: 2017/10/29
 */
@Controller
public class LoginController {
    @RequestMapping(value = "/login",method = RequestMethod.POST,produces = "application/json;charset=utf-8")
    @ResponseBody
    public String login(@PathVariable String userName,
                        @PathVariable String password){
        if(userName!=null && userName.equals("Danile")
                && password!=null && password.equals("123")){
            return "{\"code\":0,\"msg\"login successed\"}";
        }else{
            return "{\"code\":1,\"msg\":\"usrnamne or password error\"}";
        }
    }
}
