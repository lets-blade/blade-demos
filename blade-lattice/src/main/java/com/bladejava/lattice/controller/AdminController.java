package com.bladejava.lattice.controller;

import com.hellokaton.blade.annotation.Path;
import com.hellokaton.blade.annotation.route.GET;
import com.hellokaton.blade.annotation.route.POST;
import com.hellokaton.blade.mvc.ui.RestResponse;
import com.hellokaton.lattice.annotation.Permissions;
import com.hellokaton.lattice.annotation.Roles;
import com.hellokaton.lattice.annotation.Users;

/**
 * @author biezhi
 * @date 2018/6/4
 */
@Path("admin")
@Users
public class AdminController {

    @GET("index")
    public String index() {
        return "index.html";
    }

    @Roles("admin")
    @GET("deleteUser")
    public String deleteUserPage() {
        return "delete";
    }

    @Permissions("user:delete")
    @POST("deleteUser")
    public RestResponse deleteUser() {
        return RestResponse.ok();
    }

}
