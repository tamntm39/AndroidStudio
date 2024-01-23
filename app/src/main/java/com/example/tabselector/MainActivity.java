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
    Button btn1,btn2,btn3,btn4;
    TabHost mytab;
    SearchView timkiem;
    TextView tieude,tieude1,tieude2,tieude3;
    RelativeLayout list, list1,list3;
    ImageView hd,mck,min,wren,vu,tlink,hd1,mck1,min1,wren1,vu1,tlink1,mienphi1,mienphi2,mienphi3,mienphi4;


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
         //list1
        tieude1=findViewById(R.id.tieude1);
        list1=findViewById(R.id.list1);
        vu1 = findViewById(R.id.vu1);
        tlink1 = findViewById(R.id.tlink1);
        wren1 = findViewById(R.id.wren1);
        min1 = findViewById(R.id.min1);
        mck1 = findViewById(R.id.mck1);
        hd1 = findViewById(R.id.hd1);

        vu.setImageResource(R.drawable.playlisstvu);
        tlink.setImageResource(R.drawable.tlink);
        wren.setImageResource(R.drawable.wren);
        min.setImageResource(R.drawable.min);
        mck.setImageResource(R.drawable.playmck);
        hd.setImageResource(R.drawable.hoangdung);

        vu1.setImageResource(R.drawable.playlisstvu);
        tlink1.setImageResource(R.drawable.tlink);
        wren1.setImageResource(R.drawable.wren);
        min1.setImageResource(R.drawable.min);
        mck1.setImageResource(R.drawable.playmck);
        hd1.setImageResource(R.drawable.hoangdung);

        tieude2=findViewById(R.id.tieude2);

        tieude3=findViewById(R.id.tieude3);

        //vử lí tabhosst
        mytab=findViewById(R.id.mytab);
        mytab.setup();
        //khai báo các tab con(tabSpec)
        TabHost.TabSpec spec1, spec2, spec3, spec4;
        //ứng với mỗi tab con chúng ta cần thực hiện 4 công việc
        //tab1
        spec1 =mytab.newTabSpec("t1"); // tạo mới tab
        spec1.setContent(R.id.tab1); // tham chiếu id của tab1
        spec1.setIndicator("",getResources().getDrawable(R.drawable.home_svgrepo_com__1_)); // thiết lập icon cho tab
        mytab.addTab(spec1); //thêm tab 1 vài tab chính
        //tab2
        spec2 =mytab.newTabSpec("t2"); // tạo mới tab
        spec2.setContent(R.id.tab2); // tham chiếu id của tab1
        spec2.setIndicator("",getResources().getDrawable(R.drawable.search_alt_2_svgrepo_com)); // thiết lập icon cho tab
        mytab.addTab(spec2); //thêm tab 1 vài tab chính
        //tab3
        spec3 =mytab.newTabSpec("t1"); // tạo mới tab
        spec3.setContent(R.id.tab3); // tham chiếu id của tab1
        spec3.setIndicator("",getResources().getDrawable(R.drawable.library_svgrepo_com__2_)); // thiết lập icon cho tab
        mytab.addTab(spec3); //thêm tab 1 vài tab chính
        //tab4
        spec4 =mytab.newTabSpec("t1"); // tạo mới tab
        spec4.setContent(R.id.tab4); // tham chiếu id của tab1
        spec4.setIndicator("",getResources().getDrawable(R.drawable.spotify_162_svgrepo_com)); // thiết lập icon cho tab
        mytab.addTab(spec4); //thêm tab 1 vài tab chính
    }


}