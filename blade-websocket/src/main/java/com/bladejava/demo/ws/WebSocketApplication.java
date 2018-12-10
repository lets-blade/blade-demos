package com.bladejava.demo.ws;

import com.blade.Blade;
import com.blade.mvc.handler.WebSocketHandler;
import com.blade.mvc.websocket.WebSocketContext;

/**
 * @author biezhi
 * @date 2018/8/16
 */
public class WebSocketApplication {

    public static void main(String[] args) {
        Blade.of()
                .get("/", ctx -> ctx.render("index.html"))
                .webSocket("/chat", new WebSocketHandler() {
                    @Override
                    public void onConnect(WebSocketContext ctx) {
                        System.out.println("有新连接: " + ctx);
                    }

                    @Override
                    public void onText(WebSocketContext ctx) {
                        System.out.println("有新消息: " + ctx.getReqText());
                        ctx.message("服务器返回:" + ctx.getReqText());
                    }

                    @Override
                    public void onDisConnect(WebSocketContext ctx) {
                        System.out.println("有断开连接: " + ctx);
                    }
                })
                .start(WebSocketApplication.class, args);
    }
}
