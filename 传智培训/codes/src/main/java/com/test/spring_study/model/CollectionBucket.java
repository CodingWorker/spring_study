package com.test.spring_study.model;

import com.sun.org.apache.xpath.internal.SourceTree;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.lang.model.element.NestingKind;
import java.util.*;

/**
 * Created by IntelliJ IDEA
 * Project: spring-app
 * User: DaiYan
 * Date: 2017/10/29
 */
public class CollectionBucket {
    private List<String> list;
    private Map<String,String> map;
    private Properties properties;

    public List<String> getList() {
        return list;
    }

    public void setList(List<String> list) {
        this.list = list;
    }

    public Map<String, String> getMap() {
        return map;
    }

    public void setMap(Map<String, String> map) {
        this.map = map;
    }

    public Properties getProperties() {
        return properties;
    }

    public void setProperties(Properties properties) {
        this.properties = properties;
    }
}

class CollectionBucketTest{
    public static void main(String[] args) {
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("applicationContext.xml");
        CollectionBucket collectionBucket=(CollectionBucket)applicationContext.getBean("collectionBucket");
        Iterator<String> iterator_list=collectionBucket.getList().iterator();
        while (iterator_list.hasNext()) {
            System.out.println(iterator_list.next());
        }

        Set<Map.Entry<String,String>> entrySet_map=collectionBucket.getMap().entrySet();
        for(Map.Entry entry:entrySet_map){
            System.out.println(entry.getKey()+" ==> "+entry.getValue());
        }

        Enumeration enumeration=collectionBucket.getProperties().propertyNames();
        while(enumeration.hasMoreElements()){
            System.out.println(enumeration.nextElement());
        }
    }






}