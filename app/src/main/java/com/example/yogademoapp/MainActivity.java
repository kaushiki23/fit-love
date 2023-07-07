package com.example.yogademoapp;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toolbar;

public class MainActivity extends AppCompatActivity {

   Button button1,button2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


         androidx.appcompat.widget.Toolbar toolbar=findViewById(R.id.toolbar);
         setSupportActionBar(toolbar);





        button1=findViewById(R.id.startyoga1);
        button2=findViewById(R.id.startyoga2);



        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,SecondActivity.class);
                startActivity(intent);

            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,SecondActivity2.class);
                startActivity(intent);

            }
        });

    }

    private void setSupportActionBar(Toolbar toolbar) {
    }



    public void beforeage18(View view) {
        Intent intent=new Intent(MainActivity.this,SecondActivity.class);
        startActivity(intent);





    }

    public void afterage18(View view) {
        Intent intent=new Intent(MainActivity.this,SecondActivity2.class);
        startActivity(intent);



    }

    public void food(View view) {
         Intent intent = new Intent(MainActivity.this,FoodActivity.class);
         startActivity(intent);





    }
}