package com.bladejava.demo.service;

import com.bladejava.demo.model.User;
import com.hellokaton.blade.ioc.annotation.Bean;
import com.hellokaton.blade.ioc.annotation.Inject;

/**
 * @author biezhi
 * @date 2018/5/31
 */
@Bean
public class PostService {

    @Inject
    private UserService userService;

    public boolean savePost(Long uid) {
        userService.saveUser(new User(uid, "biezhi"));
        // save post
        return true;
    }

}
