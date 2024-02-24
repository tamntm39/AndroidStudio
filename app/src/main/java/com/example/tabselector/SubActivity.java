package com.example.tabselector;

import static com.example.tabselector.Ultils.LoadData;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class SubActivity extends AppCompatActivity implements CaSiAdapter.UserCallback{
    ImageView img_subitem;
    TextView txt_subtenbh;
    TextView txt_subcasi;

    RecyclerView rvListC;
    ArrayList<CaSi> lstCaSi;
    CaSiAdapter casiAdapter;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub);
        img_subitem = findViewById(R.id.img_subitem);
//        txt_subtenbh=findViewById(R.id.txt_subtenbh);
        txt_subcasi = findViewById(R.id.txt_subcasi);
        //Nhận Item
        Intent myintent = getIntent();
        int img = myintent.getIntExtra("image", 0);
        img_subitem.setImageResource(img);
//        String tenbh=myintent.getStringExtra("name");
//        txt_subtenbh.setText(tenbh);
        String tencasi = myintent.getStringExtra("who");
        txt_subcasi.setText(tencasi);
        rvListC=findViewById(R.id.rvList);
        LoadData();
        casiAdapter=new CaSiAdapter(lstCaSi,this);
        LinearLayoutManager linearLayoutManager=new LinearLayoutManager(this);
        rvListC.setAdapter(casiAdapter);
        rvListC.setLayoutManager(linearLayoutManager);

    }

    @Override
    public void onItemClick(String id){
        Intent i= new Intent(this, DetailActivity.class);
        i.putExtra("userId",id);
        startActivity(i);
    }
    void LoadData()
    {
        lstCaSi=new ArrayList<>();
        lstCaSi.add(new CaSi("1","Vì anh đâu có biết","anhdouco.jpg","1000000"));
        lstCaSi.add(new CaSi("2","Hư không","hukhong.jpg","23343545"));
        lstCaSi.add(new CaSi("3","Sau lời khước từ","sauloikhuoctu.jpg","23343545"));
        lstCaSi.add(new CaSi("4","Đánh đổi","danhdoi.jpg","23343545"));
        lstCaSi.add(new CaSi("5","Bởi vì khi yêu","boivikhiyeu.jpg","23343545"));
        lstCaSi.add(new CaSi("6","Tại vì sao","taivisao.jpg","23343545"));
        lstCaSi.add(new CaSi("7","Những lời hứa chưa quên","loihua.jpg","23343545"));
        lstCaSi.add(new CaSi("8","Đông kiếm em","dongkiemem.jpg","23343545"));
    }
}