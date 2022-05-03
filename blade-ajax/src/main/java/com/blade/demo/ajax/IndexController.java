package com.blade.demo.ajax;

import com.hellokaton.blade.annotation.Path;
import com.hellokaton.blade.annotation.route.GET;
import com.hellokaton.blade.mvc.ui.ResponseType;
import com.hellokaton.blade.mvc.ui.RestResponse;

import java.util.ArrayList;
import java.util.List;

/**
 * @author biezhi
 * @date 2017/9/28
 */
@Path
public class IndexController {

    @GET
    public String index() {
        return "index.html";
    }

    @GET(value = "users", responseType = ResponseType.JSON)
    public RestResponse<List<User>> users() {
        List<User> users = this.buildUsers();
        return RestResponse.ok(users);
    }

    private List<User> buildUsers() {
        List<User> users = new ArrayList<>();
        return users;
    }

}
