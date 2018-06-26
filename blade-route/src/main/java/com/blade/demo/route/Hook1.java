package com.blade.demo.route;

import com.blade.ioc.annotation.Bean;
import com.blade.mvc.RouteContext;
import com.blade.mvc.hook.WebHook;
import com.blade.mvc.ui.ModelAndView;

/**
 * @author biezhi
 * @date 2018/5/30
 */
@Bean
public class Hook1 implements WebHook {

    @Override
    public boolean before(RouteContext context) {
        return true;
    }

    @Override
    public boolean after(RouteContext context) {
        ModelAndView modelAndView = context.response().modelAndView();
        modelAndView.setView("hello2.html");
        return true;
    }
}
