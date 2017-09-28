package com.blade.demo.tpl;

import com.blade.mvc.annotation.GetRoute;
import com.blade.mvc.annotation.Path;
import com.blade.mvc.http.Request;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author biezhi
 * @date 2017/9/28
 */
@Path
public class IndexController {

    @GetRoute
    public String index(Request request) {

        List<String> users = Arrays.asList("jack", "biezhi", "rose");
        request.attribute("users", users);

        Map<String, Object> map = new HashMap<>();
        map.put("name", "jack");
        map.put("age", 20);
        request.attribute("map", map);

        return "index.html";
    }

    @GetRoute("login")
    public String login() {
        return "login.html";
    }

}
