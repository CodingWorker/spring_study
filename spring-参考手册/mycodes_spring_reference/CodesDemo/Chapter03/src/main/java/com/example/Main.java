package main.java.com.example;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.beans.factory.xml.XmlReaderContext;
import org.springframework.context.ApplicationContext;
import org.springframework.core.io.FileSystemResource;
import org.springframework.web.context.support.XmlWebApplicationContext;

/**
 * Created by daiya on 2017/7/4.
 */
public class Main {
    public static void main(String[] args){
        BeanFactory bf=new XmlBeanFactory(new FileSystemResource("Chapter03/spring-test.xml"));
        UseItem item=(UseItem)bf.getBean("useItem");
        UseContainer uc=(UseContainer) bf.getBean("useContainer");
        System.out.println(item==uc.getItem());
        System.out.println(uc.getName());
    }
}
