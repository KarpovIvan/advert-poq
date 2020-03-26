package com.book.poq.advert.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;

@Document(indexName = "advert")
public class AdvertId {
    @Id
    private int id;
    private String name;

    public AdvertId() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public AdvertId(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }



    @Override
    public String toString() {
        return "Advert{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
