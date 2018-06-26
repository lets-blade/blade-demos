package com.bladejava.demo.test.service;

import com.blade.ioc.annotation.Inject;
import com.bladejava.demo.service.PostService;
import com.bladejava.demo.service.UserService;
import com.bladejava.demo.test.BaseTest;
import org.junit.Assert;
import org.junit.Test;

/**
 * @author biezhi
 * @date 2018/5/31
 */
public class PostServiceTest extends BaseTest {

    @Inject
    private PostService postService;

    @Test
    public void testSayHello() {
        boolean result = postService.savePost(2333L);
        Assert.assertEquals(true, result);
    }

}
