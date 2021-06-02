package com.example.testcovid_19playstore;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

public class DisclaimerActivity extends AppCompatActivity {

    Button btnacc;
    CheckBox yes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_disclaimer);


        btnacc = (Button) findViewById(R.id.buttonaccept);
        yes = (CheckBox) findViewById(R.id.checkBox1);

        yes = (CheckBox) findViewById(R.id.checkBox1);

        btnacc.setEnabled(false);



        yes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (yes.isChecked())
                {
                    Toast.makeText(DisclaimerActivity.this, " Thank You for Accepting the term  ", Toast.LENGTH_LONG).show();
                    btnacc.setEnabled(true);
                    btnacc.setBackgroundResource(R.color.colorRed);
                }
                else
                {
                    Toast.makeText(DisclaimerActivity.this, " Please Accept the term ", Toast.LENGTH_LONG).show();
                    btnacc.setEnabled(false);
                    btnacc.setBackgroundResource(R.color.colorButtonAccept);

                }

            }

        });

        btnacc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(DisclaimerActivity.this,UserdetailsActivity.class);
                startActivity(i);
                Toast.makeText(DisclaimerActivity.this, "Please Fill this Details carefully ", Toast.LENGTH_LONG).show();

            }
        });


    }
}
