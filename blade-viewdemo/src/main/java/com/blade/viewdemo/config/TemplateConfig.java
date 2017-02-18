package com.blade.viewdemo.config;

import com.blade.config.BaseConfig;
import com.blade.config.Configuration;
import com.blade.ioc.annotation.Component;
import com.blade.mvc.view.ViewSettings;
import com.blade.mvc.view.template.JetbrickTemplateEngine;

/**
 * Created by biezhi on 2017/2/18.
 */
@Component
public class TemplateConfig implements BaseConfig {

    @Override
    public void config(Configuration configuration) {
        JetbrickTemplateEngine templateEngine = new JetbrickTemplateEngine();
        ViewSettings.$().templateEngine(templateEngine);
    }
}
