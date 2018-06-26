package com.blade.demo.route;

import com.blade.mvc.annotation.GetRoute;
import com.blade.mvc.annotation.JSON;
import com.blade.mvc.annotation.Path;
import com.blade.mvc.annotation.PostRoute;
import com.blade.mvc.ui.RestResponse;

/**
 * @author biezhi
 * @date 2018/6/26
 */
@Path
public class RestController {

    @PostRoute("/hello")
    @JSON
    public RestResponse hello(){
        return RestResponse.ok("hello");
    }

    @GetRoute("/world")
    @JSON
    public RestResponse world(){
        return RestResponse.ok("world");
    }

}
