package com.info.android.stopwatch;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView txtTimer;
    TextView txtTimerElapsed;
    Button btnReset;

    public final long startTime = 10 * 1000;
    public final long interval = 1000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtTimer = findViewById(R.id.txt_timer);
        txtTimerElapsed = findViewById(R.id.txt_time_elapsed);
        btnReset = findViewById(R.id.btn_reset);

        CountDownTimer countDownTimer = new CountDownTimer(startTime,interval) {
            @Override
            public void onTick(long millisUntilFinished) {
                txtTimer.setText("Time: " + millisUntilFinished /1000);
                txtTimerElapsed.setText("Time Elapsed : " + (startTime - millisUntilFinished)/ 1000);
            }

            @Override
            public void onFinish() {
            txtTimer.setText("Timer Finished");
            }
        };
        countDownTimer.start();

        btnReset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                countDownTimer.cancel();
                countDownTimer.start();
            }
        });
    }
}