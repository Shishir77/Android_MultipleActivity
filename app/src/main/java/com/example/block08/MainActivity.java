package com.example.block08;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RatingBar;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void enter ( View v)
    {
        RatingBar ratingBar = (RatingBar) findViewById(R.id.ratingBar) ;
        float rating = ratingBar.getRating(); // returns value saved in rating
        Intent goToSecond = new Intent(); // objects that represents operations to be performed
        goToSecond.setClass(this , secondActivity.class) ;
        goToSecond.putExtra("nbStars",rating);  //key and value
         startActivity(goToSecond);


        //Toast.makeText(getApplicationContext() ,rating+"stars",Toast.LENGTH_SHORT ).show();
    }

}