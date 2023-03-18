package com.github.joseluu.database;

import com.github.joseluu.database.impl.IConnection;
import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import com.mongodb.client.MongoDatabase;

public class MongoConnection implements IConnection {
    private final MongoClientURI mongoClientURI;
    private final MongoClient mongoClient;
    private final MongoDatabase mongoDatabase;
    public MongoConnection(MongoClientURI mongoClientURI, String database){
        this.mongoClientURI = mongoClientURI;
        this.mongoClient = new MongoClient(mongoClientURI);
        this.mongoDatabase = mongoClient.getDatabase(database);

    }
    @Override
    public void start() {
    }

    @Override
    public void stop() {
        mongoClient.close();
    }
}
