package com.example.tabselector;

import static com.example.tabselector.R.*;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class NhacActivity extends AppCompatActivity {
    Button btnNhac;
    ImageButton imgbtn1,imgbtn2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(layout.activity_nhac);
        btnNhac = findViewById(R.id.btn2);
        imgbtn1=findViewById(R.id.imgbtn1);
        imgbtn2=findViewById(R.id.imgbtn2);
        imgbtn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Intent intent = new Intent(NhacActivity.class.newInstance(), hieuthuhaiActivity.class);
//                startActivity(intent);
            }
        });


    }
}