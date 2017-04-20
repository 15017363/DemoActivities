package com.example.a15017363.demoactivities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class DemoActivities2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_demo_activities2);

        //Get the intent so as to get the "things inside the intent
        Intent i = getIntent();
        //Get the string array named "info" we passed in
        String[] info = i.getStringArrayExtra("info");
        //Get the textview Object
        TextView tv1 = (TextView)findViewById(R.id.textView1);
        //Display the name and age on the Textview
        tv1.setText("You are "+info[0] + ", age "+info[1] );
    }
}
