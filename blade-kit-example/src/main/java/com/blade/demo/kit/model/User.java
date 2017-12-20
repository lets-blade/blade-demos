package com.blade.demo.kit.model;

import com.blade.kit.json.JsonFormat;
import com.blade.kit.json.MappingType;

import java.util.Date;

/**
 * @author biezhi
 * @date 2017/12/20
 */
public class User {

    private String  username;
    private Integer age;
    private double  money;

    @JsonFormat(value = "yyyy年MM月dd日 HH:mm", type = MappingType.DATE_PATTEN)
    private Date    birthday;
    private Boolean sex;
    private Byte    status;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public Boolean getSex() {
        return sex;
    }

    public void setSex(Boolean sex) {
        this.sex = sex;
    }

    public Byte getStatus() {
        return status;
    }

    public void setStatus(Byte status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "User(" +
                "username='" + username + '\'' +
                ", age=" + age +
                ", money=" + money +
                ", birthday=" + birthday +
                ", sex=" + sex +
                ", status=" + status +
                ')';
    }
}
