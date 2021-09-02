package com.example.dish_menu;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.Room;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.List;

public class Menu extends AppCompatActivity {
DishDataBase appDatabase;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
//After  having defined the data entity, the DAO, and the database object,
//  create an instance of the database (DishDataBase appDatabase):

        appDatabase =  Room.databaseBuilder(getApplicationContext(), DishDataBase.class, "dishInfo").allowMainThreadQueries()
                .build();
        // get data from data base
        List<Dish> dishes = appDatabase.dishDao().getAll();
// implement RecyclerView to handle the data as fragment
        RecyclerView tasksRecyclerView = findViewById(R.id.recycleView);
        tasksRecyclerView.setLayoutManager(new LinearLayoutManager(this));
        tasksRecyclerView.setAdapter(new DishAdapter(dishes));
// create OnClickListener to link to home page
        Button button5=findViewById(R.id.buttonHome);
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent goToHomePage =new Intent(Menu.this,MainActivity.class);
                startActivity(goToHomePage);
            }
        });

    }
}