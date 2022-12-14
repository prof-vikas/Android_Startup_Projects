package com.surajinfomatic.dialogbox;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView txtMessage, txtProgressDialog, txtToastMessage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtMessage = findViewById(R.id.txt_message);
        txtProgressDialog = findViewById(R.id.txt_progress_dialog);
        txtToastMessage = findViewById(R.id.txt_toast_message);

        txtMessage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                alertBox();
            }
        });

        txtProgressDialog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                progressDialog();
            }
        });

        txtToastMessage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                toastMessage();
            }
        });


    }

    public void alertBox(){
        AlertDialog alertDialog = new AlertDialog.Builder(MainActivity.this).create();
        alertDialog.setTitle("Title here");
        alertDialog.setMessage("Message of dialog box or alert box");
        alertDialog.setButton(AlertDialog.BUTTON_NEUTRAL, "OK", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                alertDialog.dismiss();
            }
        });

        alertDialog.show();
    }

    public void progressDialog(){
        ProgressDialog progressDialog = new ProgressDialog(MainActivity.this);
        progressDialog.setMessage("Progress Dialog message here !!!");
        progressDialog.setCanceledOnTouchOutside(false);
        progressDialog.show();
    }

    public void toastMessage(){
        Toast.makeText(MainActivity.this,"This is toast Message",Toast.LENGTH_LONG).show();
    }

}