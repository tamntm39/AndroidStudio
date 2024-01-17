package com.example.tabselector;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

public class MyArrayAdapter extends ArrayAdapter<Item> {
    //Khai báo ba tham số của Adapter
    Activity context;
    int IdLayout;
    ArrayList<Item> mylist;
    //Tạo Constructor để MainActivity gọi đến và truyền 3 tham số


    public MyArrayAdapter( Activity context, int idLayout, ArrayList<Item> mylist) {
        super(context, idLayout,mylist);
        this.context = context;
        IdLayout = idLayout;
        this.mylist = mylist;
    }
    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        //Tao để chứa Layout
        LayoutInflater myflactor = context.getLayoutInflater();
        //đặt IdLayout lên đến để Tạo View
        convertView= myflactor.inflate(IdLayout,null);
        //lấy một phần t trong mảng dữ liệu
        Item myitem=mylist.get(position);  //nó tự tăng ần đến stt cuooisi cùng
        //Khai báo ánh xạ id và hiện thị ảnh của bh
        ImageView img_item =convertView.findViewById(R.id.img_item);
        img_item.setImageResource(myitem.getImage());
        //Khai báo ánh xạ id và hiện thị tên bài hat
//        TextView txt_tenbh=convertView.findViewById(R.id.txt_tenbh);
//        txt_tenbh.setText(myitem.getName());
        //khai báo nh xạ id và tên ca si
        TextView txt_tencasi=convertView.findViewById(R.id.txt_casi);
        txt_tencasi.setText(myitem.getWho());
        return convertView;

    }
}
