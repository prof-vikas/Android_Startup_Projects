package com.vikas.android.emailsender;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText edtSubject, edtBody;
    Button btnSend;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtBody = findViewById(R.id.edt_body);
        edtSubject = findViewById(R.id.edt_email_subject);
        btnSend = findViewById(R.id.btn_send);



        btnSend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent emailIntent = new Intent(Intent.ACTION_SEND);
                emailIntent.setType("text/html");
                emailIntent.putExtra(Intent.EXTRA_SUBJECT,edtSubject.getText().toString());
                emailIntent.putExtra(Intent.EXTRA_TEXT, edtBody.getText().toString());
                startActivity(emailIntent);
            }
        });
    }
}