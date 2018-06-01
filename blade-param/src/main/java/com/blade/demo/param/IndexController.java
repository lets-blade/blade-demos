package com.blade.demo.param;

import com.blade.mvc.annotation.*;
import com.blade.mvc.http.Request;
import com.blade.mvc.http.Response;
import com.blade.mvc.ui.RestResponse;

import java.util.Map;
import java.util.Optional;

/**
 * @author biezhi
 * @date 2018/5/30
 */
@Path
public class IndexController {

    /**
     * http://127.0.0.1:9000/p1
     * http://127.0.0.1:9000/p1?test=hello
     *
     * @param test
     * @return
     */
    @GetRoute("p1")
    @JSON
    public RestResponse p1(@Param String test) {
        return RestResponse.ok(test);
    }

    @PostRoute("p2")
    public void p2(@Param String test, Response response) {
        response.text(Optional.ofNullable(test).orElse("默认值"));
    }

    @GetRoute("p3/:uid")
    public void p3(@PathParam Integer uid, Response response) {
        response.text("UID: " + uid);
    }

    @GetRoute("p4")
    public void p4(Request request, Response response) {
        response.text("username: " + request.query("username", "默认值"));
    }

    @GetRoute("p5")
    @JSON
    public RestResponse p5(User user) {
        return RestResponse.ok(user);
    }

    @GetRoute("p6")
    @JSON
    public RestResponse p6(@Param(name = "user") User user) {
        return RestResponse.ok(user);
    }

    @GetRoute("p7")
    @JSON
    public RestResponse p7(@BodyParam User user) {
        return RestResponse.ok(user);
    }

    /**
     * curl -X POST \
     *   http://127.0.0.1:9000/p8 \
     *   -H 'content-type: application/json' \
     *   -d '{"name":"{\"inoutTypeCode\":2,\"passDeviceCode\":\"TZ_001_65010078ZHONGDA_I7\",\"passTypeCode\":1,\"idnumber\":\"152825198404205136\",\"passTime\":\"2018-06-01 14:05:33\",\"name\":\"两伊。\",\"snapPhoto\":\"data:image/jpeg;base64,Qk12AQAAAAAAADYAAAAoAAAADQAAAAgAAAABABgAAAAAAEABAAAAAAAAAAAAAAAAAAAAAAAA////////////////////////////////////////////////////AP///////////////////////////////////////////////////wD///////////////////////////////////////////////////8A////////////////////////////////////////////////////AFpaWlpaWlpaWlpaWlpaWlpaWlRUVHt7e////////////////////wAAAAAAAAAAAAAAAAAAAAAAAAAAAAAqKir///////////////////8AAAAAAAAAAAAAAAAAAAAAAAAAAAAANTU1////////////////////AAAAAAAAAAAAAAAAAAAAAAAAAAAAADU1Nf///////////////////wA=\",\"refId\":\"p9049vighuhg0r83dbfv7ip1f6\",\"idCardPhoto\":\"data:image/jpeg;base64,Qk12AQAAAAAAADYAAAAoAAAADQAAAAgAAAABABgAAAAAAEABAAAAAAAAAAAAAAAAAAAAAAAA////////////////////////////////////////////////////AP///////////////////////////////////////////////////wD///////////////////////////////////////////////////8A////////////////////////////////////////////////////AFpaWlpaWlpaWlpaWlpaWlpaWlRUVHt7e////////////////////wAAAAAAAAAAAAAAAAAAAAAAAAAAAAAqKir///////////////////8AAAAAAAAAAAAAAAAAAAAAAAAAAAAANTU1////////////////////AAAAAAAAAAAAAAAAAAAAAAAAAAAAADU1Nf///////////////////wA=\"}"}'
     */
    @PostRoute("p8")
    @JSON
    public RestResponse p8(@BodyParam Map<String, Object> map) {
        return RestResponse.ok(map);
    }

}
