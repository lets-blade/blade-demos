package com.blade.demo.freemarker;

import com.blade.Blade;
import com.blade.event.BeanProcessor;
import com.blade.ioc.annotation.Bean;
import com.blade.mvc.view.template.FreeMarkerTemplateEngine;

/**
 * Created by Administrator on 2017/12/24.
 */
@Bean
public class FreeMarkerConfig  implements BeanProcessor{
    @Override
    public void processor(Blade blade) {
        blade.templateEngine(new FreeMarkerTemplateEngine());
        /**
         * if you need to do more configration you can use this constructor
         * FreeMarkerTemplateEngine(Configration config)
         */
    }
}
