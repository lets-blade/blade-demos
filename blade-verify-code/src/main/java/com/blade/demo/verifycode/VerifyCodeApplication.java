package com.blade.demo.verifycode;

import com.hellokaton.blade.Blade;
import com.hellokaton.blade.options.HttpOptions;
import com.hellokaton.blade.patchca.DefaultPatchca;
import com.hellokaton.blade.patchca.PatchcaException;

/**
 * Blade Patcha Example
 * <p>
 * 1. generate code
 * http://127.0.0.1:9000/code
 * <p>
 * 2. verify code
 * http://127.0.0.1:9000/verify?code=LmCGY
 *
 * @author hellokaton
 * @date 2022/5/4
 */
public class VerifyCodeApplication {

    public static void main(String[] args) {

        // 这行代码应该放在启动时加载
        DefaultPatchca patchca = new DefaultPatchca();

        Blade.create()
                .get("/code", ctx -> {
                    try {
                        String code = patchca.render();
                        System.out.println("verify code: " + code);
                    } catch (PatchcaException e) {
                        System.out.println("Patchca Error: " + e.getMessage());
                    }
                })
                .get("/verify", ctx -> {
                    String code = ctx.request().query("code", "CODE");
                    boolean success = patchca.verify(code);
                    ctx.text("verify result: " + success);
                })
                .http(HttpOptions::enableSession)
                .start(VerifyCodeApplication.class, args);
    }

}
