package com.surajinfomatic.dynamicfragment;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    TextView fragJapan, fragChina, fragKorea;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        fragJapan = findViewById(R.id.frag_japan);
        fragChina = findViewById(R.id.frag_china);
        fragKorea = findViewById(R.id.frag_korea);

        loadFrag(new JapanFragment(), 0);

        fragJapan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                loadFrag(new JapanFragment(),1);
//                fragJapan.setTextColor(Color.parseColor("#dedede"));
            }

        });

        fragChina.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                loadFrag(new ChinaFragment(),1);
            }
        });

        fragKorea.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                loadFrag(new KoreaFragment(),1);
            }
        });
    }

    public void loadFrag(Fragment fragment, int flag){
        FragmentManager fm = getSupportFragmentManager();
        FragmentTransaction ft = fm.beginTransaction();

        if (flag == 0) {
            ft.add(R.id.container, fragment);
        }else{
            ft.replace(R.id.container, fragment);
        }
        ft.commit();
    }
}