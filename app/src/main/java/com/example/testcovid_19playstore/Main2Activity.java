package com.example.testcovid_19playstore;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {

    TextView symviewall,safetyviewall;
    Button btntest;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        getSupportActionBar().hide();

        /* TextView  */
        symviewall=(TextView)findViewById(R.id.txtViewallSymptoms);
        safetyviewall=(TextView)findViewById(R.id.txtViewallSafety);

        /* Button  */
        btntest=(Button)findViewById(R.id.begintest);

        /* Test Button on click Listener  */
        btntest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent o = new Intent(Main2Activity.this,DisclaimerActivity.class);
                startActivity(o);
            }
        });

        /* All Symptoms Text View on click Listener  */
        symviewall.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent o = new Intent(Main2Activity.this,SymptomsActivity.class);
                Toast.makeText(Main2Activity.this,"Know the Symptoms and be Safe",Toast.LENGTH_SHORT).show();
                startActivity(o);
            }
        });

        /* All Safety major Text View on click Listener  */
        safetyviewall.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent o = new Intent(Main2Activity.this,SafetymajorActivity.class);
                Toast.makeText(Main2Activity.this,"Know the Safety Major for COVID-19",Toast.LENGTH_SHORT).show();
                startActivity(o);
            }
        });




    }
}
