package com.example.testcovid_19playstore;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.tabs.TabItem;
import com.google.android.material.tabs.TabLayout;

public class OnBoardingActivity extends AppCompatActivity {


    ViewPager viewPager;
    PagerAdapter adapter;
    TabLayout tabLayout;
    TabItem tabItem_1,tabItem_2,tabItem_3;
    TextView textView_skip;

    TextView tv_pervious,tv_next;
    int button_counter=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_on_boarding);

        getSupportActionBar().hide();
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);


        //CHECKS IF APPLICATION IS OPEN FOR FIRST TIME
        SharedPreferences sharedPreferences = getSharedPreferences("PREFERENCES",MODE_PRIVATE);
        String FirstTime = sharedPreferences.getString("FirstTimeInstall","");

        if (FirstTime.equals("Yes"))
        {
            //IF APP IS OPENED FOR FIRST TIME
            startActivity(new Intent(OnBoardingActivity.this,MainActivity.class));
        }
        else
        {
            //CHANGE THE PREFERENCES
            SharedPreferences.Editor editor = sharedPreferences.edit();
            editor.putString("FirstTimeInstall","Yes");
            editor.apply();
        }



        viewPager=(ViewPager)findViewById(R.id.viewpager);
        tabLayout=(TabLayout)findViewById(R.id.tablayout);
        tabItem_1=(TabItem)findViewById(R.id.firstItem);
        tabItem_2=(TabItem)findViewById(R.id.secondItem);
        tabItem_3=(TabItem)findViewById(R.id.thirditem);

        tv_next=(TextView)findViewById(R.id.text_view_next);
        tv_pervious=(TextView)findViewById(R.id.text_view_pervious);

        tv_next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                viewPager.setCurrentItem(viewPager.getCurrentItem()+1,true);
                int a =viewPager.getCurrentItem();
                //Toast.makeText(OnBoardingActivity.this, " "+a, Toast.LENGTH_SHORT).show();
                if (viewPager.getCurrentItem()==2){
                    button_counter++;
                }
                if (button_counter>1){
                    Intent i = new Intent(OnBoardingActivity.this,Main2Activity.class);
                    startActivity(i);
                    finishAffinity();
                }

            }
        });


        tv_pervious.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                viewPager.setCurrentItem(viewPager.getCurrentItem()-1,true);
                button_counter--;


            }
        });

        textView_skip=(TextView)findViewById(R.id.text_view_skip);
        textView_skip.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(OnBoardingActivity.this,Main2Activity.class);
                startActivity(i);
                finishAffinity();
            }
        });


        adapter=new PagerAdapter(getSupportFragmentManager(), FragmentPagerAdapter.BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT,tabLayout.getTabCount());
        viewPager.setAdapter(adapter);

        viewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));


        tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                viewPager.setCurrentItem(tab.getPosition());
                int a =tab.getPosition();
                a++;
                //Toast.makeText(OnBoardingActivity.this, " "+a, Toast.LENGTH_SHORT).show();

            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });


    }
}