package com.blade.demo.upload;

import com.blade.Blade;
import com.blade.security.web.cors.CorsMiddleware;

/**
 * @author biezhi
 * @date 2017/10/1
 */
public class UploadApplication {

    public static void main(String[] args) {
        Blade.of().showFileList(true)
                .enableCors(true)
                .start(UploadApplication.class, args);
    }
}
