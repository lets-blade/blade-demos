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
                    public void onConnect(WebSocketContext webSocketContext) {
                        System.out.println("有新连接: " + webSocketContext);
                    }

                    @Override
                    public void onText(WebSocketContext webSocketContext) {
                        System.out.println("有新消息: " + webSocketContext.getReqText());
                        webSocketContext.message("服务器返回:" + webSocketContext.getReqText());
                    }

                    @Override
                    public void onDisConnect(WebSocketContext webSocketContext) {
                        System.out.println("有断开连接: " + webSocketContext);
                    }
                })
                .start(WebSocketApplication.class, args);
    }
}
