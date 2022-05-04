package com.blade.demo.helloworld;

import com.hellokaton.blade.Blade;

/**
 * @author hellokaton
 * @date 2022/5/3
 */
public class HelloApplication {

    public static void main(String[] args) {
        Blade.create().get("/", ctx -> ctx.text("Hello World")).start(HelloApplication.class, args);
    }

}
