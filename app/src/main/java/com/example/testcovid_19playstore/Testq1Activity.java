package com.example.testcovid_19playstore;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class Testq1Activity extends AppCompatActivity {


    CardView cardViewq1,cardViewq2 ,cvq3,cvq4,cvq5,cvq6,cvq7,cvq8,cvq9,cvq10,cvq11,cvq12;

    LinearLayout layoutcough,layoutfever,layoutnameplace,layoutnamediseases,layoutdays;

    RadioButton yes1 , no1 , yes2,no2 ,y3,n3,y4,n4,y5,n5,y6,n6,y7,n7,y8,n8,y9,n9,y10,n10,y11,n11,y12,n12;

    RadioButton cold,dry,low,medium,high,o_tdays,t_fdays,f_sdays;

    EditText etnameplace,etdiseasesname;

    Button btnnext;

    TextView tv1,tv2,tv3,tv4,tv5,tv6,tv7,tv8,tv9,tv10,tv11,tv12,tv1_1,tv2_2,tv10_2,tv11_2,tv12_2;

    TextView q1,q2,q3,q4,q5,q6,q7,q8,q9,q10,q11,q12;

    public int question_pointer=0;
    public int score=00;

    public int final_lang=0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_testq1);

        /*  TextView for Question View full Question */

        tv1=(TextView)findViewById(R.id.txtquestion1_1);
        tv1_1=(TextView)findViewById(R.id.txtquestion1_2);

        tv2=(TextView)findViewById(R.id.txtquestion2_1);
        tv2_2=(TextView)findViewById(R.id.txtquestion2_2);

        tv3=(TextView)findViewById(R.id.txtquestion3_1);
        tv4=(TextView)findViewById(R.id.txtquestion4_1);
        tv5=(TextView)findViewById(R.id.txtquestion5_1);
        tv6=(TextView)findViewById(R.id.txtquestion6_1);
        tv7=(TextView)findViewById(R.id.txtquestion7_1);
        tv8=(TextView)findViewById(R.id.txtquestion8_1);
        tv9=(TextView)findViewById(R.id.txtquestion9_1);
        tv10=(TextView)findViewById(R.id.txtquestion10_1);
        tv10_2=(TextView)findViewById(R.id.txtquestion10_2);

        tv11=(TextView)findViewById(R.id.txtquestion11_1);
        tv11_2=(TextView)findViewById(R.id.txtquestion11_2);


        tv12=(TextView)findViewById(R.id.txtquestion12_1);
        tv12_2=(TextView)findViewById(R.id.txtquestion12_2);


        /*  TextView for Question number*/

        q1=(TextView)findViewById(R.id.txtquestion1);
        q2=(TextView)findViewById(R.id.txtquestion2);
        q3=(TextView)findViewById(R.id.txtquestion3);
        q4=(TextView)findViewById(R.id.txtquestion4);
        q5=(TextView)findViewById(R.id.txtquestion5);
        q6=(TextView)findViewById(R.id.txtquestion6);
        q7=(TextView)findViewById(R.id.txtquestion7);
        q8=(TextView)findViewById(R.id.txtquestion8);
        q9=(TextView)findViewById(R.id.txtquestion9);
        q10=(TextView)findViewById(R.id.txtquestion10);
        q11=(TextView)findViewById(R.id.txtquestion11);
        q12=(TextView)findViewById(R.id.txtquestion12);


        /*  Edittext for Question View */

        etnameplace=(EditText)findViewById(R.id.nametheplace);
        etdiseasesname=(EditText)findViewById(R.id.namethediseases);


        /*  Button for Question View */
        btnnext=(Button)findViewById(R.id.buttonnextq1);



        /* Linear layout view for 2nd Part */
        layoutcough=(LinearLayout)findViewById(R.id.detailcough);
        layoutfever=(LinearLayout)findViewById(R.id.detailfever);
        layoutnamediseases=(LinearLayout)findViewById(R.id.detaildiseases);
        layoutdays=(LinearLayout)findViewById(R.id.detaildays);
        layoutnameplace=(LinearLayout)findViewById(R.id.detailplacename);

        /* Linear layout setVisibility for 2nd Part */
        layoutfever.setVisibility(View.GONE);
        layoutcough.setVisibility(View.GONE);
        layoutnamediseases.setVisibility(View.GONE);
        layoutdays.setVisibility(View.GONE);
        layoutnameplace.setVisibility(View.GONE);

        /* Card view for other question */
        cardViewq1=(CardView)findViewById(R.id.question01);
        cardViewq2=(CardView)findViewById(R.id.question02);
        cvq3=(CardView)findViewById(R.id.question03);
        cvq4=(CardView)findViewById(R.id.question04);
        cvq5=(CardView)findViewById(R.id.question05);
        cvq6=(CardView)findViewById(R.id.question06);
        cvq7=(CardView)findViewById(R.id.question07);
        cvq8=(CardView)findViewById(R.id.question08);
        cvq9=(CardView)findViewById(R.id.question09);
        cvq10=(CardView)findViewById(R.id.question10);
        cvq11=(CardView)findViewById(R.id.question11);
        cvq12=(CardView)findViewById(R.id.question12);



        /* Card view setVisibility for other question */

        cardViewq2.setVisibility(View.GONE);
        cvq3.setVisibility(View.GONE);
        cvq4.setVisibility(View.GONE);
        cvq5.setVisibility(View.GONE);
        cvq6.setVisibility(View.GONE);
        cvq7.setVisibility(View.GONE);
        cvq8.setVisibility(View.GONE);
        cvq9.setVisibility(View.GONE);
        cvq10.setVisibility(View.GONE);
        cvq11.setVisibility(View.GONE);
        cvq12.setVisibility(View.GONE);







        /* Radio Buttons for 2nd Part of Question 1 */
        cold=(RadioButton)findViewById(R.id.radioButtonq1cold);
        dry=(RadioButton)findViewById(R.id.radioButtonq1dry);

        low=(RadioButton)findViewById(R.id.radioButtonq1low);
        medium=(RadioButton)findViewById(R.id.radioButtonq2medium);
        high=(RadioButton)findViewById(R.id.radioButtonq2high);

        o_tdays=(RadioButton)findViewById(R.id.radioButtonq01one_twodays);
        t_fdays=(RadioButton)findViewById(R.id.radioButtonq02three_4days);
        f_sdays=(RadioButton)findViewById(R.id.radioButtonq03five_6days);

        /* Radio Buttons for Question q  */
        yes1=(RadioButton)findViewById(R.id.radioButtonq1yes);
        no1=(RadioButton)findViewById(R.id.radioButtonq1no);

        yes2=(RadioButton)findViewById(R.id.radioButtonq2yes);
        no2=(RadioButton)findViewById(R.id.radioButtonq2no);

        y3=(RadioButton)findViewById(R.id.radioButtonq3yes);
        n3=(RadioButton)findViewById(R.id.radioButtonq3no);

        y4=(RadioButton)findViewById(R.id.radioButtonq4yes);
        n4=(RadioButton)findViewById(R.id.radioButtonq4no);

        y5=(RadioButton)findViewById(R.id.radioButtonq5yes);
        n5=(RadioButton)findViewById(R.id.radioButtonq5no);

        y6=(RadioButton)findViewById(R.id.radioButtonq6yes);
        n6=(RadioButton)findViewById(R.id.radioButtonq6no);

        y7=(RadioButton)findViewById(R.id.radioButtonq7yes);
        n7=(RadioButton)findViewById(R.id.radioButtonq7no);

        y8=(RadioButton)findViewById(R.id.radioButtonq8yes);
        n8=(RadioButton)findViewById(R.id.radioButtonq8no);

        y9=(RadioButton)findViewById(R.id.radioButtonq9yes);
        n9=(RadioButton)findViewById(R.id.radioButtonq9no);

        y10=(RadioButton)findViewById(R.id.radioButtonq10yes);
        n10=(RadioButton)findViewById(R.id.radioButtonq10no);

        y11=(RadioButton)findViewById(R.id.radioButtonq11yes);
        n11=(RadioButton)findViewById(R.id.radioButtonq11no);

        y12=(RadioButton)findViewById(R.id.radioButtonq12yes);
        n12=(RadioButton)findViewById(R.id.radioButtonq12no);

        checklanug();


        /* Radio Buttons On Click Listener for Yes No for Question 1 */
        yes1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {



                if (yes1.isChecked())
                {


                    layoutcough.setVisibility(View.VISIBLE);
                }

            }
        });

        no1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                if (no1.isChecked())
                {


                    layoutcough.setVisibility(View.GONE);
                    question_pointer=2;


                }

            }
        });


        /* Radio Buttons On Click Listener for Yes No for Question 1 part 2nd */
        cold.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (cold.isChecked())
                {

                    question_pointer=2;


                }


            }
        });

        dry.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (dry.isChecked())
                {

                    question_pointer=2;
                    score=score+2;

                }


            }
        });


        /* Radio Buttons On Click Listener for Yes & NO in Question 2 */
        yes2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                if (yes2.isChecked())
                {


                    layoutfever.setVisibility(View.VISIBLE);
                }

            }
        });

        no2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                if (no2.isChecked())
                {


                    question_pointer=3;
                    layoutfever.setVisibility(View.GONE);
                }

            }
        });

        /* Radio Buttons On Click Listener for low & medium in Question 2 2nd part */
        low.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (low.isChecked())
                {

                    question_pointer=3;
                    score=score+1;


                }

            }
        });

        medium.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (medium.isChecked())
                {

                    question_pointer=3;
                    score=score+2;


                }

            }
        });

        high.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (high.isChecked())
                {

                    question_pointer=3;
                    score=score+2;


                }

            }
        });

        /* Radio Buttons On Click Listener for Yes & NO in Question 3 */
        y3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                if (y3.isChecked())
                {


                    question_pointer=4;
                    score=score+2;
                }

            }
        });

        n3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                if (n3.isChecked())
                {

                    question_pointer=4;
                }

            }
        });

        /* Radio Buttons On Click Listener for Yes & NO in Question 4 */
        y4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                if (y4.isChecked())
                {

                    question_pointer=5;
                    score=score+2;
                }

            }
        });

        n4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                if (n4.isChecked())
                {

                    question_pointer=5;
                }

            }
        });


        /* Radio Buttons On Click Listener for Yes & NO in Question 5 */
        y5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                if (y5.isChecked())
                {

                    question_pointer=6;
                    score=score+2;
                }

            }
        });

        n5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                if (n5.isChecked())
                {

                    question_pointer=6;
                }

            }
        });


        /* Radio Buttons On Click Listener for Yes & NO in Question 6 */
        y6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                if (y6.isChecked())
                {

                    score=score+2;
                    question_pointer=7;
                }

            }
        });

        n6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                if (n6.isChecked())
                {

                    question_pointer=7;
                }

            }
        });

        /* Radio Buttons On Click Listener for Yes & NO in Question 7 */
        y7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (y7.isChecked())
                {

                    question_pointer=8;
                    score=score+2;
                }

            }
        });

        n7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                if (n7.isChecked())
                {

                    question_pointer=8;
                }

            }
        });

        /* Radio Buttons On Click Listener for Yes & NO in Question 8 */
        y8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                if (y8.isChecked())
                {

                    question_pointer=9;
                    score=score+2;
                }

            }
        });

        n8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                if (n8.isChecked())
                {

                    question_pointer=9;
                }

            }
        });

        /* Radio Buttons On Click Listener for Yes & NO in Question 9 */
        y9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                if (y9.isChecked())
                {

                    question_pointer=10;
                    score=score+2;
                }

            }
        });

        n9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                if (n9.isChecked())
                {

                    question_pointer=10;
                }

            }
        });

        /* Radio Buttons On Click Listener for Yes & NO in Question 10 */
        y10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (y10.isChecked())
                {


                    layoutnameplace.setVisibility(View.VISIBLE);

                }

            }
        });

        n10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (n10.isChecked())
                {


                    question_pointer=11;
                    layoutnameplace.setVisibility(View.GONE);

                }

            }
        });




        /* Radio Buttons On Click Listener for Yes & NO in Question 11 */
        y11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (y11.isChecked())
                {


                    layoutnamediseases.setVisibility(View.VISIBLE);
                }

            }
        });

        n11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                if (n11.isChecked())
                {

                    question_pointer=12;
                    layoutnamediseases.setVisibility(View.GONE);
                }

            }
        });

        /* Radio Buttons On Click Listener for Yes & NO in Question 12 */
        y12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                if (y12.isChecked())
                {

                    layoutdays.setVisibility(View.VISIBLE);
                }

            }
        });

        n12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                if (n12.isChecked())
                {

                    question_pointer=13;
                    layoutdays.setVisibility(View.GONE);
                }

            }
        });

        /* Radio Buttons On Click Listener for Yes & NO in Question 12 part 2 */
        o_tdays.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                if (o_tdays.isChecked())
                {
                    question_pointer=13;
                    score=score+1;


                }

            }
        });

        t_fdays.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                if (t_fdays.isChecked())
                {
                    question_pointer=13;
                    score=score+2;


                }

            }
        });

        f_sdays.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                if (f_sdays.isChecked())
                {
                    question_pointer=13;
                    score=score+2;


                }

            }
        });







        /* Buttons On Click Listener for next Question  */
        btnnext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                if (question_pointer == 0)
                {
                    Toast.makeText(Testq1Activity.this, " Please answer the question", Toast.LENGTH_LONG).show();
                }

                else if (question_pointer == 2)
                {

                    cardViewq1.setVisibility(View.GONE);
                    cardViewq2.setVisibility(View.VISIBLE);
                    cvq3.setVisibility(View.GONE);
                    cvq4.setVisibility(View.GONE);
                    cvq5.setVisibility(View.GONE);
                    cvq6.setVisibility(View.GONE);
                    cvq7.setVisibility(View.GONE);
                    cvq8.setVisibility(View.GONE);
                    cvq9.setVisibility(View.GONE);
                    cvq10.setVisibility(View.GONE);
                    cvq11.setVisibility(View.GONE);
                    cvq12.setVisibility(View.GONE);

                }
                else if (question_pointer == 3)
                {

                    cardViewq1.setVisibility(View.GONE);
                    cardViewq2.setVisibility(View.GONE);
                    cvq3.setVisibility(View.VISIBLE);
                    cvq4.setVisibility(View.GONE);
                    cvq5.setVisibility(View.GONE);
                    cvq6.setVisibility(View.GONE);
                    cvq7.setVisibility(View.GONE);
                    cvq8.setVisibility(View.GONE);
                    cvq9.setVisibility(View.GONE);
                    cvq10.setVisibility(View.GONE);
                    cvq11.setVisibility(View.GONE);
                    cvq12.setVisibility(View.GONE);

                }
                else if (question_pointer == 4)
                {

                    cardViewq1.setVisibility(View.GONE);
                    cardViewq2.setVisibility(View.GONE);
                    cvq3.setVisibility(View.GONE);
                    cvq4.setVisibility(View.VISIBLE);
                    cvq5.setVisibility(View.GONE);
                    cvq6.setVisibility(View.GONE);
                    cvq7.setVisibility(View.GONE);
                    cvq8.setVisibility(View.GONE);
                    cvq9.setVisibility(View.GONE);
                    cvq10.setVisibility(View.GONE);
                    cvq11.setVisibility(View.GONE);
                    cvq12.setVisibility(View.GONE);

                }
                else if (question_pointer == 5)
                {

                    cardViewq1.setVisibility(View.GONE);
                    cardViewq2.setVisibility(View.GONE);
                    cvq3.setVisibility(View.GONE);
                    cvq4.setVisibility(View.GONE);
                    cvq5.setVisibility(View.VISIBLE);
                    cvq6.setVisibility(View.GONE);
                    cvq7.setVisibility(View.GONE);
                    cvq8.setVisibility(View.GONE);
                    cvq9.setVisibility(View.GONE);
                    cvq10.setVisibility(View.GONE);
                    cvq11.setVisibility(View.GONE);
                    cvq12.setVisibility(View.GONE);

                }
                else if (question_pointer == 6)
                {

                    cardViewq1.setVisibility(View.GONE);
                    cardViewq2.setVisibility(View.GONE);
                    cvq3.setVisibility(View.GONE);
                    cvq4.setVisibility(View.GONE);
                    cvq5.setVisibility(View.GONE);
                    cvq6.setVisibility(View.VISIBLE);
                    cvq7.setVisibility(View.GONE);
                    cvq8.setVisibility(View.GONE);
                    cvq9.setVisibility(View.GONE);
                    cvq10.setVisibility(View.GONE);
                    cvq11.setVisibility(View.GONE);
                    cvq12.setVisibility(View.GONE);

                }
                else if (question_pointer == 7)
                {

                    cardViewq1.setVisibility(View.GONE);
                    cardViewq2.setVisibility(View.GONE);
                    cvq3.setVisibility(View.GONE);
                    cvq4.setVisibility(View.GONE);
                    cvq5.setVisibility(View.GONE);
                    cvq6.setVisibility(View.GONE);
                    cvq7.setVisibility(View.VISIBLE);
                    cvq8.setVisibility(View.GONE);
                    cvq9.setVisibility(View.GONE);
                    cvq10.setVisibility(View.GONE);
                    cvq11.setVisibility(View.GONE);
                    cvq12.setVisibility(View.GONE);

                }
                else if (question_pointer == 8)
                {

                    cardViewq1.setVisibility(View.GONE);
                    cardViewq2.setVisibility(View.GONE);
                    cvq3.setVisibility(View.GONE);
                    cvq4.setVisibility(View.GONE);
                    cvq5.setVisibility(View.GONE);
                    cvq6.setVisibility(View.GONE);
                    cvq7.setVisibility(View.GONE);
                    cvq8.setVisibility(View.VISIBLE);
                    cvq9.setVisibility(View.GONE);
                    cvq10.setVisibility(View.GONE);
                    cvq11.setVisibility(View.GONE);
                    cvq12.setVisibility(View.GONE);

                }
                else if (question_pointer == 9)
                {

                    cardViewq1.setVisibility(View.GONE);
                    cardViewq2.setVisibility(View.GONE);
                    cvq3.setVisibility(View.GONE);
                    cvq4.setVisibility(View.GONE);
                    cvq5.setVisibility(View.GONE);
                    cvq6.setVisibility(View.GONE);
                    cvq7.setVisibility(View.GONE);
                    cvq8.setVisibility(View.GONE);
                    cvq9.setVisibility(View.VISIBLE);
                    cvq10.setVisibility(View.GONE);
                    cvq11.setVisibility(View.GONE);
                    cvq12.setVisibility(View.GONE);
                }
                else if (question_pointer == 10)
                {

                    cardViewq1.setVisibility(View.GONE);
                    cardViewq2.setVisibility(View.GONE);
                    cvq3.setVisibility(View.GONE);
                    cvq4.setVisibility(View.GONE);
                    cvq5.setVisibility(View.GONE);
                    cvq6.setVisibility(View.GONE);
                    cvq7.setVisibility(View.GONE);
                    cvq8.setVisibility(View.GONE);
                    cvq9.setVisibility(View.GONE);
                    cvq10.setVisibility(View.VISIBLE);
                    cvq11.setVisibility(View.GONE);
                    cvq12.setVisibility(View.GONE);

                    checkedittextplacename();

                }
                else if (question_pointer == 11)
                {

                    cardViewq1.setVisibility(View.GONE);
                    cardViewq2.setVisibility(View.GONE);
                    cvq3.setVisibility(View.GONE);
                    cvq4.setVisibility(View.GONE);
                    cvq5.setVisibility(View.GONE);
                    cvq6.setVisibility(View.GONE);
                    cvq7.setVisibility(View.GONE);
                    cvq8.setVisibility(View.GONE);
                    cvq9.setVisibility(View.GONE);
                    cvq10.setVisibility(View.GONE);
                    cvq11.setVisibility(View.VISIBLE);
                    cvq12.setVisibility(View.GONE);

                    checkedittextdiseasesname();


                }
                else if (question_pointer == 12)
                {

                    cardViewq1.setVisibility(View.GONE);
                    cardViewq2.setVisibility(View.GONE);
                    cvq3.setVisibility(View.GONE);
                    cvq4.setVisibility(View.GONE);
                    cvq5.setVisibility(View.GONE);
                    cvq6.setVisibility(View.GONE);
                    cvq7.setVisibility(View.GONE);
                    cvq8.setVisibility(View.GONE);
                    cvq9.setVisibility(View.GONE);
                    cvq10.setVisibility(View.GONE);
                    cvq11.setVisibility(View.GONE);
                    cvq12.setVisibility(View.VISIBLE);

                }
                else if (question_pointer == 13)
                {

                    cardViewq1.setVisibility(View.GONE);
                    cardViewq2.setVisibility(View.GONE);
                    cvq3.setVisibility(View.GONE);
                    cvq4.setVisibility(View.GONE);
                    cvq5.setVisibility(View.GONE);
                    cvq6.setVisibility(View.GONE);
                    cvq7.setVisibility(View.GONE);
                    cvq8.setVisibility(View.GONE);
                    cvq9.setVisibility(View.GONE);
                    cvq10.setVisibility(View.GONE);
                    cvq11.setVisibility(View.GONE);
                    cvq12.setVisibility(View.VISIBLE);

                    nextscreen();

                }
                else
                {
                    Toast.makeText(Testq1Activity.this, " Now Test is Over Wait for Result", Toast.LENGTH_LONG).show();
                }


            }
        });


    }

    public void checkedittextplacename()
    {
        String nameofplace=etnameplace.getText().toString();

       if(y10.isChecked())
       {

           if (nameofplace.isEmpty()) {
               Toast.makeText(Testq1Activity.this, "Please fill the edit text ", Toast.LENGTH_LONG).show();
           } else {
               score = score + 2;
               question_pointer = 11;
           }
       }
    }

    public void checkedittextdiseasesname()
    {
        String diseasesname=etdiseasesname.getText().toString();

        if(y11.isChecked())
        {


            if (diseasesname.isEmpty()) {
                Toast.makeText(Testq1Activity.this, "Please fill the edit text ", Toast.LENGTH_LONG).show();
            } else {
                score = score + 2;
                question_pointer = 12;
            }
        }
    }

    public void nextscreen()
    {
        Intent i = new Intent(Testq1Activity.this,ResultActivity.class);
        i.putExtra("Score",score);
        startActivity(i);
    }

    public void checklanug()
    {
        Intent q=getIntent();
        final_lang = q.getIntExtra("Language",0);
        if(final_lang == 1)
        {
            q1.setText(R.string.hindiquestion_1);
            q2.setText(R.string.hindiquestion_2);
            q3.setText(R.string.hindiquestion_3);
            q4.setText(R.string.hindiquestion_4);
            q5.setText(R.string.hindiquestion_5);
            q6.setText(R.string.hindiquestion_6);
            q7.setText(R.string.hindiquestion_7);
            q8.setText(R.string.hindiquestion_8);
            q9.setText(R.string.hindiquestion_9);
            q10.setText(R.string.hindiquestion_10);
            q11.setText(R.string.hindiquestion_11);
            q12.setText(R.string.hindiquestion_12);


            yes1.setText(R.string.hindiquestion_yes);
            yes2.setText(R.string.hindiquestion_yes);
            y3.setText(R.string.hindiquestion_yes);
            y4.setText(R.string.hindiquestion_yes);
            y5.setText(R.string.hindiquestion_yes);
            y6.setText(R.string.hindiquestion_yes);
            y7.setText(R.string.hindiquestion_yes);
            y8.setText(R.string.hindiquestion_yes);
            y9.setText(R.string.hindiquestion_yes);
            y10.setText(R.string.hindiquestion_yes);
            y11.setText(R.string.hindiquestion_yes);
            y12.setText(R.string.hindiquestion_yes);

            no1.setText(R.string.hindiquestion_no);
            no2.setText(R.string.hindiquestion_no);
            n3.setText(R.string.hindiquestion_no);
            n4.setText(R.string.hindiquestion_no);
            n5.setText(R.string.hindiquestion_no);
            n6.setText(R.string.hindiquestion_no);
            n7.setText(R.string.hindiquestion_no);
            n8.setText(R.string.hindiquestion_no);
            n9.setText(R.string.hindiquestion_no);
            n10.setText(R.string.hindiquestion_no);
            n11.setText(R.string.hindiquestion_no);
            n12.setText(R.string.hindiquestion_no);

            low.setText(R.string.hindiquestion_low);
           medium.setText(R.string.hindiquestion_medium);
           high.setText(R.string.hindiquestion_high);

           dry.setText(R.string.hindiquestion_dry);
           cold.setText(R.string.hindiquestion_cold);

           o_tdays.setText(R.string.hindiquestion_one_2days);
           t_fdays.setText(R.string.hindiquestion_three_4days);
           f_sdays.setText(R.string.hindiquestion_five_6days);

            tv1.setText(R.string.hindiquestionfull_1);
            tv2.setText(R.string.hindiquestionfull_2);
            tv3.setText(R.string.hindiquestionfull_3);
            tv4.setText(R.string.hindiquestionfull_4);
            tv5.setText(R.string.hindiquestionfull_5);
            tv6.setText(R.string.hindiquestionfull_6);
            tv7.setText(R.string.hindiquestionfull_7);
            tv8.setText(R.string.hindiquestionfull_8);
            tv9.setText(R.string.hindiquestionfull_9);
            tv10.setText(R.string.hindiquestionfull_10);
            tv11.setText(R.string.hindiquestionfull_11);
            tv12.setText(R.string.hindiquestionfull_12);

            tv1_1.setText(R.string.hindiquestionfull_1_2);
            tv2_2.setText(R.string.hindiquestionfull_2_2);
            tv10_2.setText(R.string.hindiquestionfull_10_2);
            tv11_2.setText(R.string.hindiquestionfull_11_2);
            tv12_2.setText(R.string.hindiquestionfull_12_2);

            btnnext.setText(R.string.hindibuttonnext);
        }

    }



}
