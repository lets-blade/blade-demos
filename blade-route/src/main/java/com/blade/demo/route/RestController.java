package com.blade.demo.route;

import com.hellokaton.blade.annotation.Path;
import com.hellokaton.blade.annotation.route.GET;
import com.hellokaton.blade.annotation.route.POST;
import com.hellokaton.blade.mvc.ui.ResponseType;
import com.hellokaton.blade.mvc.ui.RestResponse;

/**
 * @author biezhi
 * @date 2018/6/26
 */
@Path(responseType = ResponseType.JSON)
public class RestController {

    @POST("/hello")
    public RestResponse hello() {
        return RestResponse.ok("hello");
    }

    @GET("/world")
    public RestResponse world() {
        return RestResponse.ok("world");
    }

}
