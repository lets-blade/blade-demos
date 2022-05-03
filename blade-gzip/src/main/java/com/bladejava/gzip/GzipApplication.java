package com.bladejava.gzip;

import com.hellokaton.blade.Blade;
import com.hellokaton.blade.options.HttpOptions;

/**
 * @author hellokaton
 * @date 2022/5/3
 */
public class GzipApplication {

    public static void main(String[] args) {
        Blade.of()
                .get("/", ctx -> ctx.render("index.html"))
                .http(HttpOptions::enableGzip)
                .start(GzipApplication.class, args);
    }

}
