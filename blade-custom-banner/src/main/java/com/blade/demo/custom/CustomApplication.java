package com.blade.demo.custom;

import com.hellokaton.blade.Blade;

/**
 * @author biezhi
 * @date 2017/12/15
 */
public class CustomApplication {

    public static void main(String[] args) {
        Blade.create()
                .bannerText("Hei hei hei~~~")
                .threadName("(* ￣3)(ε￣ *)")
                .start(CustomApplication.class, args);
    }

}
