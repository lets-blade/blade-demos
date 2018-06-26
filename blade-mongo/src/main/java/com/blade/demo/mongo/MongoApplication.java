package com.blade.demo.mongo;

import com.blade.Blade;

/**
 * http://www.mkyong.com/mongodb/java-mongodb-hello-world-example/
 *
 * @author biezhi
 * @date 2018/4/27
 */
public class MongoApplication {

    public static void main(String[] args) {
        Blade.of().start(MongoApplication.class, args);
    }

}
