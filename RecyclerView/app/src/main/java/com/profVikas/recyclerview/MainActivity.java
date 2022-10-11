package com.profVikas.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    ArrayList<ContactModel> arrContactModel = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recycler_view_main_activity);

        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        arrContactModel.add(new ContactModel(R.drawable.a,"vikas","8828592919","emp1"));
        arrContactModel.add(new ContactModel(R.drawable.b,"rohan","8828592919","emp2"));
        arrContactModel.add(new ContactModel(R.drawable.c,"sudhir","8828592919","emp3"));
        arrContactModel.add(new ContactModel(R.drawable.d,"anand","8828592919","emp4"));
        arrContactModel.add(new ContactModel(R.drawable.e,"shivam","8828592919","emp5"));
        arrContactModel.add(new ContactModel(R.drawable.e,"shubham","8828592919","emp6"));
        arrContactModel.add(new ContactModel(R.drawable.f,"ravi","8828592919","emp7"));
        arrContactModel.add(new ContactModel(R.drawable.g,"deepak","8828592919","emp8"));
        arrContactModel.add(new ContactModel(R.drawable.f,"vikas","8828592919","emp9"));
        arrContactModel.add(new ContactModel(R.drawable.a,"rohan","8828592919","emp10"));
        arrContactModel.add(new ContactModel(R.drawable.c,"sudhir","8828592919","emp11"));
        arrContactModel.add(new ContactModel(R.drawable.f,"anand","8828592919","emp12"));
        arrContactModel.add(new ContactModel(R.drawable.a,"shivam","8828592919","emp13"));
        arrContactModel.add(new ContactModel(R.drawable.e,"shubham","8828592919","emp14"));
        arrContactModel.add(new ContactModel(R.drawable.b,"ravi","8828592919","emp15"));
        arrContactModel.add(new ContactModel(R.drawable.g,"deepak","8828592919","emp16"));
        arrContactModel.add(new ContactModel(R.drawable.a,"vikas","8828592919","emp17"));
        arrContactModel.add(new ContactModel(R.drawable.b,"rohan","8828592919","em18"));
        arrContactModel.add(new ContactModel(R.drawable.c,"sudhir","8828592919","emp18"));
        arrContactModel.add(new ContactModel(R.drawable.d,"anand","8828592919","emp20"));
        arrContactModel.add(new ContactModel(R.drawable.e,"shivam","8828592919","emp21"));
        arrContactModel.add(new ContactModel(R.drawable.e,"shubham","8828592919","emp22"));
        arrContactModel.add(new ContactModel(R.drawable.f,"ravi","8828592919","emp23"));
        arrContactModel.add(new ContactModel(R.drawable.g,"deepak","8828592919","emp24"));


        RecyclerContactAdapter recyclerContactAdapter = new RecyclerContactAdapter(this,arrContactModel);
        recyclerView.setAdapter(recyclerContactAdapter);
    }
}