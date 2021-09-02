package com.example.dish_menu;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity
public class Dish {

    @PrimaryKey(autoGenerate = true)
    public int did;
    @ColumnInfo(name = "name")
    public String name;
    @ColumnInfo(name ="price")
    public String price;
    @ColumnInfo(name = "ingredient")
    public String ingredient;

    public Dish(String name, String price, String ingredient) {
        this.name = name;
        this.price = price;
        this.ingredient = ingredient;
    }

}
