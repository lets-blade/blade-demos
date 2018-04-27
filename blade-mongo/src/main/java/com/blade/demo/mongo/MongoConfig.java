package com.blade.demo.mongo;

import com.blade.Blade;
import com.blade.event.BeanProcessor;
import com.blade.ioc.annotation.Bean;
import com.mongodb.MongoClient;
import com.mongodb.client.MongoDatabase;

/**
 * @author biezhi
 * @date 2018/4/27
 */
@Bean
public class MongoConfig implements BeanProcessor {

    private static MongoDatabase mongoDatabase;

    @Override
    public void processor(Blade blade) {
        MongoClient mongoClient = new MongoClient("localhost");
//        MongoClient mongoClient = new MongoClient("localhost", 27017);
//        MongoClientURI connectionString = new MongoClientURI("mongodb://localhost:27017");
//        MongoClient mongoClient = new MongoClient(connectionString);

        mongoDatabase = mongoClient.getDatabase("blade_demo");
        System.out.println(mongoDatabase.getName());
    }

    public static MongoDatabase getMongoDatabase() {
        return mongoDatabase;
    }

}
