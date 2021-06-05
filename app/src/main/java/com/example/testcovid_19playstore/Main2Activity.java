package com.example.testcovid_19playstore;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.icu.text.DecimalFormat;
import android.icu.text.NumberFormat;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.view.View;
import android.widget.Button;
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

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        getSupportActionBar().hide();

        /* TextView  */
        symviewall=(TextView)findViewById(R.id.txtViewallSymptoms);
        safetyviewall=(TextView)findViewById(R.id.txtViewallSafety);
        tv_decease=(TextView)findViewById(R.id.txt_view_Deceased);
        tv_infected=(TextView)findViewById(R.id.txt_view_Infected);
        tv_recover=(TextView)findViewById(R.id.txt_view_Recoverd);

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

    private String getFormatedAmount(int amount) {
        return NumberFormat.getNumberInstance(Locale.US).format(amount);
    }

}
