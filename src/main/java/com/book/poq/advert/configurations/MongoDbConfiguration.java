package com.book.poq.advert.configurations;

import com.mongodb.MongoClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import org.springframework.data.mongodb.config.EnableMongoAuditing;

@Configuration
@EnableMongoAuditing
public class MongoDbConfiguration {

    protected Environment env;
    protected MongoClient mongoClient;

    @Autowired
    public MongoDbConfiguration(Environment env, MongoClient mongoClient) {
        this.env = env;
        this.mongoClient = mongoClient;
    }

}
