package com.demo;

import static com.blade.Blade.*;

/**
 * Created by biezhi on 2017/2/18.
 */
public class Application {

    public static void main(String[] args) {
        $().get("/", (request, response) -> {
            response.html("<h1>Hello blade!</h1>");
        }).start(Application.class);
    }

}
