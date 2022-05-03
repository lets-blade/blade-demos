package com.blade.demo.param;

import com.hellokaton.blade.Blade;

/**
 * @author biezhi
 * @date 2018/5/30
 */
public class ParamApplication {

    public static void main(String[] args) {
        Blade.of().start(ParamApplication.class, args);
    }

}
