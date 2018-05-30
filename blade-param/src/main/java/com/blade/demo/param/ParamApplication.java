package com.blade.demo.param;

import com.blade.Blade;

/**
 * @author biezhi
 * @date 2018/5/30
 */
public class ParamApplication {

    public static void main(String[] args) {
        Blade.me().start(ParamApplication.class, args);
    }
}
