package com.blade.viewdemo.config;


import com.blade.Blade;
import com.blade.event.BeanProcessor;
import com.blade.ioc.annotation.Bean;
import com.blade.ioc.annotation.Order;
import com.blade.mvc.view.template.JetbrickTemplateEngine;

/**
 * 模板引擎加载
 */
@Order(1)
@Bean
public class TemplateConfig implements BeanProcessor {

    @Override
    public void processor(Blade blade) {
        JetbrickTemplateEngine templateEngine = new JetbrickTemplateEngine();
        blade.templateEngine(templateEngine);
    }
}
