package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView listView1;
    ArrayList<String> arrData = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView1 = findViewById(R.id.list_view_1);

        arrData.add("Raju");
        arrData.add("naman");
        arrData.add("rajan");
        arrData.add("katri");
        arrData.add("himesh");
        arrData.add("radhika");
        arrData.add("anamika");
        arrData.add("aishwariya");
        arrData.add("vikas");
        arrData.add("anand");
        arrData.add("sudhir");
        arrData.add("rohan");
        arrData.add("mohan");
        arrData.add("shivam");
        arrData.add("rihan");
        arrData.add("sunny");
        arrData.add("munny");
        arrData.add("runny");
        arrData.add("mony");
        arrData.add("sony");

        ArrayAdapter<String> listViewAdapter = new ArrayAdapter<>(getApplicationContext(), android.R.layout.simple_list_item_1,arrData);
        listView1.setAdapter(listViewAdapter);


        listView1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                if (i == 0){
                    Toast.makeText(MainActivity.this, "Welcome Raju", Toast.LENGTH_SHORT).show();
                }else if(i==1){
                    Toast.makeText(MainActivity.this,"Welcome naman",Toast.LENGTH_SHORT).show();
                }else if(i==2){
                    Toast.makeText(MainActivity.this,"Welcome rajan",Toast.LENGTH_SHORT).show();
                }else{
                    Toast.makeText(MainActivity.this, "you click on some where else", Toast.LENGTH_SHORT).show();
                }
            }

        });

    }
}