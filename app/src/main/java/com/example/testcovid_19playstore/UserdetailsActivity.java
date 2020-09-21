package com.example.testcovid_19playstore;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class UserdetailsActivity extends AppCompatActivity {

    EditText uname,uage,umobile,uemail,uaddress;
    RadioButton english,hindi,gujarati;
    public int language = 0;
    Button btn;

   public String name,age,mobile,mail,address;

    AutoCompleteTextView atgen,atcountry,atjob;
    String[] job_list ={"Actor","Actuary","Architect","Artist","Athlete","Aviator","Bricklayer","Broker","Chef","Claims adjuster","Consultant","Curator","Dental hygienist","Drafter","Electrician","Engineer","Engineering technician","General practitioner","Government Officer","Hairdresser","Job less","Lawyer","Librarian","Machinist","Mechanic","Medical laboratory scientist","Nurse practitioner","Operator","Paramedic","Pharmacy technician","Physician","Physiotherapist","Plasterer","Plumber","Prosthetist","Quantity surveyor","Radiographer","Retired Person","Scientist","Secretary","Software Developer","Sonographer","Special Education Teacher","Statistician","Student","Surgeon","Surveyor","Teacher","Technician","Technologist","Tool and die maker","Tradesman","Veterinarian","Welder"};
    String[] gen_list ={"Male","Female","Others"};
    String[] country_list ={ "Afghanistan","Albania","Algeria","Andorra","Angola","Antigua & Deps","Argentina","Armenia","Australia","Austria","Azerbaijan","Bahamas","Bahrain","Bangladesh","Barbados","Belarus","Belgium","Belize","Benin","Bhutan","Bolivia","Bosnia Herzegovina","Botswana","Brazil","Brunei","Bulgaria","Burkina","Burundi","Cambodia","Cameroon","Canada","Cape Verde","Central African Rep","Chad","Chile","China","Colombia","Comoros","Congo","Congo {Democratic Rep}","Costa Rica","Croatia","Cuba","Cyprus","Czech Republic","Denmark","Djibouti","Dominica","Dominican Republic","East Timor","Ecuador","Egypt","El Salvador","Equatorial Guinea","Eritrea","Estonia","Ethiopia","Fiji","Finland","France","Gabon","Gambia","Georgia","Germany","Ghana","Greece","Grenada","Guatemala","Guinea","Guinea-Bissau","Guyana","Haiti","Honduras","Hungary","Iceland","India","Indonesia","Iran","Iraq","Ireland {Republic}","Israel","Italy","Ivory Coast","Jamaica","Japan","Jordan","Kazakhstan","Kenya","Kiribati","Korea North","Korea South","Kosovo","Kuwait","Kyrgyzstan","Laos","Latvia","Lebanon","Lesotho","Liberia","Libya","Liechtenstein","Lithuania","Luxembourg","Macedonia","Madagascar","Malawi","Malaysia","Maldives","Mali","Malta","Marshall Islands","Mauritania","Mauritius","Mexico","Micronesia","Moldova","Monaco","Mongolia","Montenegro","Morocco","Mozambique","Myanmar, {Burma}","Namibia","Nauru","Nepal","Netherlands","New Zealand","Nicaragua","Niger","Nigeria","Norway","Oman","Pakistan","Palau","Panama","Papua New Guinea","Paraguay","Peru","Philippines","Poland","Portugal","Qatar","Romania","Russian Federation","Rwanda","St Kitts & Nevis","St Lucia","Saint Vincent & the Grenadines","Samoa","San Marino","Sao Tome & Principe","Saudi Arabia","Senegal","Serbia","Seychelles","Sierra Leone","Singapore","Slovakia","Slovenia","Solomon Islands","Somalia","South Africa","South Sudan","Spain","Sri Lanka","Sudan","Suriname","Swaziland","Sweden","Switzerland","Syria","Taiwan","Tajikistan","Tanzania","Thailand","Togo","Tonga","Trinidad & Tobago","Tunisia","Turkey","Turkmenistan","Tuvalu","Uganda","Ukraine","United Arab Emirates","United Kingdom","United States","Uruguay","Uzbekistan","Vanuatu","Vatican City","Venezuela","Vietnam","Yemen","Zambia","Zimbabwe"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_userdetails);


        /* EditText  */
        uname=(EditText)findViewById(R.id.name_user);
        uage=(EditText)findViewById(R.id.age);
        umobile=(EditText)findViewById(R.id.mobilenumber);
        uemail=(EditText)findViewById(R.id.email);
        uaddress=(EditText)findViewById(R.id.home_address);

        /* RadioButton  */
        english=(RadioButton)findViewById(R.id.radioButtonenglish);
        hindi=(RadioButton)findViewById(R.id.radioButtonhindi);
        gujarati=(RadioButton)findViewById(R.id.radioButtongujarati);

        /* Button  */
        btn=(Button)findViewById(R.id.buttonsubmit);

        /* AutoCompleteTextView ka sab kuch */
        atgen=(AutoCompleteTextView)findViewById(R.id.gender);
        atcountry=(AutoCompleteTextView)findViewById(R.id.country);
        atjob=(AutoCompleteTextView)findViewById(R.id.occupation);

        ArrayAdapter adpc=new ArrayAdapter<String>(this,android.R.layout.simple_dropdown_item_1line,country_list);
        atcountry.setAdapter(adpc);

        ArrayAdapter adpg=new ArrayAdapter<String>(this,android.R.layout.simple_dropdown_item_1line,gen_list);
        atgen.setAdapter(adpg);

        ArrayAdapter adpj=new ArrayAdapter<String>(this,android.R.layout.simple_dropdown_item_1line,job_list);
        atjob.setAdapter(adpj);

        /* Button onClick to Check the Input Value  */

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                checkempty();

            }
        });


    }

    public void checkempty()

    {
        name = uname.getText().toString();
        age = uage.getText().toString();
        mobile = umobile.getText().toString();


        address = uaddress.getText().toString();


        if(name.isEmpty() || age.isEmpty() || mobile.isEmpty() ||  address.isEmpty()  )
        {
            Toast.makeText(UserdetailsActivity.this,"Please Enter all the Details",Toast.LENGTH_LONG).show();


        }
        else
        {
            checkage();

        }
    }



    public void checkage()
    {

        int agewala = Integer.parseInt(uage.getText().toString());
        if(agewala <= 110)
        {
                checkmobileno();
        }
        else
        {
            Toast.makeText(UserdetailsActivity.this,"PLease write appropriate Age",Toast.LENGTH_LONG).show();


        }
    }

    public void checkmobileno()
    {
        mobile = umobile.getText().toString();

        if(mobile.length() == 10)
        {
            checklanguage();
        }
        else
        {
            Toast.makeText(UserdetailsActivity.this,"PLease write Full Mobile Number",Toast.LENGTH_LONG).show();
        }


    }

    public void checklanguage()
    {

        if(english.isChecked())
        {
            Toast.makeText(UserdetailsActivity.this,"You Select English Language for Test",Toast.LENGTH_LONG).show();
            language=3;
            begintest();


        }
        else if (hindi.isChecked())
        {
            Toast.makeText(UserdetailsActivity.this,"You Select Hindi Language for Test",Toast.LENGTH_LONG).show();
            language=1;
            begintest();


        }
        else if (gujarati.isChecked())
        {
            Toast.makeText(UserdetailsActivity.this,"You Select Gujarati Language for Test ",Toast.LENGTH_LONG).show();
            language=2;
            begintest();

        }
        else
        {
            Toast.makeText(UserdetailsActivity.this,"PLease Select Language for Test",Toast.LENGTH_LONG).show();
        }

    }


    public void begintest()
    {
        Intent p= new Intent(UserdetailsActivity.this,Testq1Activity.class);
        p.putExtra("Language",language);
        startActivity(p);
    }
}
