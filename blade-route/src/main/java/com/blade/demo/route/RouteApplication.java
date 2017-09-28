package com.blade.demo.route;

import com.blade.Blade;

/**
 * @author biezhi
 * @date 2017/9/28
 */
public class RouteApplication {

    public static void main(String[] args) {
        Blade.me()
                .get("/get", (request, response) -> response.text("Get Route"))
                .post("/post", (request, response) -> response.text("Post Route"))
                .start(RouteApplication.class, args);
    }

}
