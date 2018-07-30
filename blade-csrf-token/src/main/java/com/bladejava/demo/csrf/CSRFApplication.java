package com.bladejava.demo.csrf;

import com.blade.Blade;
import com.blade.security.web.csrf.CsrfMiddleware;

/**
 * CSRF Token Example
 *
 * 一个请求发送后 token 会被存储在 request context,
 * 你可以通过 request.attribute("_csrf_token") 获取。
 * 也可以通过在模板文件中输出一个 input, 通过 request.attribute("_csrf_token_input") 获取。
 *
 * 客户端在发送 POST 请求的时候必须至少包含以下一个参数
 *
 * 1. 在 header 中传递 X-CSRF-TOKEN, 值为 token
 * 2. 在 header 中传递 X-XSRF-TOKEN, 值为 token
 * 3. 在 form 表单中传递 _token, 值为 token
 *
 * @author biezhi
 * @date 2018/7/30
 */
public class CSRFApplication {

    public static void main(String[] args) {
        Blade.of()
                .get("/", ctx -> ctx.text("token: " + ctx.request().attribute("_csrf_token")))
                .post("/", ctx -> ctx.text("Access OK!"))
                .use(new CsrfMiddleware())
                .start(CSRFApplication.class, args);
    }

}
