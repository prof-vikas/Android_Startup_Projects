package com.info.android.keylistner;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.method.DateKeyListener;
import android.text.method.DigitsKeyListener;
import android.text.method.MultiTapKeyListener;
import android.text.method.QwertyKeyListener;
import android.text.method.TextKeyListener;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText edt1, edt2, edt3, edt4, edt5, edt6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //allows decimal and sign (-1, -22)
        edt1 = findViewById(R.id.edt_1);
        DigitsKeyListener dkl1 = DigitsKeyListener.getInstance(true,true);
        edt1.setKeyListener(dkl1);

        //allow only decimal points without sign
        edt2 = findViewById(R.id.edt_2);
        DigitsKeyListener dkl2 = DigitsKeyListener.getInstance(false, true);
        edt2.setKeyListener(dkl2);

        //allow only positive integer
        edt3 = findViewById(R.id.edt_3);
        DigitsKeyListener dkl3 = DigitsKeyListener.getInstance();
        edt3.setKeyListener(dkl3);

        //allow only date listner
        edt4 = findViewById(R.id.edt_4);
        DateKeyListener dkl4 = DateKeyListener.getInstance();
        edt4.setKeyListener(dkl4);

        //allow multi tap key listner
        edt5 = findViewById(R.id.edt_5);
        MultiTapKeyListener dkl5 = new MultiTapKeyListener(TextKeyListener.Capitalize.WORDS,true);
        edt5.setKeyListener(dkl5);

        //allow qwerty listner
        edt6 = findViewById(R.id.edt_6);
        QwertyKeyListener dkl6 =new QwertyKeyListener(TextKeyListener.Capitalize.SENTENCES,true);
        edt6.setKeyListener(dkl6);
    }
}