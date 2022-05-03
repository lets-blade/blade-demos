package com.blade.demo.upload;

import com.hellokaton.blade.Blade;
import com.hellokaton.blade.options.CorsOptions;

/**
 * @author biezhi
 * @date 2017/10/1
 */
public class UploadApplication {

    public static void main(String[] args) {
        CorsOptions corsOptions = CorsOptions.forAnyOrigin().allowNullOrigin().allowCredentials();
        Blade.of().showFileList(true)
                .cors(corsOptions)
                .start(UploadApplication.class, args);
    }
}
