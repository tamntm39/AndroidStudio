package com.example.tabselector;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class SubActivity extends AppCompatActivity {
    ImageView img_subitem;
//    TextView txt_subtenbh;
    TextView txt_subcasi;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub);
        img_subitem = findViewById(R.id.img_subitem);
//        txt_subtenbh = findViewById(R.id.txt_subtenbh);
        txt_subcasi = findViewById(R.id.txt_subcasi);
        //Nhận Item
        Intent myintent = getIntent();
        int img = myintent.getIntExtra("image", 0);
        img_subitem.setImageResource(img);
//        String tenbh = myintent.getStringExtra("name");
//        txt_subtenbh.setText(tenbh);
        String tencasi = myintent.getStringExtra("who");
        txt_subcasi.setText(tencasi);


    }
    }
