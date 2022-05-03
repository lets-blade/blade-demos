package com.bladejava.demo.test.service;

import com.bladejava.demo.model.User;
import com.bladejava.demo.service.UserService;
import com.bladejava.demo.test.BaseTest;
import com.hellokaton.blade.ioc.annotation.Inject;
import org.junit.Assert;
import org.junit.Test;

/**
 * @author biezhi
 * @date 2018/5/31
 */
public class UserServiceTest extends BaseTest {

    @Inject
    private UserService userService;

    @Test
    public void testSayHello() {
        String hello = userService.sayHello();
        Assert.assertEquals("Hello", hello);
    }

    @Test
    public void testSaveUser() {
        long uid = userService.saveUser(new User(9881L, "rose"));
        Assert.assertEquals(9881, uid);
    }

}
