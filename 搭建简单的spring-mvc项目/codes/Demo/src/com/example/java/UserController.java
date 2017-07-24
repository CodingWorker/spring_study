package com.example.java;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import java.util.Map;
import java.util.TreeMap;

/**
 * Created by daiya on 2017/7/3.
 */
@Controller
@RequestMapping("/user")
public class UserController {
    @RequestMapping("/query")
    public String query(){
        System.out.println("query trigger");
        return "user/userList";
    }

    @RequestMapping("/queryForApp")
    @ResponseBody
    public Object queryForApp(){
        System.out.println("queryForApp trigger");
        Map<String,Object> map=new TreeMap<>();
        map.put("userName","Nick Huang");

        return map;
    }
}
