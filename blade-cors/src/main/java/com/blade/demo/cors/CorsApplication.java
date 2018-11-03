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
        CorsConfiger corsConfiger = CorsConfiger.builder()
            .allowedMethods(Stream.of("Origin", "X-Requested-With", "Content-Type", "Accept", "Connection", "User-Agent", "Cookie", "Cache-Control").collect(
                Collectors.toList()))
            .allowedHeaders(Stream.of("GET", "OPTIONS", "HEAD", "PUT", "POST", "DELETE").collect(Collectors.toList()))
            .maxAge(1300L)
            .allowCredentials(Boolean.TRUE)
            .build();

        Blade.of()
            .enableCors(Boolean.TRUE) // 这行代码你可以自己定义response的heads， 或者你使用默认的 enableCors(Boolean.TRUE)
            .start(CorsApplication.class, args);
    }
}
