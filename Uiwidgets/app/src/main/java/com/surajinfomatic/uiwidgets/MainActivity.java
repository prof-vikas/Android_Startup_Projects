package com.surajinfomatic.uiwidgets;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView txtMessage;
    ImageView btnBack, btnForward, customRating, customShopping;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtMessage = findViewById(R.id.txt_output_message);
        btnBack = findViewById(R.id.btn_back);
        btnForward = findViewById(R.id.btn_forward);
        customRating = findViewById(R.id.custom_rating);
        customShopping = findViewById(R.id.custom_shopping_cart);

//        Row 1 - Image button
        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtMessage.setText("Back button is clicked");
            }
        });

        btnForward.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtMessage.setText("Forward button is clicked");
            }
        });


//        Row 2 - Custom icon button
        customShopping.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtMessage.setText("Cart is clicked");
            }
        });

        customRating.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtMessage.setText("Rating button is clicked");
            }
        });
    }
}