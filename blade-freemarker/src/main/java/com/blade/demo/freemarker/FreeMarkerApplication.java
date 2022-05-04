package com.blade.demo.freemarker;

import com.hellokaton.blade.Blade;

/**
 * @author biezhi
 * @date 2017/9/28
 */
public class FreeMarkerApplication {

    public static void main(String[] args) {
        Blade.create().start(FreeMarkerApplication.class, args);
    }

}
