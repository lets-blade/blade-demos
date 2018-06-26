package com.bladejava.demo.controller;

import com.blade.ioc.annotation.Inject;
import com.blade.kit.StringKit;
import com.blade.mvc.annotation.*;
import com.blade.mvc.ui.RestResponse;
import com.bladejava.demo.model.User;
import com.bladejava.demo.service.UserService;

import java.util.Collections;

/**
 * @author biezhi
 * @date 2018/5/31
 */
@Path("user")
public class UserController {

    @Inject
    private UserService userService;

    @PostRoute("save")
    @JSON
    public RestResponse saveUser(@BodyParam User user) {
        return RestResponse.ok(userService.saveUser(user));
    }

    @GetRoute("list")
    @JSON
    public RestResponse list() {
        return RestResponse.ok(Collections.singletonList(new User(123L, "biezhi")));
    }

    @GetRoute("detail/:uid")
    @JSON
    public RestResponse detail(@PathParam Long uid) {
        return RestResponse.ok(new User(uid, StringKit.rand(10)));
    }

}
