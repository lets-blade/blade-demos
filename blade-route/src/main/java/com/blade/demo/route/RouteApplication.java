package com.blade.demo.route;

import com.blade.Blade;

/**
 * @author biezhi
 * @date 2017/9/28
 */
public class RouteApplication {

    public static void main(String[] args) {
        Blade.of()
                .get("/get", ctx -> ctx.text("Get Route"))
                .post("/post", ctx -> ctx.text("Post Route"))
                .start(RouteApplication.class, args);
    }

}
