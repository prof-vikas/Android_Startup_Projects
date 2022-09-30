package com.info.android.mycalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btn0, btnActionBack, btnActionClear, btnOptDivide,
    btnOptAdd, btnOptSub, btnOptMultiply, btnDot, btnActionEqual;

    TextView txt_out;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn0 = findViewById(R.id.btn_0);
        btn1 = findViewById(R.id.btn_1);
        btn2 = findViewById(R.id.btn_2);
        btn3 = findViewById(R.id.btn_3);
        btn4 = findViewById(R.id.btn_4);
        btn5 = findViewById(R.id.btn_5);
        btn6 = findViewById(R.id.btn_6);
        btn7 = findViewById(R.id.btn_7);
        btn8 = findViewById(R.id.btn_8);
        btn9 = findViewById(R.id.btn_9);
        btnDot = findViewById(R.id.btn_dot);
        btnActionEqual = findViewById(R.id.btn_equal);
        btnActionBack = findViewById(R.id.btn_back);
        btnActionClear = findViewById(R.id.btn_clear);
        btnOptDivide = findViewById(R.id.btn_divide);
        btnOptMultiply = findViewById(R.id.btn_multiply);
        btnOptAdd = findViewById(R.id.btn_add);
        btnOptSub = findViewById(R.id.btn_sub);

        txt_out = findViewById(R.id.txt_out);

        //adding click
        btn0.setOnClickListener(v -> txt_out.setText(txt_out.getText().toString() + "0"));

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txt_out.setText(txt_out.getText().toString() + "1");
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txt_out.setText(txt_out.getText().toString() + "2");
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txt_out.setText(txt_out.getText().toString() + "3");
            }
        });

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txt_out.setText(txt_out.getText().toString() + "4");
            }
        });

        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txt_out.setText(txt_out.getText().toString() + "5");
            }
        });

        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txt_out.setText(txt_out.getText().toString() + "6");
            }
        });

        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txt_out.setText(txt_out.getText().toString() + "7");
            }
        });

        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txt_out.setText(txt_out.getText().toString() + "8");
            }
        });

        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txt_out.setText(txt_out.getText().toString() + "9");
            }
        });

        btnDot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txt_out.setText(txt_out.getText().toString() + ".");
            }
        });

        btnOptAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txt_out.setText(txt_out.getText().toString() + "+");
            }
        });

        btnOptSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txt_out.setText(txt_out.getText().toString() + "-");
            }
        });

        btnOptDivide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txt_out.setText(txt_out.getText().toString() + "/");
            }
        });

        btnOptMultiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txt_out.setText(txt_out.getText().toString() + "x");
            }
        });

        btnActionClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txt_out.setText("");
            }
        });

        btnActionBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String str = txt_out.getText().toString();
                if (str.length() > 1) {
                    str = str.substring(0, str.length() - 1);
                    txt_out.setText(str);
                }
                    else if(str.length() <=1){
                        txt_out.setText("");
                    }
            }
        });

        btnActionEqual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String number = txt_out.getText().toString();
                if(number.contains("/")){
                    String[] splitNumber = number.split("/");
                    double firstNumber = Double.valueOf(splitNumber[0]);
                    double secondNumber = Double.valueOf(splitNumber[1]);
                    txt_out.setText(String.valueOf(divide(firstNumber,secondNumber)));

                }else if (number.contains("x")){
                    String[] splitNumber = number.split("x");
                    double firstNumber = Double.valueOf(splitNumber[0]);
                    double secondNumber = Double.valueOf(splitNumber[1]);
                    txt_out.setText(String.valueOf(multiply(firstNumber,secondNumber)));

                }else if (number.contains("-")){
                    String[] splitNumber = number.split("-");
                    double firstNumber = Double.valueOf(splitNumber[0]);
                    double secondNumber = Double.valueOf(splitNumber[1]);
                    txt_out.setText(String.valueOf(sub(firstNumber,secondNumber)));

                }else if(number.contains("+")){
                    String[] splitNumber = number.split("\\+");
                    double firstNumber = Double.valueOf(splitNumber[0]);
                    double secondNumber = Double.valueOf(splitNumber[1]);
                    txt_out.setText(String.valueOf(add(firstNumber,secondNumber)));
                }

            }
        });


    }

    double add(double a, double b){
        return a+b;
    }

    double sub(double a, double b){
        return a-b;
    }

    double divide(double a, double b){
        return a/b;
    }

    double multiply(double a, double b){
        return a*b;
    }
}