package com.bladejava.lattice.bootstrap;

import com.hellokaton.blade.Blade;
import com.hellokaton.blade.ioc.annotation.Bean;
import com.hellokaton.blade.loader.BladeLoader;
import com.hellokaton.lattice.Lattice;

/**
 * @author biezhi
 * @date 2018/6/4
 */
@Bean
public class Bootstrap implements BladeLoader {

    @Override
    public void load(Blade blade) {
        Lattice lattice = new Lattice();
        lattice.loginUrl("/login").unauthorizedUrl("/unauthorized");
        lattice.realm(new MyRealm());
        blade.register(lattice);
    }

}
