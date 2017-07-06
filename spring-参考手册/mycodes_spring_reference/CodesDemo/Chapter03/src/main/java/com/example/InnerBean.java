package main.java.com.example;

/**
 * Created by daiya on 2017/7/6.
 */
public class InnerBean {
    private InnerBeanItem innerBeanItem;
    public InnerBean(InnerBeanItem innerBeanItem){
        this.innerBeanItem=innerBeanItem;
    }

    public InnerBean(){}

    public InnerBeanItem getInnerBeanItem() {
        return innerBeanItem;
    }

    public void setInnerBeanItem(InnerBeanItem innerBeanItem) {
        this.innerBeanItem = innerBeanItem;
    }
}
