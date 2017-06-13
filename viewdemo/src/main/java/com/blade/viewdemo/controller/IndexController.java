package com.blade.viewdemo.controller;

import com.blade.kit.StringKit;
import com.blade.mvc.annotation.Path;
import com.blade.mvc.annotation.Route;
import com.blade.mvc.http.HttpMethod;
import com.blade.mvc.http.Request;

/**
 * Created by biezhi on 2017/2/18.
 */
@Path
public class IndexController {

    @Route(value = {"/", "/index"}, method = HttpMethod.GET)
    public String index(Request request) {
        request.attribute("id", StringKit.rand(20));
        return "index.html";
    }

}
