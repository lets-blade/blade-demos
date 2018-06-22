package com.bladejava.lattice.controller;

import com.blade.mvc.annotation.GetRoute;
import com.blade.mvc.annotation.Path;
import com.blade.mvc.annotation.PostRoute;
import com.blade.mvc.ui.RestResponse;
import io.github.biezhi.lattice.annotation.Permissions;
import io.github.biezhi.lattice.annotation.Roles;
import io.github.biezhi.lattice.annotation.Users;

/**
 * @author biezhi
 * @date 2018/6/4
 */
@Path("admin")
@Users
public class AdminController {

    @GetRoute("index")
    public String index() {
        return "index.html";
    }

    @Roles("admin")
    @GetRoute("deleteUser")
    public String deleteUserPage() {
        return "delete";
    }

    @Permissions("user:delete")
    @PostRoute("deleteUser")
    public RestResponse deleteUser() {
        return RestResponse.ok();
    }

}
