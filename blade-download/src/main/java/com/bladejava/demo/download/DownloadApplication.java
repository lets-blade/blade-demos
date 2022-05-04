package com.bladejava.demo.download;

import com.hellokaton.blade.Blade;
import com.hellokaton.blade.mvc.http.ByteBody;

import java.io.File;

/**
 * 访问
 * <p>
 * http://127.0.0.1:9000/download1
 * http://127.0.0.1:9000/download2
 *
 * @author biezhi
 * @date 2022/5/3
 * @since blade-2.1.0.BETA
 */
public class DownloadApplication {

    public static void main(String[] args) {
        Blade.create()
                .get("/download1", ctx -> {
                    File file = new File("blade-download/src/main/resources/static/octo.png");
                    ctx.response().contentType("image/png");
                    ctx.response().header("Content-Disposition", "attachment; filename=hello.png");
                    ctx.response().body(ByteBody.of(file));
                })
                .get("/download2", ctx -> {
                    String str = "hello world";
                    ctx.response().contentType("text/plain; charset=UTF-8");
                    ctx.response().header("Content-Disposition", "attachment; filename=hello.txt");
                    ctx.response().body(ByteBody.of(str.getBytes()));
                })
                .start(DownloadApplication.class, args);
    }

}
