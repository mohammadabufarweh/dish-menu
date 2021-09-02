package com.example.dish_menu;

import androidx.room.Database;
import androidx.room.RoomDatabase;

@Database(entities = {Dish.class},version = 1)
public abstract class DishDataBase extends RoomDatabase {
    public abstract DishDao dishDao();

    
}
