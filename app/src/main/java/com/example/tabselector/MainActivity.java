package com.example.tabselector;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.SearchView;
import android.widget.TabHost;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
//    EditText edtA,edtB;
int image[]={R.drawable.vu, R.drawable.hiuthu2, R.drawable.lowg, R.drawable.lulylyly, R.drawable.mck, R.drawable.minne};
    String name[]={"Vì anh đâu có biết","Đông kiếm em","Lạ Lùng","Những lời hứa bỏ quên","Lời yêu em","Đợi"};
    String who[]={"Vũ.", "HIEUTHUHAI", "Low G", "LyLy", "MCK", "Min"};
    Button btn1,btn2,btn3,btn4,btntong;
    TabHost mytab;
    SearchView timkiem;
    TextView tieude,tieude1;
    RelativeLayout list;
    ImageView hd,mck,min,wren,vu,tlink;


    //Khaibao listview
    GridView gv;
    ArrayList<Item> mylist;
    ArrayList<String> mylist1;
    ArrayAdapter<Item> myadapter;
    ArrayAdapter<String> myadapter1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addControl();
        addEvent();
    }

    private void addEvent() {
       timkiem=findViewById(R.id.timkiem);
    }

    private void addControl() {
//        edtA = findViewById(R.id.edtA);
//        edtB=findViewById(R.id.edtB);
        btn1=findViewById(R.id.btn1);
        btn2=findViewById(R.id.btn2);
        btn3=findViewById(R.id.btn3);

        btn4=findViewById(R.id.btn4);
        //xử lí listview
        gv=findViewById(R.id.gv);
        mylist= new ArrayList<>();
        for(int i =0;i<name.length;i++)
        {
            mylist.add(new Item(image[i],name[i],who[i]));
        }
        myadapter = new MyArrayAdapter(MainActivity.this,R.layout.layout_item,mylist);
        gv=findViewById(R.id.gv);
        gv.setAdapter(myadapter);
//        gv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
//            @Override
//            public void onItemClick(AdapterView<?> parent, View view, int i, long l) {
//                //Khai báo Intent
//                Intent myintent=new Intent(MainActivity.this, SubActivity.class);
//                myintent.putExtra("image",image[i]);
//                myintent.putExtra("name",name[i]);
//                myintent.putExtra("who",who[i]);
//                startActivity(myintent);
//            }
        tieude=findViewById(R.id.tieude);
        tieude1=findViewById(R.id.tieude1);
        list=findViewById(R.id.list);
         vu = findViewById(R.id.vu);
         tlink = findViewById(R.id.tlink);
         wren = findViewById(R.id.wren);
         min = findViewById(R.id.min);
         mck = findViewById(R.id.mck);
         hd = findViewById(R.id.hd);

        vu.setImageResource(R.drawable.playlisstvu);
        tlink.setImageResource(R.drawable.tlink);
        wren.setImageResource(R.drawable.wren);
        min.setImageResource(R.drawable.min);
        mck.setImageResource(R.drawable.playmck);
        hd.setImageResource(R.drawable.hoangdung);

        //vử lí tabhosst
        mytab=findViewById(R.id.mytab);
        mytab.setup();
        //khai báo các tab con(tabSpec)
        TabHost.TabSpec spec1, spec2;
        //ứng với mỗi tab con chúng ta cần thực hiện 4 công việc
        //tab1
        spec1 =mytab.newTabSpec("t1"); // tạo mới tab
        spec1.setContent(R.id.tab1); // tham chiếu id của tab1
        spec1.setIndicator("",getResources().getDrawable(R.drawable.baseline_home_24)); // thiết lập icon cho tab
        mytab.addTab(spec1); //thêm tab 1 vài tab chính
        //tab2
        spec2 =mytab.newTabSpec("t2"); // tạo mới tab
        spec2.setContent(R.id.tab2); // tham chiếu id của tab1
        spec2.setIndicator("",getResources().getDrawable(R.drawable.baseline_search_24)); // thiết lập icon cho tab
        mytab.addTab(spec2); //thêm tab 1 vài tab chính
    }


}