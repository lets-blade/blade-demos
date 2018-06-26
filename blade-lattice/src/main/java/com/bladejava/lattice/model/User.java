package com.bladejava.lattice.model;

/**
 * @author biezhi
 * @date 2018/6/4
 */
public class User {

    private String  username;
    private String  password;
    private Integer age;
    private String  nickname;

    public User() {
    }

    public User(String username, String password, Integer age, String nickname) {
        this.username = username;
        this.password = password;
        this.age = age;
        this.nickname = nickname;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
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

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }
}
