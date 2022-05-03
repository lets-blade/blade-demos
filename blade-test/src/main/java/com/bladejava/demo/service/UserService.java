package com.bladejava.demo.service;

import com.bladejava.demo.model.User;
import com.hellokaton.blade.ioc.annotation.Bean;

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
