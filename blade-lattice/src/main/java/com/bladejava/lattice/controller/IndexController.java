package com.bladejava.lattice.controller;

import com.blade.mvc.annotation.GetRoute;
import com.blade.mvc.annotation.Path;
import com.blade.mvc.http.Response;

/**
 * @author biezhi
 * @date 2018/6/4
 */
@Path
public class IndexController {

    @GetRoute("/")
    public void home(Response response) {
        response.html("Home Page.");
    }

    @GetRoute("/login")
    public String login() {
        return "login.html";
    }

}
