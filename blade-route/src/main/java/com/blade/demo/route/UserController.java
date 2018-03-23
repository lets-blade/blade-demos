package com.blade.demo.route;

import com.blade.mvc.annotation.*;
import com.blade.mvc.ui.RestResponse;

/**
 * @author biezhi
 * @date 2017/9/28
 */
@Path("user")
public class UserController {

    @PostRoute("save")
    @JSON
    public RestResponse<?> saveUser(@Param String username, @Param String password){
        System.out.println("username => " + username);
        System.out.println("password => " + password);
        return RestResponse.ok();
    }

    @PostRoute("save-by-model")
    @JSON
    public RestResponse<?> saveUserByModel(User user){
        System.out.println("username => " + user.getUsername());
        System.out.println("password => " + user.getPassword());
        return RestResponse.ok();
    }


}
