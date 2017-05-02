package com.example.trangnho.databasep1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import com.example.trangnho.databasep1.database.DBManager;
import com.example.trangnho.databasep1.model.Student;

import java.io.InputStream;

public class MainActivity extends AppCompatActivity {
    private EditText edtName, edtNumber, edtAddress, edtEmail;
    private Button tbnAdd;
    private ListView lvStudent;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final DBManager dbManager = new DBManager(this);
        Inwiget();
        tbnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Student student = taoSinhvien();
                if (student != null) {
                    dbManager.themSinhvien(student);
                }


            }
        });

    }

    public void Inwiget() {
        edtName = (EditText) findViewById(R.id.edtname);
        edtNumber = (EditText) findViewById(R.id.edtsdt);
        edtAddress = (EditText) findViewById(R.id.edtaddress);
        edtEmail = (EditText) findViewById(R.id.edtemail);
        tbnAdd = (Button) findViewById(R.id.btnthem);
        lvStudent = (ListView) findViewById(R.id.lvnv);


    }

    private Student taoSinhvien() {
        String name = edtName.getText().toString();
        String address = edtAddress.getText().toString();
        String number = edtNumber.getText().toString();
        String email = edtEmail.getText().toString();

        Student student = new Student(name, address, number, email);
        return student;
    }
}
