package main.java.hello;

import org.joda.time.LocalTime;//即使没有找到但是实际上gradle已经将joda包编译进去了

/**
 * Created by daiya on 2017/6/22.
 */
public class HelloWorld {
    public static void main(String[] args) {
        LocalTime currentTime=new LocalTime();
        System.out.println("the current time is: "+currentTime);

        Greeter greeter = new Greeter();
        System.out.println(greeter.sayHello());
    }
}
