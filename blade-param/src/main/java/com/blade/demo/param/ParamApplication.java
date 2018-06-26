package com.blade.demo.param;

import com.blade.Blade;
import com.blade.kit.JsonKit;
import com.blade.kit.json.FastJsonSupport;

/**
 * @author biezhi
 * @date 2018/5/30
 */
public class ParamApplication {

    public static void main(String[] args) {
        JsonKit.jsonSupprt(new FastJsonSupport());
        Blade.of().start(ParamApplication.class, args);
    }

}
