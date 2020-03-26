package com.book.poq.advert.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "advert")
public class Advert {
    @Id
    private int id;
    private String text;

    public Advert() {
    }

    public Advert(int id, String text) {
        this.id = id;
        this.text = text;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return "Advert{" +
                "id=" + id +
                ", text='" + text + '\'' +
                '}';
    }
}
