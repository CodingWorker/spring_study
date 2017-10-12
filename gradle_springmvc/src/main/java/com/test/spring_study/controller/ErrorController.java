package com.test.spring_study.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by IntelliJ IDEA
 * User:    DaiYan
 * Date:    2017/10/12
 * Project: my-spring-proj
 */
@Controller
@RequestMapping("/error")
public class ErrorController {
    @RequestMapping(value = "/500",produces = "application/json")
    @ResponseBody
    public String error500(){
        return "{\"msg\":\"error_500\"}";
    }

    @RequestMapping(value = "/404",produces = "application/json")
    @ResponseBody
    public String error404(){
        return "{\"msg\":\"error_404\"}";
    }
}
