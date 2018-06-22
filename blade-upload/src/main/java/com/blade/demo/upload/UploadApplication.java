package com.blade.demo.upload;

import com.blade.Blade;

/**
 * @author biezhi
 * @date 2017/10/1
 */
public class UploadApplication {

    public static void main(String[] args) {
        Blade.of().showFileList(true).start(UploadApplication.class, args);
    }
}
