package com.itheina.day01;

import java.util.List;
import java.util.Map;
import java.util.Properties;

/**
 * 演示集合注入的方式
 * Created by DaiYan on 2017/4/16.
 */
public class User {
    private String[] arrs;
    public void setArrs(String[] arrs){
        this.arrs=arrs;
    }
    public void printArrs(){
        System.out.println("User:arrs");
        for(String arr:this.arrs){
            System.out.print(arr+"|");
        }
    }

    private List<String> nameList;
    public void setNameList(List<String> nameList){
        this.nameList=nameList;
    }
    public void printNameList(){
        System.out.println("User:nameList");
        System.out.println(this.nameList);
    }

    private Map<String,String> map;
    public void setMap(Map<String,String> map){
        this.map=map;
    }
    public void printMap(){
        System.out.println(this.map);
    }

    private Properties properties;
    public void setProperties(Properties properties){
        this.properties=properties;
    }
    public void printProperties(){
        System.out.println(this.properties);
    }
}
