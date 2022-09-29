package com.info.android.formatingthedateformat;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.format.DateFormat;
import android.widget.TextView;

import java.util.Calendar;
import java.util.Date;

public class MainActivity extends AppCompatActivity {

    TextView txtformat1;
    TextView txtformat2;
    TextView txtformat3;
    TextView txtformat4;
    TextView txtformat5;
    TextView txtformat6;
    TextView txtformat7;
    TextView txtformat8;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtformat1 = findViewById(R.id.txt_format1);
        txtformat2 = findViewById(R.id.txt_format2);
        txtformat3 = findViewById(R.id.txt_format3);
        txtformat4 = findViewById(R.id.txt_format4);
        txtformat5 = findViewById(R.id.txt_format5);
        txtformat6 = findViewById(R.id.txt_format6);
        txtformat7 = findViewById(R.id.txt_format7);
        txtformat8 = findViewById(R.id.txt_format8);

        String dateTimeFormat1 = "MM/dd/yy hh:mm:ss a";
        String dateTimeFormat2 = "MM / dd / yy hh:mm a";
        String dateTimeFormat3 = "dd / MM / yy hh:mm:ss a";
        String dateTimeFormat4 = "dd-MMM-yy hh:mm a";
        String dateTimeFormat5 = "dd-MMMM-yyyy hh:mm a";
        String dateTimeFormat6 = "E dd-MMMM-yyyy hh:mm a";
        String dateTimeFormat7 = "EEEE dd-MMMM-yyyy hh:mm a";
        String dateTimeFormat8 = "dd-MMMM-yyyy hh:mm a";

        Date date = Calendar.getInstance().getTime();

        txtformat1.setText(DateFormat.format(dateTimeFormat1,date));
        txtformat2.setText(DateFormat.format(dateTimeFormat2,date));
        txtformat3.setText(DateFormat.format(dateTimeFormat3,date));
        txtformat4.setText(DateFormat.format(dateTimeFormat4,date));
        txtformat5.setText(DateFormat.format(dateTimeFormat5,date));
        txtformat6.setText(DateFormat.format(dateTimeFormat6,date));
        txtformat7.setText(DateFormat.format(dateTimeFormat7,date));
        txtformat8.setText(DateFormat.format(dateTimeFormat8,date));

    }
}