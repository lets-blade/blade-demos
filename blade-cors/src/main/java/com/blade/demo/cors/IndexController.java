package com.blade.demo.cors;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.blade.mvc.annotation.GetRoute;
import com.blade.mvc.annotation.JSON;
import com.blade.mvc.annotation.Path;
import com.blade.mvc.ui.RestResponse;

/**
 * @author psh
 * @date 2018/11/2
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
        User sam = new User(1, "sam", 22, new Date());
        User tom = new User(2, "tom", 23, new Date());
        users.add(sam);
        users.add(tom);
        return users;
    }

}
