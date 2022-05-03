package com.blade.demo.route;

import com.hellokaton.blade.annotation.Path;
import com.hellokaton.blade.annotation.request.Form;
import com.hellokaton.blade.annotation.route.POST;
import com.hellokaton.blade.mvc.ui.ResponseType;
import com.hellokaton.blade.mvc.ui.RestResponse;

/**
 * @author biezhi
 * @date 2022/5/3
 */
@Path(value = "user", responseType = ResponseType.JSON)
public class UserController {

    @POST("save")
    public RestResponse<?> saveUser(@Form String username, @Form String password) {
        System.out.println("username => " + username);
        System.out.println("password => " + password);
        return RestResponse.ok();
    }

    @POST("save-by-model")
    public RestResponse<?> saveUserByModel(User user) {
        System.out.println("username => " + user.getUsername());
        System.out.println("password => " + user.getPassword());
        return RestResponse.ok();
    }


}
