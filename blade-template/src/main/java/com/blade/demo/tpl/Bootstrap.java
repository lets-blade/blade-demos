package com.blade.demo.tpl;

import com.hellokaton.blade.Blade;
import com.hellokaton.blade.ioc.annotation.Bean;
import com.hellokaton.blade.loader.BladeLoader;
import com.hellokaton.blade.template.JetbrickTemplateEngine;

/**
 * @author biezhi
 * @date 2017/9/28
 */
@Bean
public class Bootstrap implements BladeLoader {

    @Override
    public void load(Blade blade) {
        blade.templateEngine(new JetbrickTemplateEngine());
    }

}
