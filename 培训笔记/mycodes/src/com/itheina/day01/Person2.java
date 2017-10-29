package com.itheina.day01;

/**
 * Created by DaiYan on 2017/4/16.
 */
public class Person2 {
    public String Name;
    public int Age;
    public Person2(String name,int age){
        this.Name=name;
        this.Age=age;
    }

    public void setName(String name){
        this.Name=name;
    }

    public void setAge(int age){
        this.Age=age;
    }

    public Person2(){
    }

    @Override
    public String toString(){
        return "Name: "+Name+", Age: "+Age;
    }
}
