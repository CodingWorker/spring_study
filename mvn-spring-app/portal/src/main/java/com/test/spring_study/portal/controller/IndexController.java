package com.test.spring_study.portal.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by IntelliJ IDEA
 * Project: mvn-spring-app
 * User: DaiYan
 * Date: 2017/10/28
 */
@Controller
@RequestMapping("")
public class IndexController {
    @RequestMapping(value="",method = RequestMethod.GET,produces = "application/json;charset=utf-8")
    @ResponseBody
    public String index(){
        return "{\"code\":0,\"msg\":\"this is a test page\"}";
    }
}
