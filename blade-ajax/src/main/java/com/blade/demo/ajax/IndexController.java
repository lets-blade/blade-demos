package com.blade.demo.ajax;

import com.blade.mvc.annotation.GetRoute;
import com.blade.mvc.annotation.Path;

/**
 * @author biezhi
 * @date 2017/9/28
 */
@Path
public class IndexController {

    @GetRoute
    public String index(){
        return "index.html";
    }

}
