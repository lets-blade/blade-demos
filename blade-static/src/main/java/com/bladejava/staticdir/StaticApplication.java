package com.bladejava.staticdir;

import com.blade.Blade;

/**
 * @author biezhi
 * @date 2018/6/1
 */
public class StaticApplication {

    public static void main(String[] args) {
        Blade.of().start(StaticApplication.class, args);
    }

}
