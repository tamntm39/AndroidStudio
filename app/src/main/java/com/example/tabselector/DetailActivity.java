package com.example.tabselector;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class DetailActivity extends AppCompatActivity {
    TextView tvDetailC;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        tvDetailC=findViewById(R.id.tvDetail);


        String id = getIntent().getStringExtra("userId");
        tvDetailC.setText(id);

    }
}