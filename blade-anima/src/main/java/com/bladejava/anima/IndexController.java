package com.bladejava.anima;

import com.hellokaton.blade.annotation.Path;
import com.hellokaton.blade.annotation.request.Body;
import com.hellokaton.blade.annotation.request.PathParam;
import com.hellokaton.blade.annotation.route.DELETE;
import com.hellokaton.blade.annotation.route.GET;
import com.hellokaton.blade.annotation.route.POST;
import com.hellokaton.blade.mvc.ui.ResponseType;
import com.hellokaton.blade.mvc.ui.RestResponse;

import static com.hellokaton.anima.Anima.deleteById;
import static com.hellokaton.anima.Anima.select;

@Path(responseType = ResponseType.JSON)
public class IndexController {

    @GET("users")
    public RestResponse users() {
        return RestResponse.ok(select().from(User.class).all());
    }

    @POST("users")
    public RestResponse saveUser(@Body User user) {
        return RestResponse.ok(user.save().asInt());
    }

    @DELETE("user/:uid")
    public RestResponse deleteUser(@PathParam Integer uid) {
        return RestResponse.ok(deleteById(User.class, uid));
    }

}
