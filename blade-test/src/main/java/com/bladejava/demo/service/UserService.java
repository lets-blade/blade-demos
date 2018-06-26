package com.bladejava.demo.service;

import com.blade.ioc.annotation.Bean;
import com.bladejava.demo.model.User;

/**
 * @author biezhi
 * @date 2018/5/31
 */
@Bean
public class UserService {

    public String sayHello() {
        return "Hello";
    }

    public Long saveUser(User user) {
        System.out.println("save user: " + user);
        return user.getUid();
    }
}
