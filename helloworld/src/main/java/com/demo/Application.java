package com.demo;

import com.blade.Blade;

/**
 * Hello Blade
 * <p>
 * Created by biezhi on 2017/2/18.
 */
public class Application {

    public static void main(String[] args) {
        Blade.me().get("/", ((request, response) ->  response.text("Hello World"))).start();
    }

}
