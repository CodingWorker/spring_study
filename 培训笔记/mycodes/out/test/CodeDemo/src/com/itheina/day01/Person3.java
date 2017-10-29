package com.itheina.day01;

/**
 * Created by DaiYan on 2017/4/16.
 */
    public class Person3 {
    private String Name;
    private int Age;
    private boolean IsOK;

    public void setIsOK(boolean isOK){
        this.IsOK=isOK;
    }

    public Person3(String name, int age) {
        this.Name = name;
        this.Age = age;
    }

    public void setName(String name) {
        this.Name = name;
    }

    public void setAge(int age) {
        this.Age = age;
    }

    public Person3() {
    }

    @Override
    public String toString() {
        return "Name: " + Name + ", Age: " + Age;
    }
}
