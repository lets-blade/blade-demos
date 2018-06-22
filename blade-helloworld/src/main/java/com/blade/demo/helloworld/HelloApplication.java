package com.blade.demo.helloworld;

import com.blade.Blade;

/**
 * @author biezhi
 * @date 2017/9/28
 */
public class HelloApplication {

    public static void main(String[] args) {
        Blade.of().get("/", ctx -> ctx.text("Hello World")).start(HelloApplication.class, args);
    }

}
