package com.info.android.flashlight;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.Color;
import android.graphics.PorterDuffColorFilter;
import android.hardware.camera2.CameraManager;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btnFlash ;
    Boolean isFlashOn = false;
    CameraManager cameraManager;
    String cameraId;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Boolean isFlashAvailable = getApplicationContext().getPackageManager().hasSystemFeature(PackageManager.FEATURE_CAMERA_FLASH);

                btnFlash = findViewById(R.id.btn_flash);

                if(!isFlashAvailable){
                    btnFlash.setEnabled(false);
                    btnFlash.setText("Flash Light is not available");
                }

        try {

            cameraManager = (CameraManager) getSystemService(Context.CAMERA_SERVICE);
            cameraId = cameraManager.getCameraIdList()[0];

        } catch (Exception e){}





        btnFlash.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (isFlashOn){
                    // Turn off the flash here
                    isFlashOn = false;
                    btnFlash.setText("Turn on Flash Light");
                    btnFlash.setBackgroundColor(Color.parseColor("#009688"));
                }
                else{
                    // Turn on the flash here
                    isFlashOn = true;
                    btnFlash.setText("Turn off Flash Light");
                    btnFlash.setBackgroundColor(Color.parseColor("#E91E63"));
                }

                switchFlash(isFlashOn);

            }
        });
    }
    public void switchFlash(boolean status){

        try{
            cameraManager.setTorchMode(cameraId,status);
        }catch (Exception e){}
    }
}