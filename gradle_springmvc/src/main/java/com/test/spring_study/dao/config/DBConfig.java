package com.test.spring_study.dao.config;

/**
 * Created by IntelliJ IDEA
 * User:    DaiYan
 * Date:    2017/10/12
 * Project: my-spring-proj
 */
public class DBConfig {
    private static final DBConfig INSTANCE=new DBConfig();
    private String user;
    private String password;
    private String databaseName;
    private String tableName;
    private Long timeout;
    private String dbUrl;

    private DBConfig(){}
    private static DBConfig getInstance(){
        return INSTANCE;
    }

    public String getUser() {
        return user;
    }

    public DBConfig setUser(String user) {
        this.user = user;
        return this;
    }

    public String getPassword() {
        return password;
    }

    public DBConfig setPassword(String password) {
        this.password = password;
        return this;
    }

    public String getDatabaseName() {
        return databaseName;
    }

    public DBConfig setDatabaseName(String databaseName) {
        this.databaseName = databaseName;
        return this;
    }

    public String getTableName() {
        return tableName;
    }

    public DBConfig setTableName(String tableName) {
        this.tableName = tableName;
        return this;
    }

    public Long getTimeout() {
        return timeout;
    }

    public DBConfig setTimeout(Long timeout) {
        this.timeout = timeout;
        return this;
    }

    public String getDbUrl() {
        return dbUrl;
    }

    public DBConfig setDbUrl(String dbUrl) {
        this.dbUrl = dbUrl;
        return this;
    }
}
