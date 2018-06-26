package com.blade.demo.route;

import com.blade.mvc.annotation.GetRoute;
import com.blade.mvc.annotation.Path;
import com.blade.mvc.annotation.PostRoute;
import com.blade.mvc.ui.RestResponse;

/**
 * @author biezhi
 * @date 2018/6/26
 */
@Path(value = "rest", restful = true)
public class RestController2 {

    @PostRoute("/hello")
    public RestResponse hello(){
        return RestResponse.ok("hello");
    }

    @GetRoute("/world")
    public RestResponse world(){
        return RestResponse.ok("world");
    }

}
