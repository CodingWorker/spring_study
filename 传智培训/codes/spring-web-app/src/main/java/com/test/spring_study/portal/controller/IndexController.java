package com.test.spring_study.portal.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.portlet.ModelAndView;

/**
 * Created by IntelliJ IDEA
 * Project: spring-app
 * User: DaiYan
 * Date: 2017/10/29
 */
@Controller("")
public class IndexController {
    @RequestMapping(value = "",method = RequestMethod.GET,produces = "application/json;charset=utf-8")
    public ModelAndView index(){
        //return "{\"code\":0,\"msg\":\"welcome to my web!\"}";
        ModelAndView modelAndView=new ModelAndView("index/index");
        modelAndView.addObject("user","Daniel");
        modelAndView.addObject("age",12);

        return modelAndView;
    }
}
