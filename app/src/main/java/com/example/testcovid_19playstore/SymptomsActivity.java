package com.example.testcovid_19playstore;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class SymptomsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_symptoms);
        getSupportActionBar().hide();
    }
}
