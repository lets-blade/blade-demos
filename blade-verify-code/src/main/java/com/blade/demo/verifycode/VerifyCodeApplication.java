package com.blade.demo.verifycode;

import com.blade.Blade;
import com.blade.patchca.DefaultPatchca;
import com.blade.patchca.PatchcaException;

/**
 * Blade Patcha Example
 * <p>
 * 1. generate code
 * http://127.0.0.1:9000/code
 * <p>
 * 2. verify code
 * http://127.0.0.1:9000/verify?code=LmCGY
 *
 * @author biezhi
 * @date 2018/9/14
 */
public class VerifyCodeApplication {

    public static void main(String[] args) {

        // 这行代码应该放在启动时加载
        DefaultPatchca patchca = new DefaultPatchca();

        Blade.of().get("/code", context -> {
            try {
                String code = patchca.render();
                System.out.println("verify code: " + code);
            } catch (PatchcaException e) {
                System.out.println("Patchca Error: " + e.getMessage());
            }
        }).get("/verify", context -> {
            String  code    = context.fromString("code", "CODE");
            boolean success = patchca.verify(code);
            context.text("verify result: " + success);
        }).start(VerifyCodeApplication.class, args);
    }

}
