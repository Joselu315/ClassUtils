package com.github.joseluu.database.manager;

import com.github.joseluu.database.MongoConnection;

public class MongoManager {
    private final MongoConnection mongoConnection;

    public MongoManager() {
        this.mongoConnection = new MongoConnection();
    }

    public void getCollection(String collection){
        mongoConnection.getMongoDatabase().getCollection(collection);
    }


}
