package com.blade.demo.route;

import com.hellokaton.blade.ioc.annotation.Bean;
import com.hellokaton.blade.mvc.RouteContext;
import com.hellokaton.blade.mvc.hook.WebHook;
import com.hellokaton.blade.mvc.ui.ModelAndView;

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
        if (null != modelAndView) {
            modelAndView.setView("hello2.html");
        }
        return true;
    }
}
