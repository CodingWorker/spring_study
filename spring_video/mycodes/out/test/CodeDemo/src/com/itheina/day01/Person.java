package com.itheina.day01;

/**
 * Created by DaiYan on 2017/4/15.
 */
public class Person {
    private String Name;
    private int Age;
    public Person(String name,int age){
        this.Name=name;
        this.Age=age;
    }

    @Override
    public String toString(){
        return "Name: "+Name+", Age: "+Age;
    }
}
