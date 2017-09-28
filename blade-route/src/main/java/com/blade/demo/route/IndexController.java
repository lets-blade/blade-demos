package com.blade.demo.route;

import com.blade.mvc.annotation.GetRoute;
import com.blade.mvc.annotation.Path;

/**
 * @author biezhi
 * @date 2017/9/28
 */
@Path
public class IndexController {

    @GetRoute("hello")
    public String hello(){
        return "hello.html";
    }

}
