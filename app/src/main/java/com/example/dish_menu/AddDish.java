package com.example.dish_menu;

import androidx.appcompat.app.AppCompatActivity;
import androidx.room.Room;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class AddDish extends AppCompatActivity {
DishDataBase appDatabase;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_dish);

        Button button3 =findViewById(R.id.buttonAddDish);
// get editText by id
        EditText editText1 =findViewById(R.id.dishName);
        EditText editText2=findViewById(R.id.dishPrice);
        EditText editText3=findViewById(R.id.dishIngredients);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String et1=editText1.getText().toString();
                String et2=editText2.getText().toString();
                String et3=editText3.getText().toString();
                // create entity  to stored it in data base 
                Dish dish=new Dish(et1,et2,et3);

                appDatabase =  Room.databaseBuilder(getApplicationContext(), DishDataBase.class, "dishInfo").allowMainThreadQueries()
                        .build();
                appDatabase.dishDao().insertAll(dish);

                Toast.makeText(getApplicationContext(), "submitted!", Toast.LENGTH_LONG).show();

            }
        });


    }
}