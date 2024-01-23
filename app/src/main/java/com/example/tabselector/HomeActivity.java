package com.example.tabselector;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class HomeActivity extends AppCompatActivity {

   Button btnDangKy, btnLoginApple, btnLoginSdt, btnLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //anh xa
        setContentView(R.layout.activity_home);
        btnDangKy = findViewById(R.id.btnDangKy);
        btnLoginApple = findViewById(R.id.btnLoginApple);
        btnLoginSdt = findViewById(R.id.btnLoginSdt);
        btnLogin = findViewById(R.id.btnLogin);

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomeActivity.this, MainActivity.class);
                startActivity(intent);
            }

        });

        btnDangKy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomeActivity.this, DangKyActivity2.class);
                startActivity(intent);
            }
        });
    }
}
