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
    Button btntest,quarantine_act,covid_help_center;

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
        quarantine_act =(Button)findViewById(R.id.quaratine_act_button);
        covid_help_center =(Button)findViewById(R.id.covid_help_center_button);

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

        /* All quarantine activities Button on click Listener  */
        quarantine_act.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent p = new Intent(Main2Activity.this,Quaratine_Act_Activity.class);
                startActivity(p);
            }
        });

        /* All Help Center list Button on click Listener  */
        covid_help_center.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent p = new Intent(Main2Activity.this,Help_Center_Activity.class);
                startActivity(p);
            }
        });

    }
}
