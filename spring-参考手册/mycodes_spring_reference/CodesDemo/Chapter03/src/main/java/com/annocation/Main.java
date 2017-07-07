package main.java.com.annocation;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

import java.io.File;

/**
 * Created by daiya on 2017/7/7.
 */
public class Main {
    public static void main(String[] args){
        File file=new File("Chapter03/spring-test.xml");
        org.springframework.core.io.FileSystemResource resource=new FileSystemResource(file);
        BeanFactory bf= new XmlBeanFactory(resource);

        AnnocationDemo1 annocationDemo1=(AnnocationDemo1) bf.getBean("annocationDemo1");

        AutoWireDemo autoWireDemo=(AutoWireDemo)bf.getBean("autoWireDemo");
        System.out.println(autoWireDemo);
    }
}
