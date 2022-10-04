package com.info.android.batterylevelidentifyer;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    TextView txtFirstText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtFirstText = findViewById(R.id.txt_firstText);

        this.registerReceiver(myBatteryReceiver, new IntentFilter(Intent.ACTION_BATTERY_CHANGED));
    }

    BroadcastReceiver myBatteryReceiver = new BroadcastReceiver() {
        @Override
        public void onReceive(Context context, Intent intent) {
            int batteryLevel = intent.getIntExtra("level", 0);
            System.out.println("Battery Level : " + batteryLevel);

            if (batteryLevel == 100) {
                txtFirstText.setText("Battery is full unplug the charger " + batteryLevel + "%");
            }
            else {
                txtFirstText.setText("Phone is : " + batteryLevel + " % Charge");
            }
        }


    };
}