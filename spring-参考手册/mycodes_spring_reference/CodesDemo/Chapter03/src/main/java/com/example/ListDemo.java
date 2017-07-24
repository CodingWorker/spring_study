package main.java.com.example;

import java.util.List;
import java.util.Map;

/**
 * Created by daiya on 2017/7/6.
 */
public class ListDemo {
    private List<String> nameList;
    private Map<String,Object> nameMap;
    private String innerString;

    public ListDemo(){}

    public ListDemo(List<String> nameList) {
        this.nameList = nameList;
    }

    public List<String> getNameList() {
        return this.nameList;
    }

    public void setNameList(List<String> nameList) {
        this.nameList = nameList;
    }

    public Map<String, Object> getNameMap() {
        return nameMap;
    }

    public void setNameMap(Map<String, Object> nameMap) {
        this.nameMap = nameMap;
    }

    public String getInnerString() {
        return innerString;
    }

    public void setInnerString(String innerString) {
        this.innerString = innerString;
    }
}
