package com.example.ps_student.dermadetectmenu;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClickQuickDiagnose(View view){
        Intent launchIntent = getPackageManager().getLaunchIntentForPackage("org.tensorflow.demo");
        if (launchIntent != null) {
            startActivity(launchIntent);//null pointer check in case package name was not found
        }

    }

    public void onClickFindDerm(View view){
        Intent launchIntent = getPackageManager().getLaunchIntentForPackage("com.mapbox.dermlocator");
        if (launchIntent != null) {
            startActivity(launchIntent);//null pointer check in case package name was not found
        }

    }





}
