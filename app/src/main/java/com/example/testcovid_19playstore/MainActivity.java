package com.example.testcovid_19playstore;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        getSupportActionBar().hide();

        int SPLASH_TIME = 3000; //This is 3 seconds

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {

                Intent mySuperIntent = new Intent(MainActivity.this, Main2Activity.class);
                startActivity(mySuperIntent);
                Log.i("Information","The Splash Screen is working in this application");

                finish();

            }
        }, SPLASH_TIME );




    }





}
