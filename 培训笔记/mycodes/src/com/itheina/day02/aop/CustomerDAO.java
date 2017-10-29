package com.itheina.day02.aop;

import org.springframework.stereotype.Repository;

/**
 * Created by DaiYan on 2017/4/16.
 */
//@Repository(value="customerDAO")
public class CustomerDAO implements ICustomerDAO {
    public void save(){
        System.out.println("CustomerDAO:save called");
    }

    public void update(){
        System.out.println("CustomerDAO:update called");
    }

}
