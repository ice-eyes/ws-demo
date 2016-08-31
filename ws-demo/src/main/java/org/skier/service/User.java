package org.skier.service;

/**
 * @author Xie.Zhe
 */
public class User {

    private Integer id;
    private String userName;
    private String password;
    private Integer age;
    private String loginName;

    public User(){

    }

    public User(String userName, String password, Integer age, String loginName, Integer id) {
        this.userName = userName;
        this.password = password;
        this.age = age;
        this.loginName = loginName;
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getLoginName() {
        return loginName;
    }

    public void setLoginName(String loginName) {
        this.loginName = loginName;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
