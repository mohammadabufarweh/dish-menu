package com.example.dish_menu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
// This page have tow buttons one to go to add-dish page and the other one to go to menu page
// we have to implement onClickListener for each button
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button1 =findViewById(R.id.buttonDish);
        button1.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        Intent goToDishPage =new Intent(MainActivity.this,AddDish.class);
        startActivity(goToDishPage);
    }
});
        Button button2=findViewById(R.id.buttonMenu);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent goToMenuPage=new Intent(MainActivity.this,Menu.class);
                startActivity(goToMenuPage);
            }
        });
    }
}