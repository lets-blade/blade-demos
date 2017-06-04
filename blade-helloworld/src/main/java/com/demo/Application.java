package com.demo;


import com.blade.Blade;

/**
 * Created by biezhi on 2017/2/18.
 */
public class Application {

    public static void main(String[] args) {
        System.setProperty("com.blade.logger.defaultLogLevel", "DEBUG");
        Blade.me().openMonitor(false).get("/", ((request, response) -> response.text("Hello World"))).start();
    }

}
