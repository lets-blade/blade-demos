package com.blade.demo.param;

import com.hellokaton.blade.annotation.Path;
import com.hellokaton.blade.annotation.request.Body;
import com.hellokaton.blade.annotation.request.Form;
import com.hellokaton.blade.annotation.request.PathParam;
import com.hellokaton.blade.annotation.request.Query;
import com.hellokaton.blade.annotation.route.GET;
import com.hellokaton.blade.annotation.route.POST;
import com.hellokaton.blade.mvc.http.Request;
import com.hellokaton.blade.mvc.http.Response;
import com.hellokaton.blade.mvc.ui.ResponseType;
import com.hellokaton.blade.mvc.ui.RestResponse;

import java.util.Map;
import java.util.Optional;

/**
 * @author biezhi
 * @date 2018/5/30
 */
@Path(responseType = ResponseType.JSON)
public class IndexController {

    /**
     * http://127.0.0.1:9000/p1
     * http://127.0.0.1:9000/p1?test=hello
     *
     * @param test
     * @return
     */
    @GET("p1")
    public RestResponse p1(@Query String test) {
        return RestResponse.ok(test);
    }

    @POST("p2")
    public void p2(@Form String test, com.hellokaton.blade.mvc.http.Response response) {
        response.text(Optional.ofNullable(test).orElse("默认值"));
    }

    @GET("p3/:uid")
    public void p3(@PathParam Integer uid, Response response) {
        response.text("UID: " + uid);
    }

    @GET("p4")
    public void p4(Request request, Response response) {
        response.text("username: " + request.query("username", "默认值"));
    }

    @GET("p5")
    public RestResponse p5(User user) {
        return RestResponse.ok(user);
    }

    @GET("p6")
    public RestResponse p6(@Query(name = "user") User user) {
        return RestResponse.ok(user);
    }

    @GET("p7")
    public RestResponse p7(@Body User user) {
        return RestResponse.ok(user);
    }

    /**
     * curl -X POST \
     * http://127.0.0.1:9000/p8 \
     * -H 'content-type: application/json' \
     * -d '{"name":"{\"inoutTypeCode\":2,\"passDeviceCode\":\"TZ_001_65010078ZHONGDA_I7\",\"passTypeCode\":1,\"idnumber\":\"152825198404205136\",\"passTime\":\"2018-06-01 14:05:33\",\"name\":\"两伊。\",\"snapPhoto\":\"data:image/jpeg;base64,Qk12AQAAAAAAADYAAAAoAAAADQAAAAgAAAABABgAAAAAAEABAAAAAAAAAAAAAAAAAAAAAAAA////////////////////////////////////////////////////AP///////////////////////////////////////////////////wD///////////////////////////////////////////////////8A////////////////////////////////////////////////////AFpaWlpaWlpaWlpaWlpaWlpaWlRUVHt7e////////////////////wAAAAAAAAAAAAAAAAAAAAAAAAAAAAAqKir///////////////////8AAAAAAAAAAAAAAAAAAAAAAAAAAAAANTU1////////////////////AAAAAAAAAAAAAAAAAAAAAAAAAAAAADU1Nf///////////////////wA=\",\"refId\":\"p9049vighuhg0r83dbfv7ip1f6\",\"idCardPhoto\":\"data:image/jpeg;base64,Qk12AQAAAAAAADYAAAAoAAAADQAAAAgAAAABABgAAAAAAEABAAAAAAAAAAAAAAAAAAAAAAAA////////////////////////////////////////////////////AP///////////////////////////////////////////////////wD///////////////////////////////////////////////////8A////////////////////////////////////////////////////AFpaWlpaWlpaWlpaWlpaWlpaWlRUVHt7e////////////////////wAAAAAAAAAAAAAAAAAAAAAAAAAAAAAqKir///////////////////8AAAAAAAAAAAAAAAAAAAAAAAAAAAAANTU1////////////////////AAAAAAAAAAAAAAAAAAAAAAAAAAAAADU1Nf///////////////////wA=\"}"}'
     */
    @POST("p8")
    public RestResponse p8(@Body Map<String, Object> map) {
        return RestResponse.ok(map);
    }

}
