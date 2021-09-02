package com.example.dish_menu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class DishDetails extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dish_details);
// handle all the data (name ,price ,Ingredient ) when we press on the name in add-dish page by get the intent
// make string
        Intent intent = getIntent();
        String dishName = intent.getExtras().getString("dishName");
        TextView textView1 =findViewById(R.id.textView4);
        textView1.setText(dishName);

        String dishPrice =intent.getExtras().getString("dishPrice");
        TextView textView2=findViewById(R.id.textView5);
        textView2.setText(dishPrice);

        String dishIngredient =intent.getExtras().getString("dishIngredient");
        TextView textView3 =findViewById(R.id.textView6);
        textView3.setText(dishIngredient);


    }
}