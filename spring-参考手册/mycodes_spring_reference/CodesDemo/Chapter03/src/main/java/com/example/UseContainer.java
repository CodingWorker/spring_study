package main.java.com.example;

import org.springframework.util.StringUtils;

/**
 * Created by daiya on 2017/7/4.
 */
public class UseContainer {
    private UseItem item;
    private UseMeta meta;

    private String val_string;
    private int val_int;

    private String name;
    private int age;

    public UseContainer(UseItem item){this.item=item;}

    public UseContainer(){
        this.name="Daniel";
        this.age=12;
    }

    public UseContainer(String name,Integer age){
        if(StringUtils.isEmpty(name)){
            name="Daniel";
        }
        this.name=name;

        if(age==null){
            age=12;
        }
        this.age=age;
    }

    public UseItem getItem(){return this.item;}
    public void setItem(UseItem item){this.item=item;}

    public String getName(){return this.name;}
    public void setName(String name){this.name=name;}

    public int getAge(){return this.age;}
    public void setAge(int age){this.age=age;}

    public String getVal_string(){return this.val_string;}
    public void setVal_string(String val_string){this.val_string=val_string;}

    public int getVal_int(){return this.val_int;}
    public void setVal_int(int val_int){this.val_int=val_int;}

    public UseMeta getMeta(){return this.meta;}
    public void setMeta(UseMeta meta){this.meta=meta;}
}
