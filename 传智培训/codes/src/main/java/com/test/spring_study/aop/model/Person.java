package com.test.spring_study.aop.model;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by IntelliJ IDEA
 * Project: spring-app
 * User: DaiYan
 * Date: 2017/10/29
 */
public class Person {
    private String name;
    private int age;
    private Car car;

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public Person(String name, int age){
        this.name=name;
        this.age=age;
    }

    public void init(){
        System.out.println("======init person====");
    }

    /**
     * sprinng 需要提供无参的构造方法
     */
    public Person(){}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

class Test1{
    public static void main(String[] args) {
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("applicationContext.xml");
        Person person=(Person)applicationContext.getBean("person");
        System.out.println(person.getName());//在配置文件中配置，使用构造方法注入属性
        System.out.println(person.getAge());

        //查看引用类型属性的注入
        System.out.println(person.getCar().getName());
    }
}
