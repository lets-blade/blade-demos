package com.blade.demo.freemarker;

import com.hellokaton.blade.Blade;
import com.hellokaton.blade.ioc.annotation.Bean;
import com.hellokaton.blade.loader.BladeLoader;
import com.hellokaton.blade.template.FreeMarkerTemplateEngine;

/**
 * Created by Administrator on 2017/12/24.
 */
@Bean
public class Bootstrap implements BladeLoader {

    @Override
    public void load(Blade blade) {
        blade.templateEngine(new FreeMarkerTemplateEngine());
        // if you need to do more configration you can use this constructor
        // FreeMarkerTemplateEngine(Configration config)
    }
}
