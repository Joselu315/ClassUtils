package com.github.joseluu.database;

import com.github.joseluu.database.impl.IConnection;
import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import com.mongodb.client.MongoDatabase;

public class MongoConnection implements IConnection {
    private MongoClientURI mongoClientURI;
    private MongoClient mongoClient;
    private MongoDatabase mongoDatabase;

    @Override
    public void start() {
        String uri = "mongodb+srv://joselufupa2016:RWGBIbQ6BnJYhMWQ@cluster0.qqfu6ud.mongodb.net/test";
        String database = "db_test";

        mongoClientURI = new MongoClientURI(uri);
        mongoClient = new MongoClient(mongoClientURI);
        mongoDatabase = mongoClient.getDatabase(database);
    }

    @Override
    public void stop() {
        mongoClient.close();
    }

    public MongoDatabase getMongoDatabase(){
        return mongoDatabase;
    }
}
