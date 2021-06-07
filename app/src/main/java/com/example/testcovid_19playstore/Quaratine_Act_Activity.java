package com.example.testcovid_19playstore;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class Quaratine_Act_Activity extends AppCompatActivity {

    TextView tv_quarantine_title_1,tv_quarantine_title_2,tv_quarantine_title_3,tv_quarantine_title_4,tv_quarantine_title_5,tv_quarantine_title_6,tv_quarantine_title_7;
    TextView tv_quarantine_body_1,tv_quarantine_body_2,tv_quarantine_body_3,tv_quarantine_body_4,tv_quarantine_body_5,tv_quarantine_body_6,tv_quarantine_body_7;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quaratine__act_);

        tv_quarantine_body_1=(TextView)findViewById(R.id.text_view_quarantine_activities_body_1);
        tv_quarantine_body_2=(TextView)findViewById(R.id.text_view_quarantine_activities_body_2);
        tv_quarantine_body_3=(TextView)findViewById(R.id.text_view_quarantine_activities_body_3);
        tv_quarantine_body_4=(TextView)findViewById(R.id.text_view_quarantine_activities_body_4);
        tv_quarantine_body_5=(TextView)findViewById(R.id.text_view_quarantine_activities_body_5);
        tv_quarantine_body_6=(TextView)findViewById(R.id.text_view_quarantine_activities_body_6);
        tv_quarantine_body_7=(TextView)findViewById(R.id.text_view_quarantine_activities_body_7);

        tv_quarantine_title_1=(TextView)findViewById(R.id.text_view_quarantine_activities_title_1);
        tv_quarantine_title_2=(TextView)findViewById(R.id.text_view_quarantine_activities_title_2);
        tv_quarantine_title_3=(TextView)findViewById(R.id.text_view_quarantine_activities_title_3);
        tv_quarantine_title_4=(TextView)findViewById(R.id.text_view_quarantine_activities_title_4);
        tv_quarantine_title_5=(TextView)findViewById(R.id.text_view_quarantine_activities_title_5);
        tv_quarantine_title_6=(TextView)findViewById(R.id.text_view_quarantine_activities_title_6);
        tv_quarantine_title_7=(TextView)findViewById(R.id.text_view_quarantine_activities_title_7);



        int quarantine_lang=check_language.language;

        switch (quarantine_lang)
        {
            case 1:

                setTitle("Quarantine Activities ");

                tv_quarantine_title_1.setText(R.string.eng_quarantine_acts_exercise_1);
                tv_quarantine_title_2.setText(R.string.eng_quarantine_acts_new_recipes_2);
                tv_quarantine_title_3.setText(R.string.eng_quarantine_acts_read_book_3);
                tv_quarantine_title_4.setText(R.string.eng_quarantine_acts_friends_4);
                tv_quarantine_title_5.setText(R.string.eng_quarantine_acts_watch_sports_5);
                tv_quarantine_title_6.setText(R.string.eng_quarantine_acts_watch_movies_6);
                tv_quarantine_title_7.setText(R.string.eng_quarantine_acts_learn_lang_7);

                tv_quarantine_body_1.setText(R.string.eng_quarantine_acts_exercise_para_1);
                tv_quarantine_body_2.setText(R.string.eng_quarantine_acts_new_recipes_para_2);
                tv_quarantine_body_3.setText(R.string.eng_quarantine_acts_read_book_para_3);
                tv_quarantine_body_4.setText(R.string.eng_quarantine_acts_friends_para_4);
                tv_quarantine_body_5.setText(R.string.eng_quarantine_acts_watch_sports_para_5);
                tv_quarantine_body_6.setText(R.string.eng_quarantine_acts_watch_movies_para_6);
                tv_quarantine_body_7.setText(R.string.eng_quarantine_acts_learn_lang_para_7);

                break;

            case 2:
                setTitle("संगरोध गतिविधियां");
                tv_quarantine_title_1.setText(R.string.hindi_quarantine_acts_exercise_1);
                tv_quarantine_title_2.setText(R.string.hindi_quarantine_acts_new_recipes_2);
                tv_quarantine_title_3.setText(R.string.hindi_quarantine_acts_read_book_3);
                tv_quarantine_title_4.setText(R.string.hindi_quarantine_acts_friends_4);
                tv_quarantine_title_5.setText(R.string.hindi_quarantine_acts_watch_sports_5);
                tv_quarantine_title_6.setText(R.string.hindi_quarantine_acts_watch_movies_6);
                tv_quarantine_title_7.setText(R.string.hindi_quarantine_acts_learn_lang_7);

                tv_quarantine_body_1.setText(R.string.hindi_quarantine_acts_exercise_para_1);
                tv_quarantine_body_2.setText(R.string.hindi_quarantine_acts_new_recipes_para_2);
                tv_quarantine_body_3.setText(R.string.hindi_quarantine_acts_read_book_para_3);
                tv_quarantine_body_4.setText(R.string.hindi_quarantine_acts_friends_para_4);
                tv_quarantine_body_5.setText(R.string.hindi_quarantine_acts_watch_sports_para_5);
                tv_quarantine_body_6.setText(R.string.hindi_quarantine_acts_watch_movies_para_6);
                tv_quarantine_body_7.setText(R.string.hindi_quarantine_acts_learn_lang_para_7);

                break;

            case 3:
                setTitle("સંસર્ગનિષેધ પ્રવૃત્તિઓ");
                tv_quarantine_title_1.setText(R.string.guj_quarantine_acts_exercise_1);
                tv_quarantine_title_2.setText(R.string.guj_quarantine_acts_new_recipes_2);
                tv_quarantine_title_3.setText(R.string.guj_quarantine_acts_read_book_3);
                tv_quarantine_title_4.setText(R.string.guj_quarantine_acts_friends_4);
                tv_quarantine_title_5.setText(R.string.guj_quarantine_acts_watch_sports_5);
                tv_quarantine_title_6.setText(R.string.guj_quarantine_acts_watch_movies_6);
                tv_quarantine_title_7.setText(R.string.guj_quarantine_acts_learn_lang_7);

                tv_quarantine_body_1.setText(R.string.guj_quarantine_acts_exercise_para_1);
                tv_quarantine_body_2.setText(R.string.guj_quarantine_acts_new_recipes_para_2);
                tv_quarantine_body_3.setText(R.string.guj_quarantine_acts_read_book_para_3);
                tv_quarantine_body_4.setText(R.string.guj_quarantine_acts_friends_para_4);
                tv_quarantine_body_5.setText(R.string.guj_quarantine_acts_watch_sports_para_5);
                tv_quarantine_body_6.setText(R.string.guj_quarantine_acts_watch_movies_para_6);
                tv_quarantine_body_7.setText(R.string.guj_quarantine_acts_learn_lang_para_7);

                break;
        }

    }
}