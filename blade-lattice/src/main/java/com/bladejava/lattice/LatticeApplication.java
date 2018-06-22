package com.bladejava.lattice;

import com.blade.Blade;
import io.github.biezhi.lattice.LatticeMiddleware;

/**
 * @author biezhi
 * @date 2018/6/4
 */
public class LatticeApplication {

    public static void main(String[] args) {
        Blade.of().use(new LatticeMiddleware()).start(LatticeApplication.class, args);
    }

}
