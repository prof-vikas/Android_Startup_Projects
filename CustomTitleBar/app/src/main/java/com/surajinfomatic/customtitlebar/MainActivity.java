package com.surajinfomatic.customtitlebar;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView txtMessage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtMessage=findViewById(R.id.txt_Message);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_three_dot,menu);
        return true;

    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if (item.getItemId()==R.id.item_1){
            txtMessage.setText("Items 1 is been selected");
            txtMessage.setBackgroundColor(Color.parseColor("#dedede"));
            txtMessage.setTextColor(Color.parseColor("#000000"));
        }else if (item.getItemId()==R.id.item_2){
            txtMessage.setText("Items 2 is been selected");
            txtMessage.setBackgroundColor(Color.parseColor("#000000"));
            txtMessage.setTextColor(Color.parseColor("#ffffff"));
        }else if (item.getItemId()==R.id.item_3) {
            txtMessage.setText("Items 3 is been selected");
            txtMessage.setBackgroundColor(Color.parseColor("#ffffff"));
            txtMessage.setTextColor(Color.parseColor("#000000"));
        }
        return super.onOptionsItemSelected(item);
    }
}
