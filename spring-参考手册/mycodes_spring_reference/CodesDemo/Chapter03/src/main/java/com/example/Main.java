package main.java.com.example;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

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

//        UseJDBC useJDBC=(UseJDBC)bf.getBean("useJDBC");
//        System.out.println(useJDBC.getUrl());

//        使用内部bean
        InnerBean innerBean=(InnerBean)bf.getBean("innerBean");
        System.out.println(innerBean.getInnerBeanItem().hashCode());

        ListDemo listDemo=(ListDemo)bf.getBean("listDemo");
        System.out.println(listDemo.getNameList().get(0));
        //使用<null/>
        System.out.println(listDemo.getNameMap()==null);
        System.out.println(listDemo.getInnerString().equals(""));
        System.out.println("|"+listDemo.getInnerString()+"|");

        //测试p命名空间
        UsePNameSpace usePNameSpace=(UsePNameSpace)bf.getBean("usePNameSpace");
        System.out.println(usePNameSpace.getEmail());
        System.out.println(usePNameSpace.getpNameSpaceItem());
    }
}
