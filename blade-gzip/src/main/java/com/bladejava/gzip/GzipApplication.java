package com.bladejava.gzip;

import com.blade.Blade;

/**
 * @author biezhi
 * @date 2018/6/1
 */
public class GzipApplication {

    public static void main(String[] args) {
        Blade.of()
                .get("/", ctx -> ctx.render("index.html"))
                .gzip(true)
                .start(GzipApplication.class, args);
    }

}
