package com.bladejava.demo.controller;

import com.bladejava.demo.model.User;
import com.bladejava.demo.service.UserService;
import com.hellokaton.blade.annotation.Path;
import com.hellokaton.blade.annotation.request.Body;
import com.hellokaton.blade.annotation.request.PathParam;
import com.hellokaton.blade.annotation.route.GET;
import com.hellokaton.blade.annotation.route.POST;
import com.hellokaton.blade.ioc.annotation.Inject;
import com.hellokaton.blade.kit.StringKit;
import com.hellokaton.blade.mvc.ui.ResponseType;
import com.hellokaton.blade.mvc.ui.RestResponse;

import java.util.Collections;

/**
 * @author biezhi
 * @date 2018/5/31
 */
@Path(value = "user", responseType = ResponseType.JSON)
public class UserController {

    @Inject
    private UserService userService;

    @POST("save")
    public RestResponse<?> saveUser(@Body User user) {
        return RestResponse.ok(userService.saveUser(user));
    }

    @GET("list")
    public RestResponse<?> list() {
        return RestResponse.ok(Collections.singletonList(new User(123L, "biezhi")));
    }

    @GET("detail/:uid")
    public RestResponse<?> detail(@PathParam Long uid) {
        return RestResponse.ok(new User(uid, StringKit.rand(10)));
    }

}
