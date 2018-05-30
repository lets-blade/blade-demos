package com.blade.demo.param;

import java.io.Serializable;

/**
 * @author biezhi
 * @date 2018/5/30
 */
public class User implements Serializable {

    private Long uid;
    private String name;

    public Long getUid() {
        return uid;
    }

    public void setUid(Long uid) {
        this.uid = uid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
