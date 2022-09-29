package com.info.android.firstrunpreferences;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Context context;
    SharedPreferences prefs;
    TextView txt_hello;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    context = this;
    prefs = context.getSharedPreferences("appPrefs",0);

    txt_hello = findViewById(R.id.txt_hello);

    if(getFirstRun()){
        setRunned() ;

        //Anything that you want to do in first run

        txt_hello.setText("Welcome to the app for the first time");
    }
    else {
        //Anything that you want to do after first run

        txt_hello.setText("welcome, for visiting again");
    }



    }

    boolean getFirstRun(){
        return prefs.getBoolean("firstRun",true);
    }

    void setRunned(){
        SharedPreferences.Editor edit = prefs.edit();
        edit.putBoolean("firstRun",false);
        edit.commit();

    }
}