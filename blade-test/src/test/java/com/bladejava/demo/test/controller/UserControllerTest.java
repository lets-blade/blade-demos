package com.bladejava.demo.test.controller;

import com.bladejava.demo.test.BaseTest;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;
import org.junit.Test;

/**
 * @author biezhi
 * @date 2018/5/31
 */
public class UserControllerTest extends BaseTest {

    @Test
    public void testList() throws UnirestException {
        int statusCode = Unirest.get("http://127.0.0.1:9000/user/list").asString().getStatus();
        System.out.println("statusCode = " + statusCode);
    }

    @Test
    public void testDetail() throws UnirestException {
        String body = Unirest.get("http://127.0.0.1:9000/user/detail/23").asString().getBody();
        System.out.println("body = " + body);
    }

}
