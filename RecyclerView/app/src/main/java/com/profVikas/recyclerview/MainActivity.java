package com.profVikas.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerContactAdapter recyclerContactAdapter;
    RecyclerView recyclerView;
    ArrayList<ContactModel> arrContactModel = new ArrayList<>();
    FloatingActionButton btnOpenDialogBox;
    EditText edtName, edtContact, edtId;
    Button btnActionAdd;
    boolean isAllFieldsChecked = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recycler_view_main_activity);
        btnOpenDialogBox = findViewById(R.id.btn_opening_dialog_box);


        btnOpenDialogBox.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Dialog dialog = new Dialog(MainActivity.this);
                dialog.setContentView(R.layout.add_update_layout_contact);

                 edtName = dialog.findViewById(R.id.edt_name);
                 edtContact = dialog.findViewById(R.id.edt_contact);
                 edtId = dialog.findViewById(R.id.edt_id);
                 btnActionAdd = dialog.findViewById(R.id.btn_add);
                Button btnActionReset = dialog.findViewById(R.id.btn_reset);

                //Reset buton

                btnActionReset.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        edtName.setText("");
                        edtContact.setText("");
                        edtId.setText("");
                    }
                });


                btnActionAdd.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        String name = "", contact = "", id = "";

                        isAllFieldsChecked = CheckAllFields();

                        if (isAllFieldsChecked) {

                            if (!edtName.getText().toString().equals("")) {
                                name = edtName.getText().toString();
                            } else {
                                Toast.makeText(MainActivity.this, "Name field is empty", Toast.LENGTH_SHORT).show();
                            }

                            if (!edtContact.getText().toString().equals("")) {
                                contact = edtContact.getText().toString();
                            } else {
                                Toast.makeText(MainActivity.this, "Contact field is empty", Toast.LENGTH_SHORT).show();
                            }

                            if (!edtId.getText().toString().equals("")) {
                                id = edtId.getText().toString();
                            } else {
                                Toast.makeText(MainActivity.this, "Id field is empty", Toast.LENGTH_SHORT).show();
                            }

                            arrContactModel.add(new ContactModel(name, contact, id));
                            recyclerContactAdapter.notifyItemInserted(arrContactModel.size() - 1);
                            recyclerView.scrollToPosition(arrContactModel.size() - 1);
                            dialog.dismiss();
                        }
                    }
                });

                dialog.show();

            }
        });



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


        recyclerContactAdapter = new RecyclerContactAdapter(this,arrContactModel);
        recyclerView.setAdapter(recyclerContactAdapter);

    }

    private boolean CheckAllFields() {
        if (edtName.length() == 0) {
            edtName.setError("This field is required");
            return false;
        }

        if (edtContact.length() < 10) {
            edtContact.setError("This field is required");
            return false;
        }

        if (edtId.length() == 0) {
            edtId.setError("Id is required");
            return false;
        }
        // after all validation return true.
        return true;
    }
}