package com.bladejava.demo.service;

import com.blade.ioc.annotation.Bean;
import com.blade.ioc.annotation.Inject;
import com.bladejava.demo.model.User;

/**
 * @author biezhi
 * @date 2018/5/31
 */
@Bean
public class PostService {

    @Inject
    private UserService userService;

    public boolean savePost(Long uid){
        userService.saveUser(new User(uid, "biezhi"));
        // save post
        return true;
    }

}
