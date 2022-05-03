package com.blade.demo.cors;

import com.hellokaton.blade.Blade;
import com.hellokaton.blade.options.CorsOptions;

public class CorsApplication {

    public static void main(String[] args) {
        CorsOptions corsOptions = CorsOptions.forAnyOrigin().allowNullOrigin().allowCredentials();

        Blade.of()
                .cors(corsOptions)
                .start(CorsApplication.class, args);

    }

}
