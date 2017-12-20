package com.blade.demo.kit;

import com.blade.demo.kit.model.User;
import com.blade.kit.JsonKit;

import java.util.Date;

/**
 * @author biezhi
 * @date 2017/12/20
 */
public class JSONKitExample {

    public static void main(String[] args) {
        User u1 = new User();
        u1.setAge(22);
        u1.setBirthday(new Date());
        u1.setMoney(208.1D);
        u1.setSex(true);
        u1.setStatus(Byte.valueOf("2"));
        u1.setUsername("biezhi");

        String json = JsonKit.toString(u1);
        System.out.println(json);

        String str = "{\"username\":\"biezhi\",\"age\":22,\"money\":208.1,\"birthday\":\"2017年12月20日 14:34\",\"sex\":true,\"status\":2}";

        User u2 = JsonKit.formJson(str, User.class);
        System.out.println(u2);
    }

}
