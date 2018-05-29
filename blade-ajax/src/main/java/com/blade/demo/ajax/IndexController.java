package com.blade.demo.ajax;

import java.util.ArrayList;
import java.util.List;

import com.blade.mvc.annotation.GetRoute;
import com.blade.mvc.annotation.JSON;
import com.blade.mvc.annotation.Path;
import com.blade.mvc.ui.RestResponse;

/**
 * @author biezhi
 * @date 2017/9/28
 */
@Path
public class IndexController {

    @GetRoute
    public String index(){
        return "index.html";
    }

    @GetRoute("users")
    @JSON
    public RestResponse<List<User>> users(){
        List<User> users = this.buildUsers();
        return RestResponse.ok(users);
    }

    private List<User> buildUsers(){
        List<User> users = new ArrayList<>();

        return users;
    }

}
