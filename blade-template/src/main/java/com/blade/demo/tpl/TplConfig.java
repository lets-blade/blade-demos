package com.blade.demo.tpl;

import com.blade.Blade;
import com.blade.event.BeanProcessor;
import com.blade.ioc.annotation.Bean;
import com.blade.mvc.view.template.JetbrickTemplateEngine;

/**
 * @author biezhi
 * @date 2017/9/28
 */
@Bean
public class TplConfig implements BeanProcessor {
    @Override
    public void processor(Blade blade) {
        blade.templateEngine(new JetbrickTemplateEngine());
    }
}
