package com.blade.viewdemo;

import com.blade.Blade;
import com.blade.mvc.view.template.JetbrickTemplateEngine;

/**
 * Created by biezhi on 2017/2/18.
 */
public class ViewApplication {

    public static void main(String[] args) {
        Blade.me()
                .start(ViewApplication.class, args);
    }

}
