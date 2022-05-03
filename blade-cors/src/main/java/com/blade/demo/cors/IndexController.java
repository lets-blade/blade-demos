package com.blade.demo.cors;

import com.hellokaton.blade.annotation.Path;
import com.hellokaton.blade.annotation.route.GET;
import com.hellokaton.blade.mvc.ui.ResponseType;
import com.hellokaton.blade.mvc.ui.RestResponse;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @author psh
 * @date 2018/11/2
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
        User sam = new User(1, "sam", 22, new Date());
        User tom = new User(2, "tom", 23, new Date());
        users.add(sam);
        users.add(tom);
        return users;
    }

}
