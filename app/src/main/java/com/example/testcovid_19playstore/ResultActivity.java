package com.example.testcovid_19playstore;

import androidx.activity.OnBackPressedCallback;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

public class ResultActivity extends AppCompatActivity {

    int final_score;
    int a = 0;
    TextView tv1,tv2;
    ImageView img;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        tv1=(TextView)findViewById(R.id.txtone);
        tv2=(TextView)findViewById(R.id.txttwo);
        img=(ImageView)findViewById(R.id.resultimg);

        checkscore();
    }

    @SuppressLint("ResourceAsColor")
    public void checkscore()
    {
        Intent p = getIntent();
        final_score = p.getIntExtra("Score",0);
        a++;

            String score_string = String.valueOf(final_score);

            if (final_score>=20)
            {
                tv1.setText(R.string.takeyourself);
                tv2.setText(R.string.oh_very_bad);
                img.setImageResource(R.drawable.test_positive);
               tv1.setTextColor(getColor(R.color.colorRed));
                tv2.setTextColor(getColor(R.color.colorBlack));

            }
            else if (final_score>=12 && final_score<20)
            {

                tv1.setText(R.string.takemed);
                tv2.setText(R.string.oh_bad);
                img.setImageResource(R.drawable.test_maybe);
                tv1.setTextColor(getColor(R.color.colorLightRed));
                tv2.setTextColor(getColor(R.color.colorBlack));
            }
            else if (final_score>=06 && final_score<11)
            {

                tv1.setText(R.string.takeflu);
                tv2.setText(R.string.oh_flu);
                img.setImageResource(R.drawable.flu);
                tv1.setTextColor(getColor(R.color.colorYellow));
                tv2.setTextColor(getColor(R.color.colorBlack));

            }
            else
            {

                tv1.setText(R.string.congratulations);
                tv2.setText(R.string.takecare);
                img.setImageResource(R.drawable.test_negative);
                tv1.setTextColor(getColor(R.color.colorGreen));
                tv2.setTextColor(getColor(R.color.colorBlack));

            }


    }

    @Override
    public void onBackPressed() {
        Intent u = new Intent(ResultActivity.this,Main2Activity.class);
        startActivity(u);
    }




}

