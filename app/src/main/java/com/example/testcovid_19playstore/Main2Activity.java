package com.example.testcovid_19playstore;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.icu.text.DecimalFormat;
import android.icu.text.NumberFormat;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.w3c.dom.Text;

import java.util.Locale;

public class Main2Activity extends AppCompatActivity {

    TextView symviewall,safetyviewall;
    Button btntest,quarantine_act,covid_help_center;
    TextView tv_decease,tv_infected,tv_recover;
    ImageView imageView_select_lang;
    String selected_language = "English";
    int a =0;

    TextView main_tv_infect,main_tv_recover,main_tv_decease,main_tv_symptoms,main_tv_safety,main_tv_test_promt;
    TextView main_tv_symptoms_cough,main_tv_symptoms_fever,main_tv_symptoms_tiredness,main_tv_symptoms_throat;
    TextView main_tv_safety_major_wash_hands,main_tv_safety_major_distance,main_tv_safety_major_mask,main_tv_safety_major_home,main_tv_safety_major_clean_objects;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        getSupportActionBar().hide();

        main_tv_infect=(TextView)findViewById(R.id.text_view_main_covid_infected);
        main_tv_recover=(TextView)findViewById(R.id.text_view_main_covid_recovered);
        main_tv_decease=(TextView)findViewById(R.id.text_view_main_covid_deceased);
        main_tv_symptoms=(TextView)findViewById(R.id.main_home_symptoms);
        main_tv_safety=(TextView)findViewById(R.id.text_view_main_safety_majors);
        main_tv_test_promt=(TextView)findViewById(R.id.text_view_test_prompt);

        main_tv_symptoms_cough=(TextView)findViewById(R.id.txt_view_symptoms1_cough);
        main_tv_symptoms_fever=(TextView)findViewById(R.id.txt_view_symptoms2_fever);
        main_tv_symptoms_tiredness=(TextView)findViewById(R.id.txt_view_symptoms3_tiredness);
        main_tv_symptoms_throat=(TextView)findViewById(R.id.txt_view_symptoms4_sore_throat);

        main_tv_safety_major_wash_hands=(TextView)findViewById(R.id.txt_view_safety_1_hand_wash);
        main_tv_safety_major_distance=(TextView)findViewById(R.id.txt_view_safety_2_social_distance);
        main_tv_safety_major_mask=(TextView)findViewById(R.id.txt_view_safety_3_mask);
        main_tv_safety_major_home=(TextView)findViewById(R.id.txt_view_safety_4_stay_home);
        main_tv_safety_major_clean_objects=(TextView)findViewById(R.id.txt_view_safety_5_clean_object);


        /* TextView  */
        symviewall=(TextView)findViewById(R.id.txtViewallSymptoms);
        safetyviewall=(TextView)findViewById(R.id.txtViewallSafety);
        tv_decease=(TextView)findViewById(R.id.txt_view_Deceased);
        tv_infected=(TextView)findViewById(R.id.txt_view_Infected);
        tv_recover=(TextView)findViewById(R.id.txt_view_Recoverd);

        imageView_select_lang=(ImageView)findViewById(R.id.main_image_view_select_language);

        imageView_select_lang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showalertbox();
            }
        });

        RequestQueue requestQueue = Volley.newRequestQueue(this);
        String url="https://pomber.github.io/covid19/timeseries.json";

        JsonObjectRequest jsonObjectRequest = new JsonObjectRequest
                (Request.Method.GET, url, null, new Response.Listener<JSONObject>() {

                    @Override
                    public void onResponse(JSONObject response) {
                        String country="India";
                        try {
                            JSONArray jsonArray =response.getJSONArray(country);
                            JSONObject jsonObject = jsonArray.getJSONObject(jsonArray.length()-1);

                            String s_date = jsonObject.getString("date");
                            String s_infected = jsonObject.getString("confirmed");
                            String s_deceased = jsonObject.getString("deaths");
                            String s_recover = jsonObject.getString("recovered");

                            int int_intfected = Integer.parseInt(s_infected);
                            String infect = getFormatedAmount(int_intfected);

                            int int_decease = Integer.parseInt(s_deceased);
                            String decease = getFormatedAmount(int_decease);

                            int int_recover = Integer.parseInt(s_recover);
                            String recover = getFormatedAmount(int_recover);

                            tv_decease.setText(decease);
                            tv_infected.setText(infect);
                            tv_recover.setText(recover);

                        } catch (JSONException e) {
                            e.printStackTrace();
                        }

                    }
                }, new Response.ErrorListener() {

                    @Override
                    public void onErrorResponse(VolleyError error) {
                        // TODO: Handle error
                    }

                });

        requestQueue.add(jsonObjectRequest);

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

    void showalertbox(){

        final String [] language = {"English","Hindi","Gujarati"};
        AlertDialog.Builder builder = new AlertDialog.Builder(Main2Activity.this);
        builder.setTitle("Choose Language");
        //dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));

        builder.setSingleChoiceItems(language, 0, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                selected_language=language[which];
                //Toast.makeText(Main2Activity.this, "You Just Selected: "+selected_language, Toast.LENGTH_SHORT).show();
                if (selected_language.equals("English")){
                    a=1;
                    check_language.language=a;
                }
                else if (selected_language.equals("Hindi")){
                    a=2;
                    check_language.language=a;
                }
                else {
                    a=3;
                    check_language.language=a;
                }
            }
        });

        builder.setPositiveButton("Proceed", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.dismiss();
                switch (a)
                {
                    case 0:
                        Toast.makeText(Main2Activity.this, "Default Language Selected", Toast.LENGTH_SHORT).show();
                        checklang();
                        break;
                    case 1:
                        Toast.makeText(Main2Activity.this, "English Language Selected", Toast.LENGTH_SHORT).show();
                        checklang();
                        break;
                    case 2:
                        Toast.makeText(Main2Activity.this, "Hindi Language Selected", Toast.LENGTH_SHORT).show();
                        checklang();
                        break;
                    case 3:
                        Toast.makeText(Main2Activity.this, "Gujarati Language Selected", Toast.LENGTH_SHORT).show();
                        checklang();
                        break;
                }
            }
        });

        builder.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.dismiss();
            }
        });

        builder.show();

    }

    void checklang(){
        int lang =check_language.language;

        switch (lang)
        {
            case 1 :
                main_tv_infect.setText(R.string.eng_home_infected_tv);
                main_tv_recover.setText(R.string.eng_home_recovered_tv);
                main_tv_decease.setText(R.string.eng_home_deceased_tv);

                main_tv_symptoms.setText(R.string.eng_home_symptoms_tv);
                symviewall.setText(R.string.eng_home_view_text_view_all);
                main_tv_symptoms_cough.setText(R.string.eng_symptoms_dry_cough_1);
                main_tv_symptoms_fever.setText(R.string.eng_symptoms_fever_2);
                main_tv_symptoms_tiredness.setText(R.string.eng_symptoms_tiredness_3);
                main_tv_symptoms_throat.setText(R.string.eng_symptoms_throat_7);

                main_tv_test_promt.setText(R.string.eng_home_test_prompt_tv);
                btntest.setText(R.string.eng_home_test_button);

                quarantine_act.setText(R.string.eng_home_quarantine_act_btn);
                covid_help_center.setText(R.string.eng_home_covid_help_center_btn);

                main_tv_safety.setText(R.string.eng_home_safety_tv);

                main_tv_safety_major_wash_hands.setText(R.string.eng_safety_majors_wash_hands_1);
                main_tv_safety_major_distance.setText(R.string.eng_safety_majors_social_distance_3);
                main_tv_safety_major_mask.setText(R.string.eng_safety_majors_wear_mask_2);
                main_tv_safety_major_home.setText("Stay Home");
                main_tv_safety_major_clean_objects.setText(R.string.eng_safety_majors_clean_everthing_7);

                safetyviewall.setText(R.string.eng_home_view_text_view_all);
                break;


            case 2:
                main_tv_infect.setText(R.string.hindi_home_infected_tv);
                main_tv_recover.setText(R.string.hindi_home_recovered_tv);
                main_tv_decease.setText(R.string.hindi_home_deceased_tv);

                main_tv_symptoms.setText(R.string.hindi_home_symptoms_tv);
                symviewall.setText(R.string.hindi_home_view_text_view_all);
                main_tv_symptoms_cough.setText(R.string.hindi_symptoms_dry_cough_1);
                main_tv_symptoms_fever.setText(R.string.hindi_symptoms_fever_2);
                main_tv_symptoms_tiredness.setText(R.string.hindi_symptoms_tiredness_3);
                main_tv_symptoms_throat.setText(R.string.hindi_symptoms_throat_7);

                main_tv_test_promt.setText(R.string.hindi_home_test_prompt_tv);
                btntest.setText(R.string.hindi_home_test_button);

                quarantine_act.setText(R.string.hindi_home_quarantine_act_btn);
                covid_help_center.setText(R.string.hindi_home_covid_help_center_btn);

                main_tv_safety.setText(R.string.hindi_home_safety_tv);

                main_tv_safety_major_wash_hands.setText(R.string.hindi_safety_majors_wash_hands_1);
                main_tv_safety_major_distance.setText(R.string.hindi_safety_majors_social_distance_3);
                main_tv_safety_major_mask.setText(R.string.hindi_safety_majors_wear_mask_2);
                main_tv_safety_major_home.setText("घर पर रहें");
                main_tv_safety_major_clean_objects.setText(R.string.hindi_safety_majors_clean_everthing_7);

                safetyviewall.setText(R.string.hindi_home_view_text_view_all);

                break;
            case 3:
                main_tv_infect.setText(R.string.guj_home_infected_tv);
                main_tv_recover.setText(R.string.guj_home_recovered_tv);
                main_tv_decease.setText(R.string.guj_home_deceased_tv);

                main_tv_symptoms.setText(R.string.guj_home_symptoms_tv);
                symviewall.setText(R.string.guj_home_view_text_view_all);
                main_tv_symptoms_cough.setText(R.string.guj_symptoms_dry_cough_1);
                main_tv_symptoms_fever.setText(R.string.guj_symptoms_fever_2);
                main_tv_symptoms_tiredness.setText(R.string.guj_symptoms_tiredness_3);
                main_tv_symptoms_throat.setText(R.string.guj_symptoms_throat_7);

                main_tv_test_promt.setText(R.string.guj_home_test_prompt_tv);
                btntest.setText(R.string.guj_home_test_button);

                quarantine_act.setText(R.string.guj_home_quarantine_act_btn);
                covid_help_center.setText(R.string.guj_home_covid_help_center_btn);

                main_tv_safety.setText(R.string.guj_home_safety_tv);

                main_tv_safety_major_wash_hands.setText(R.string.guj_safety_majors_wash_hands_1);
                main_tv_safety_major_distance.setText(R.string.guj_safety_majors_social_distance_3);
                main_tv_safety_major_mask.setText(R.string.guj_safety_majors_wear_mask_2);
                main_tv_safety_major_home.setText("ઘરે રહો");
                main_tv_safety_major_clean_objects.setText(R.string.guj_safety_majors_clean_everthing_7);

                safetyviewall.setText(R.string.guj_home_view_text_view_all);
                break;

        }
    }

    private String getFormatedAmount(int amount) {
        return NumberFormat.getNumberInstance(Locale.US).format(amount);
    }

    @Override
    public void onBackPressed() {
        finishAffinity();
    }
}
