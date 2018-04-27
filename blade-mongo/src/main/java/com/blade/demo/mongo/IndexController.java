package com.blade.demo.mongo;

import com.blade.mvc.annotation.GetRoute;
import com.blade.mvc.annotation.Path;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import org.bson.Document;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Arrays;

/**
 * @author biezhi
 * @date 2018/4/27
 */
@Path
public class IndexController {

    private static final Logger log = LoggerFactory.getLogger(IndexController.class);

    @GetRoute("/read")
    public void read() {
        MongoCollection<Document> collection = MongoConfig.getMongoDatabase().getCollection("test");
        MongoCursor<Document>     cursor     = collection.find().iterator();

        try {
            while (cursor.hasNext()) {
                log.info(cursor.next().toJson());
            }
        } finally {
            cursor.close();
        }
    }

    @GetRoute("/write")
    public void write() {
        MongoCollection<Document> collection = MongoConfig.getMongoDatabase().getCollection("test");

        Document doc = new Document("name", "MongoDB")
                .append("type", "database")
                .append("count", 1)
                .append("versions", Arrays.asList("v3.2", "v3.0", "v2.6"))
                .append("info", new Document("x", 203).append("y", 102));

        collection.insertOne(doc);

    }

}
