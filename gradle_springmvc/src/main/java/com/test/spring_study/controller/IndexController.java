package com.test.spring_study.controller;

import com.test.spring_study.service.IIndexService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by IntelliJ IDEA
 * User:    DaiYan
 * Date:    2017/10/12
 * Project: my-spring-proj
 */
@Controller
//千万不能用value指定，不知道的情况下可能导致整个接口注册不上
@RequestMapping("/index")
public class IndexController{
    @Autowired
    private IIndexService indexService;

    @RequestMapping(value = "/get",produces = "application/json")
    @ResponseBody
    public String indexGet(){
        return indexService.get();
    }

    @RequestMapping(value = "",produces = "application/json")
    public ModelAndView index() {
        ModelAndView modelAndView = new ModelAndView("index/index");
        return modelAndView;
    }

    public static void main(String[] args) {

    }
}
