package com.bladejava.lattice;

import com.hellokaton.blade.Blade;
import com.hellokaton.lattice.LatticeMiddleware;

/**
 * @author biezhi
 * @date 2018/6/4
 */
public class LatticeApplication {

    public static void main(String[] args) {
        Blade.create()
                .use(new LatticeMiddleware())
                .start(LatticeApplication.class, args);
    }

}
