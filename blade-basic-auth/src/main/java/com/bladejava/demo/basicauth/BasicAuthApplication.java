package com.bladejava.demo.basicauth;


import com.hellokaton.blade.Blade;
import com.hellokaton.blade.security.auth.AuthOption;
import com.hellokaton.blade.security.auth.BasicAuthMiddleware;

/**
 * Basic Auth Example
 *
 * @author biezhi
 * @date 2018/7/30
 */
public class BasicAuthApplication {

    public static void main(String[] args) {
        AuthOption authOption = AuthOption.builder().build();
        authOption.addUser("admin", "123456");

        Blade.of()
                .get("/", ctx -> ctx.text("Hello World."))
                .use(new BasicAuthMiddleware(authOption))
                .start(BasicAuthApplication.class, args);
    }

}
