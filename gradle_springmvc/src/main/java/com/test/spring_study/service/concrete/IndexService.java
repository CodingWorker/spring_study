package com.test.spring_study.service.concrete;

import com.test.spring_study.dao.IIndexDAO;
import com.test.spring_study.service.IIndexService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by IntelliJ IDEA
 * User:    DaiYan
 * Date:    2017/10/12
 * Project: my-spring-proj
 */
@Service
public class IndexService implements IIndexService {
    @Autowired
    private IIndexDAO indexDAO;

    public String get(){
        return "index service |"+this.indexDAO.get();
    }
}
