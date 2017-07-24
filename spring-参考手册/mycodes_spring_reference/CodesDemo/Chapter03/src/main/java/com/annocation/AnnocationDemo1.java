package main.java.com.annocation;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by daiya on 2017/7/7.
 */
public class AnnocationDemo1 {

    @Autowired
    private InnerTestDemo innerTestDemo;

    public AnnocationDemo1(){}

    //@Autowired也可以用于构造器
    @Autowired
    public AnnocationDemo1(InnerTestDemo innerTestDemo){
        this.innerTestDemo=innerTestDemo;
    }

    public InnerTestDemo getInnerTestDemo() {
        return innerTestDemo;
    }

    @Autowired
    public void setInnerTestDemo(InnerTestDemo innerTestDemo) {
        this.innerTestDemo = innerTestDemo;
    }
}
