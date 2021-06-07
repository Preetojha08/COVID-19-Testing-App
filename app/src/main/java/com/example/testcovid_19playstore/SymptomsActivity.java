package com.example.testcovid_19playstore;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class SymptomsActivity extends AppCompatActivity {

    TextView tv_symptoms_title_1,tv_symptoms_title_2,tv_symptoms_title_3,tv_symptoms_title_4,tv_symptoms_title_5,tv_symptoms_title_6,tv_symptoms_title_7,tv_symptoms_title_8;
    TextView tv_symptoms_body_1,tv_symptoms_body_2,tv_symptoms_body_3,tv_symptoms_body_4,tv_symptoms_body_5,tv_symptoms_body_6,tv_symptoms_body_7,tv_symptoms_body_8;
    TextView tv_symptoms_heading_1,tv_symptoms_heading_2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_symptoms);
        getSupportActionBar().hide();

        tv_symptoms_title_1=(TextView)findViewById(R.id.txt_title_Symptoms1);
        tv_symptoms_title_2=(TextView)findViewById(R.id.txt_title_Symptoms2);
        tv_symptoms_title_3=(TextView)findViewById(R.id.txt_title_Symptoms3);
        tv_symptoms_title_4=(TextView)findViewById(R.id.txt_title_Symptoms3_1);
        tv_symptoms_title_5=(TextView)findViewById(R.id.txt_title_Symptoms4);
        tv_symptoms_title_6=(TextView)findViewById(R.id.txt_title_Symptoms5);
        tv_symptoms_title_7=(TextView)findViewById(R.id.txt_title_Symptoms6);
        tv_symptoms_title_8=(TextView)findViewById(R.id.txt_title_Symptoms7);

        tv_symptoms_body_1=(TextView)findViewById(R.id.txt_body_SymptomsDetail1);
        tv_symptoms_body_2=(TextView)findViewById(R.id.txt_body_SymptomsDetail2);
        tv_symptoms_body_3=(TextView)findViewById(R.id.txt_body_SymptomsDetail3);
        tv_symptoms_body_4=(TextView)findViewById(R.id.txt_body_SymptomsDetail3_1);
        tv_symptoms_body_5=(TextView)findViewById(R.id.txt_body_SymptomsDetail4);
        tv_symptoms_body_6=(TextView)findViewById(R.id.txt_body_SymptomsDetail5);
        tv_symptoms_body_7=(TextView)findViewById(R.id.txt_body_SymptomsDetail6);
        tv_symptoms_body_8=(TextView)findViewById(R.id.txt_body_SymptomsDetail7);

        tv_symptoms_heading_1=(TextView)findViewById(R.id.txtSymptomsinfo_common_sym);
        tv_symptoms_heading_2=(TextView)findViewById(R.id.txtSymptomsinfo2_special_sym);

        int symptoms_lang = check_language.language;

        switch (symptoms_lang)
        {
            case 1:

                tv_symptoms_title_1.setText(R.string.eng_symptoms_dry_cough_1);
                tv_symptoms_title_2.setText(R.string.eng_symptoms_fever_2);
                tv_symptoms_title_3.setText(R.string.eng_symptoms_tiredness_3);
                tv_symptoms_title_4.setText(R.string.eng_symptoms_lost_smell_4);
                tv_symptoms_title_5.setText(R.string.eng_symptoms_nasal_6);
                tv_symptoms_title_6.setText(R.string.eng_symptoms_aches_and_pain_5);
                tv_symptoms_title_7.setText(R.string.eng_symptoms_throat_7);
                tv_symptoms_title_8.setText(R.string.eng_symptoms_nose_8);

                tv_symptoms_body_1.setText(R.string.eng_symptoms_dry_cough_para_1);
                tv_symptoms_body_2.setText(R.string.eng_symptoms_fever_para_2);
                tv_symptoms_body_3.setText(R.string.eng_symptoms_tiredness_para_3);
                tv_symptoms_body_4.setText(R.string.eng_symptoms_lost_smell_para_4);
                tv_symptoms_body_5.setText(R.string.eng_symptoms_nasal_para_5);
                tv_symptoms_body_6.setText(R.string.eng_symptoms_aches_and_pain_para_7);
                tv_symptoms_body_7.setText(R.string.eng_symptoms_throat_para_6);
                tv_symptoms_body_8.setText(R.string.eng_symptoms_nose_para_8);

                tv_symptoms_heading_1.setText(R.string.eng_symptoms_title_common);
                tv_symptoms_heading_2.setText(R.string.eng_symptoms_title_special);

                break;

            case 2:

                tv_symptoms_title_1.setText(R.string.hindi_symptoms_dry_cough_1);
                tv_symptoms_title_2.setText(R.string.hindi_symptoms_fever_2);
                tv_symptoms_title_3.setText(R.string.hindi_symptoms_tiredness_3);
                tv_symptoms_title_4.setText(R.string.hindi_symptoms_lost_smell_4);
                tv_symptoms_title_5.setText(R.string.hindi_symptoms_nasal_6);
                tv_symptoms_title_6.setText(R.string.hindi_symptoms_aches_and_pain_5);
                tv_symptoms_title_7.setText(R.string.hindi_symptoms_throat_7);
                tv_symptoms_title_8.setText(R.string.hindi_symptoms_nose_8);

                tv_symptoms_body_1.setText(R.string.hindi_symptoms_dry_cough_para_1);
                tv_symptoms_body_2.setText(R.string.hindi_symptoms_fever_para_2);
                tv_symptoms_body_3.setText(R.string.hindi_symptoms_tiredness_para_3);
                tv_symptoms_body_4.setText(R.string.hindi_symptoms_lost_smell_para_4);
                tv_symptoms_body_5.setText(R.string.hindi_symptoms_nasal_para_5);
                tv_symptoms_body_6.setText(R.string.hindi_symptoms_aches_and_pain_para_7);
                tv_symptoms_body_7.setText(R.string.hindi_symptoms_throat_para_6);
                tv_symptoms_body_8.setText(R.string.hindi_symptoms_nose_para_8);

                tv_symptoms_heading_1.setText(R.string.hindi_symptoms_title_common);
                tv_symptoms_heading_2.setText(R.string.hindi_symptoms_title_special);

                break;

            case 3:

                tv_symptoms_title_1.setText(R.string.guj_symptoms_dry_cough_1);
                tv_symptoms_title_2.setText(R.string.guj_symptoms_fever_2);
                tv_symptoms_title_3.setText(R.string.guj_symptoms_tiredness_3);
                tv_symptoms_title_4.setText(R.string.guj_symptoms_lost_smell_4);
                tv_symptoms_title_5.setText(R.string.guj_symptoms_nasal_6);
                tv_symptoms_title_6.setText(R.string.guj_symptoms_aches_and_pain_5);
                tv_symptoms_title_7.setText(R.string.guj_symptoms_throat_7);
                tv_symptoms_title_8.setText(R.string.guj_symptoms_nose_8);

                tv_symptoms_body_1.setText(R.string.guj_symptoms_dry_cough_para_1);
                tv_symptoms_body_2.setText(R.string.guj_symptoms_fever_para_2);
                tv_symptoms_body_3.setText(R.string.guj_symptoms_tiredness_para_3);
                tv_symptoms_body_4.setText(R.string.guj_symptoms_lost_smell_para_4);
                tv_symptoms_body_5.setText(R.string.guj_symptoms_nasal_para_5);
                tv_symptoms_body_6.setText(R.string.guj_symptoms_aches_and_pain_para_7);
                tv_symptoms_body_7.setText(R.string.guj_symptoms_throat_para_6);
                tv_symptoms_body_8.setText(R.string.guj_symptoms_nose_para_8);

                tv_symptoms_heading_1.setText(R.string.guj_symptoms_title_common);
                tv_symptoms_heading_2.setText(R.string.guj_symptoms_title_special);

                break;
        }



    }
}
