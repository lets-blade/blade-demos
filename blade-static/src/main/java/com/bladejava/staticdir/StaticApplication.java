package com.bladejava.staticdir;

import com.hellokaton.blade.Blade;

/**
 *
 * @author biezhi
 * @date 2018/6/1
 */
public class StaticApplication {

    public static void main(String[] args) {
         Blade.create().start(StaticApplication.class, args);
    }

}
