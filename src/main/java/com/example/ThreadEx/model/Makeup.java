package com.example.ThreadEx.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Makeup
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long item_id;

    private String item_name;
    private String item_description;
    private String item_type;
    private int item_price;
    private int item_rating;

    public long getItem_id() {
        return item_id;
    }

    public void setItem_id(long item_id) {
        this.item_id = item_id;
    }

    public String getItem_name() {
        return item_name;
    }

    public void setItem_name(String item_name) {
        this.item_name = item_name;
    }

    public String getItem_description() {
        return item_description;
    }

    public void setItem_description(String item_description) {
        this.item_description = item_description;
    }

    public String getItem_type() {
        return item_type;
    }

    public void setItem_type(String item_type) {
        this.item_type = item_type;
    }

    public int getItem_price() {
        return item_price;
    }

    public void setItem_price(int item_price) {
        this.item_price = item_price;
    }

    public int getItem_rating() {
        return item_rating;
    }

    public void setItem_rating(int item_rating) {
        this.item_rating = item_rating;
    }
}
