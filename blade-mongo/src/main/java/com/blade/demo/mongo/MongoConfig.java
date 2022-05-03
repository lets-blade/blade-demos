package com.blade.demo.mongo;

import com.hellokaton.blade.Blade;
import com.hellokaton.blade.ioc.annotation.Bean;
import com.hellokaton.blade.loader.BladeLoader;
import com.mongodb.MongoClient;
import com.mongodb.client.MongoDatabase;

/**
 * @author biezhi
 * @date 2018/4/27
 */
@Bean
public class MongoConfig implements BladeLoader {

    private static MongoDatabase mongoDatabase;

    public static MongoDatabase getMongoDatabase() {
        return mongoDatabase;
    }

    @Override
    public void load(Blade blade) {
        MongoClient mongoClient = new MongoClient("localhost");
//        MongoClient mongoClient = new MongoClient("localhost", 27017);
//        MongoClientURI connectionString = new MongoClientURI("mongodb://localhost:27017");
//        MongoClient mongoClient = new MongoClient(connectionString);

        mongoDatabase = mongoClient.getDatabase("blade_demo");
        System.out.println(mongoDatabase.getName());
    }

}
