package main.java.com.example;

import com.mysql.jdbc.Driver;

import java.sql.DriverManager;

/**
 * Created by daiya on 2017/7/6.
 */
public class UseJDBC {
    private Driver driver;
    private String url;

    public Driver getDriver() {
        return driver;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
