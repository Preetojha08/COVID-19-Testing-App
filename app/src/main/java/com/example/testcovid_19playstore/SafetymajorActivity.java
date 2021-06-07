package com.example.testcovid_19playstore;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class SafetymajorActivity extends AppCompatActivity {

    TextView tv_safety_major_title_1,tv_safety_major_title_2,tv_safety_major_title_3,tv_safety_major_title_4,tv_safety_major_title_5,tv_safety_major_title_6,tv_safety_major_title_7,tv_safety_major_title_8,tv_safety_major_title_9,tv_safety_major_title_10,tv_safety_major_title_11;
    TextView tv_safety_major_body_1,tv_safety_major_body_2,tv_safety_major_body_3,tv_safety_major_body_4,tv_safety_major_body_5,tv_safety_major_body_6,tv_safety_major_body_7,tv_safety_major_body_8,tv_safety_major_body_9,tv_safety_major_body_10,tv_safety_major_body_11;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_safetymajor);

        tv_safety_major_body_1=(TextView)findViewById(R.id.txt_view_safty_major_title_1);
        tv_safety_major_body_2=(TextView)findViewById(R.id.txt_view_safty_major_title_2);
        tv_safety_major_body_3=(TextView)findViewById(R.id.txt_view_safty_major_title_3);
        tv_safety_major_body_4=(TextView)findViewById(R.id.txt_view_safty_major_title_4);
        tv_safety_major_body_5=(TextView)findViewById(R.id.txt_view_safty_major_title_5);
        tv_safety_major_body_6=(TextView)findViewById(R.id.txt_view_safty_major_title_6);
        tv_safety_major_body_7=(TextView)findViewById(R.id.txt_view_safty_major_title_7);
        tv_safety_major_body_8=(TextView)findViewById(R.id.txt_view_safty_major_title_8);
        tv_safety_major_body_9=(TextView)findViewById(R.id.txt_view_safty_major_title_9);
        tv_safety_major_body_10=(TextView)findViewById(R.id.txt_view_safty_major_title_10);
        tv_safety_major_body_11=(TextView)findViewById(R.id.txt_view_safty_major_title_11);

        tv_safety_major_title_1=(TextView)findViewById(R.id.txt_view_safty_major_body_1);
        tv_safety_major_title_2=(TextView)findViewById(R.id.txt_view_safty_major_body_2);
        tv_safety_major_title_3=(TextView)findViewById(R.id.txt_view_safty_major_body_3);
        tv_safety_major_title_4=(TextView)findViewById(R.id.txt_view_safty_major_body_4);
        tv_safety_major_title_5=(TextView)findViewById(R.id.txt_view_safty_major_body_5);
        tv_safety_major_title_6=(TextView)findViewById(R.id.txt_view_safty_major_body_6);
        tv_safety_major_title_7=(TextView)findViewById(R.id.txt_view_safty_major_body_7);
        tv_safety_major_title_8=(TextView)findViewById(R.id.txt_view_safty_major_body_8);
        tv_safety_major_title_9=(TextView)findViewById(R.id.txt_view_safty_major_body_9);
        tv_safety_major_title_10=(TextView)findViewById(R.id.txt_view_safty_major_body_10);
        tv_safety_major_title_11=(TextView)findViewById(R.id.txt_view_safty_major_body_11);

        int safety_lang = check_language.language;
        switch (safety_lang)
        {
            case 1:
                setTitle("Safety Major for COVID-19");

                tv_safety_major_title_1.setText(R.string.eng_safety_majors_wash_hands_1);
                tv_safety_major_title_2.setText(R.string.eng_safety_majors_wear_mask_2);
                tv_safety_major_title_3.setText(R.string.eng_safety_majors_social_distance_3);
                tv_safety_major_title_4.setText(R.string.eng_safety_majors_touching_face_4);
                tv_safety_major_title_5.setText(R.string.eng_safety_majors_respiratory_5);
                tv_safety_major_title_6.setText(R.string.eng_safety_majors_medical_care_6);
                tv_safety_major_title_7.setText(R.string.eng_safety_majors_clean_everthing_7);
                tv_safety_major_title_8.setText(R.string.eng_safety_majors_vitamins_8);
                tv_safety_major_title_9.setText(R.string.eng_safety_majors_consume_liquids_9);
                tv_safety_major_title_10.setText(R.string.eng_safety_majors_vaild_info_10);
                tv_safety_major_title_11.setText(R.string.eng_safety_majors_family_time_11);

                tv_safety_major_body_1.setText(R.string.eng_safety_majors_wash_hands_para_1);
                tv_safety_major_body_2.setText(R.string.eng_safety_majors_wear_mask_para_2);
                tv_safety_major_body_3.setText(R.string.eng_safety_majors_social_distance_para_3);
                tv_safety_major_body_4.setText(R.string.eng_safety_majors_touching_face_para_4);
                tv_safety_major_body_5.setText(R.string.eng_safety_majors_respiratory_para_5);
                tv_safety_major_body_6.setText(R.string.eng_safety_majors_medical_care_para_6);
                tv_safety_major_body_7.setText(R.string.eng_safety_majors_clean_everthing_para_7);
                tv_safety_major_body_8.setText(R.string.eng_safety_majors_vitamins_para_8);
                tv_safety_major_body_9.setText(R.string.eng_safety_majors_consume_liquids_para_9);
                tv_safety_major_body_10.setText(R.string.eng_safety_majors_vaild_info_para_10);
                tv_safety_major_body_11.setText(R.string.eng_safety_majors_family_time_para_11);

                break;

            case 2:
                //COVID-19 के लिए सुरक्षा प्रमुख
                setTitle("COVID-19 के लिए सुरक्षा प्रमुख");
                tv_safety_major_title_1.setText(R.string.hindi_safety_majors_wash_hands_1);
                tv_safety_major_title_2.setText(R.string.hindi_safety_majors_wear_mask_2);
                tv_safety_major_title_3.setText(R.string.hindi_safety_majors_social_distance_3);
                tv_safety_major_title_4.setText(R.string.hindi_safety_majors_touching_face_4);
                tv_safety_major_title_5.setText(R.string.hindi_safety_majors_respiratory_5);
                tv_safety_major_title_6.setText(R.string.hindi_safety_majors_medical_care_6);
                tv_safety_major_title_7.setText(R.string.hindi_safety_majors_clean_everthing_7);
                tv_safety_major_title_8.setText(R.string.hindi_safety_majors_vitamins_8);
                tv_safety_major_title_9.setText(R.string.hindi_safety_majors_consume_liquids_9);
                tv_safety_major_title_10.setText(R.string.hindi_safety_majors_vaild_info_10);
                tv_safety_major_title_11.setText(R.string.hindi_safety_majors_family_time_11);

                tv_safety_major_body_1.setText(R.string.hindi_safety_majors_wash_hands_para_1);
                tv_safety_major_body_2.setText(R.string.hindi_safety_majors_wear_mask_para_2);
                tv_safety_major_body_3.setText(R.string.hindi_safety_majors_social_distance_para_3);
                tv_safety_major_body_4.setText(R.string.hindi_safety_majors_touching_face_para_4);
                tv_safety_major_body_5.setText(R.string.hindi_safety_majors_respiratory_para_5);
                tv_safety_major_body_6.setText(R.string.hindi_safety_majors_medical_care_para_6);
                tv_safety_major_body_7.setText(R.string.hindi_safety_majors_clean_everthing_para_7);
                tv_safety_major_body_8.setText(R.string.hindi_safety_majors_vitamins_para_8);
                tv_safety_major_body_9.setText(R.string.hindi_safety_majors_consume_liquids_para_9);
                tv_safety_major_body_10.setText(R.string.hindi_safety_majors_vaild_info_para_10);
                tv_safety_major_body_11.setText(R.string.hindi_safety_majors_family_time_para_11);

                break;
            case 3:
                //COVID-19 માટે સલામતી મુખ્ય
                setTitle("COVID-19 માટે સલામતી મુખ્ય");

                tv_safety_major_title_1.setText(R.string.guj_safety_majors_wash_hands_1);
                tv_safety_major_title_2.setText(R.string.guj_safety_majors_wear_mask_2);
                tv_safety_major_title_3.setText(R.string.guj_safety_majors_social_distance_3);
                tv_safety_major_title_4.setText(R.string.guj_safety_majors_touching_face_4);
                tv_safety_major_title_5.setText(R.string.guj_safety_majors_respiratory_5);
                tv_safety_major_title_6.setText(R.string.guj_safety_majors_medical_care_6);
                tv_safety_major_title_7.setText(R.string.guj_safety_majors_clean_everthing_7);
                tv_safety_major_title_8.setText(R.string.guj_safety_majors_vitamins_8);
                tv_safety_major_title_9.setText(R.string.guj_safety_majors_consume_liquids_9);
                tv_safety_major_title_10.setText(R.string.guj_safety_majors_vaild_info_10);
                tv_safety_major_title_11.setText(R.string.guj_safety_majors_family_time_11);

                tv_safety_major_body_1.setText(R.string.guj_safety_majors_wash_hands_para_1);
                tv_safety_major_body_2.setText(R.string.guj_safety_majors_wear_mask_para_2);
                tv_safety_major_body_3.setText(R.string.guj_safety_majors_social_distance_para_3);
                tv_safety_major_body_4.setText(R.string.guj_safety_majors_touching_face_para_4);
                tv_safety_major_body_5.setText(R.string.guj_safety_majors_respiratory_para_5);
                tv_safety_major_body_6.setText(R.string.guj_safety_majors_medical_care_para_6);
                tv_safety_major_body_7.setText(R.string.guj_safety_majors_clean_everthing_para_7);
                tv_safety_major_body_8.setText(R.string.guj_safety_majors_vitamins_para_8);
                tv_safety_major_body_9.setText(R.string.guj_safety_majors_consume_liquids_para_9);
                tv_safety_major_body_10.setText(R.string.guj_safety_majors_vaild_info_para_10);
                tv_safety_major_body_11.setText(R.string.guj_safety_majors_family_time_para_11);

                break;
        }

    }
}
