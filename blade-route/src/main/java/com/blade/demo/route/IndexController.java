package com.blade.demo.route;

import com.hellokaton.blade.annotation.Path;
import com.hellokaton.blade.annotation.route.GET;

/**
 * @author biezhi
 * @date 2017/9/28
 */
@Path
public class IndexController {

    @GET("hello")
    public String hello() {
        return "hello.html";
    }

}
