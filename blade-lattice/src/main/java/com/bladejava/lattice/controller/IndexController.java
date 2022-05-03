package com.bladejava.lattice.controller;

import com.hellokaton.blade.annotation.Path;
import com.hellokaton.blade.annotation.route.GET;
import com.hellokaton.blade.mvc.http.Response;

/**
 * @author biezhi
 * @date 2018/6/4
 */
@Path
public class IndexController {

    @GET("/")
    public void home(Response response) {
        response.html("Home Page.");
    }

    @GET("/login")
    public String login() {
        return "login.html";
    }

}
