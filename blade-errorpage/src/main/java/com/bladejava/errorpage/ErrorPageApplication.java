package com.bladejava.errorpage;

import com.blade.Blade;

/**
 * @author biezhi
 * @date 2018/6/3
 */
public class ErrorPageApplication {

    public static void main(String[] args) {
        Blade.of().start(ErrorPageApplication.class, args);
    }

}
