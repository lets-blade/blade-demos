package com.blade.demo.route;

import com.blade.ioc.annotation.Bean;
import com.blade.mvc.hook.Signature;
import com.blade.mvc.hook.WebHook;
import com.blade.mvc.ui.ModelAndView;

/**
 * @author biezhi
 * @date 2018/5/30
 */
@Bean
public class Hook1 implements WebHook {
    @Override
    public boolean before(Signature signature) {
        return true;
    }

    @Override
    public boolean after(Signature signature) {
        ModelAndView modelAndView = signature.getResponse().modelAndView();
        modelAndView.setView("hello2.html");
        return true;
    }

}
