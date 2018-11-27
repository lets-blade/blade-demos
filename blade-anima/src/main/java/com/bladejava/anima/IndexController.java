package com.bladejava.anima;

import com.blade.mvc.annotation.*;
import com.blade.mvc.ui.RestResponse;

import static io.github.biezhi.anima.Anima.deleteById;
import static io.github.biezhi.anima.Anima.select;

@Path(restful = true)
public class IndexController {

    @GetRoute("users")
    public RestResponse users() {
        return RestResponse.ok(select().from(User.class).all());
    }

    @PostRoute("users")
    public RestResponse saveUser(@BodyParam User user) {
        return RestResponse.ok(user.save().asInt());
    }

    @DeleteRoute("user/:uid")
    public RestResponse deleteUser(@PathParam Integer uid) {
        return RestResponse.ok(deleteById(User.class, uid));
    }

}
