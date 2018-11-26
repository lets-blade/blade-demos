package com.blade.demo.cors;

import com.blade.Blade;
import com.blade.security.web.cors.CorsConfiger;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 *
 */
public class CorsApplication {

    public static void main(String[] args) {

        Blade.of()
            .enableCors(Boolean.TRUE) // or   .enableCors(Boolean.TRUE, getCorsConfiger())
            .start(CorsApplication.class, args);

    }

    public static CorsConfiger getCorsConfiger() {
        return CorsConfiger.builder()
            .allowedMethods(Stream.of("GET", "OPTIONS", "HEAD", "PUT", "POST", "DELETE").collect(Collectors.toList()))
            .allowedHeaders(Stream
                .of("Origin", "X-Requested-With", "Content-Type", "Accept", "Connection", "User-Agent", "Cookie",
                    "Cache-Control").collect(
                    Collectors.toList()))
            .maxAge(1300L)
            .allowCredentials(Boolean.TRUE)
            .build();
    }
}
