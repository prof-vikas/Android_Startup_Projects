package com.surajinfomatic.androidui;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

   // ImageView btnBack, btnForward, customRating, customShopping;
    TextView txtMessage, lngPress1, lngPress2;
    Spinner dropDown1, cstDropDown2;
    EditText edtTypeName, edtTypePassword;
    AutoCompleteTextView autoComplete1, autoComplete2;
    CheckBox checkBox;
    RadioButton radioMale, radioFemale;
    Button customBtn1, customBtn2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        btnBack = findViewById(R.id.btn_back);
//        btnForward = findViewById(R.id.btn_forward);
//        customRating = findViewById(R.id.custom_rating);
//        customShopping = findViewById(R.id.custom_shopping_cart);
        dropDown1 = findViewById(R.id.dropdown_1);
        cstDropDown2 = findViewById(R.id.cst_dropdown_2);
        txtMessage = findViewById(R.id.txt_message);
        lngPress1 = findViewById(R.id.lng_press1);
        lngPress2 = findViewById(R.id.lng_press2);
        edtTypeName = findViewById(R.id.edt_type_name);
        edtTypePassword = findViewById(R.id.edt_type_password);
        autoComplete1 = findViewById(R.id.auto_complete_1);
        autoComplete2 = findViewById(R.id.auto_complete_2);
        checkBox = (CheckBox) findViewById(R.id.checkbox_terms);
        radioMale = (RadioButton) findViewById(R.id.radio_male);
        radioFemale = (RadioButton) findViewById(R.id.radio_female);
        customBtn1 = (Button) findViewById(R.id.custom_btn_1);
        customBtn2 = (Button) findViewById(R.id.custom_btn_2);


        String[] dropDown = new String[]{"Apple", "Mango", "Pineapple", "Guava"};
        String[] cstDropDown = new String[]{"Pen", "Pencil", "Eraser", "Notebook"};

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item, dropDown);
        dropDown1.setAdapter(adapter);

        ArrayAdapter<String> adapter2 = new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item, cstDropDown);
        cstDropDown2.setAdapter(adapter2);

//        btnBack.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                txtMessage.setText("Back button is clicked");
//            }
//        });
//
//        btnForward.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                txtMessage.setText("Forward button is clicked");
//            }
//        });

//        customShopping.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                txtMessage.setText("button is clicked");
//            }
//        });
//
//        customRating.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                txtMessage.setText("Rating button is clicked");
//            }
//        });

        dropDown1.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                txtMessage.setText("Default drop down is touch");
                return false;
            }
        });

        cstDropDown2.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                txtMessage.setText("Custom drop down is touch");
                return false;
            }
        });

        lngPress1.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                lngPress1.setBackgroundColor(Color.parseColor("#dedede"));
                txtMessage.setText("Press me is clicked");
                return false;
            }
        });

        lngPress2.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                lngPress2.setBackgroundColor(Color.parseColor("#FF577F"));
                txtMessage.setText("Press here is clicked");
                return false;
                }
        });

        String[] data = {"apple", "mango", "chiku", "banana", "pineapple"};
        ArrayAdapter<String> adapter3 = new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item,data);
        autoComplete1.setAdapter(adapter3);

        Integer[] data1 = {1001,1002,1003,1004,1005};
        ArrayAdapter<Integer> adapter4 = new ArrayAdapter<Integer>(this, android.R.layout.simple_spinner_dropdown_item,data1);
        autoComplete2.setAdapter(adapter4);


        // Checkbox checking
        if(checkBox.isChecked()){
            System.out.println("Terms is been accepted by you");
        }
        else{
            System.out.println("Sorry you are not have accepted the terms");
        }

        // Radio button checking

        if(radioMale.isChecked()){
            System.out.println("You are male, hahaha");
        }

        if(radioFemale.isChecked()){
            System.out.println("You are Female, honey !");
        }

        customBtn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtMessage.setText("Image btn is clicked");
             //   txtMessage.getBackground().equals(getResources().getDrawable(R.drawable.custom_btn_bg));
            }
        });

        customBtn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtMessage.setText("Custom btn is clicked");
          //      txtMessage.setBackgroundColor(Color.parseColor("#FF577F"));
            }
        });



    }
}