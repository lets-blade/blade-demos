package com.bladejava.lattice.bootstrap;

import com.blade.Blade;
import com.blade.event.BeanProcessor;
import com.blade.ioc.annotation.Bean;
import io.github.biezhi.lattice.Lattice;

/**
 * @author biezhi
 * @date 2018/6/4
 */
@Bean
public class Bootstrap implements BeanProcessor {

    @Override
    public void preHandle(Blade blade) {
        Lattice lattice = new Lattice();
        lattice.loginUrl("/login").unauthorizedUrl("/unauthorized");
        lattice.realm(new MyRealm());
        blade.register(lattice);
    }

    @Override
    public void processor(Blade blade) {
    }

}
