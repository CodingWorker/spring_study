package com.test.spring_study.dao.concrete;

import com.test.spring_study.dao.IIndexDAO;
import org.springframework.stereotype.Repository;

/**
 * Created by IntelliJ IDEA
 * User:    DaiYan
 * Date:    2017/10/12
 * Project: my-spring-proj
 */
@Repository
public class IndexDAO implements IIndexDAO {
    public String get(){
        return "index dao";
    }
}
