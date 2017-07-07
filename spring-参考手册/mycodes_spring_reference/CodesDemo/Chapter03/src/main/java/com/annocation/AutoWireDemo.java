package main.java.com.annocation;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by daiya on 2017/7/7.
 */
public class AutoWireDemo {
    @Autowired
    private AnnocationDemo1 annocationDemo1;

    public AnnocationDemo1 getAnnocationDemo1() {
        return annocationDemo1;
    }

    public void setAnnocationDemo1(AnnocationDemo1 annocationDemo1) {
        this.annocationDemo1 = annocationDemo1;
    }
}
