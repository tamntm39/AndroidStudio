package com.example.lab5;

import android.content.Context;
import android.content.res.AssetManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;

public class Ultils {
    public static Bitmap convertToBitmapFromAssets(Context context,String nameImage) {
        AssetManager assetManager = context.getAssets();
        try {
            InputStream inputStream = assetManager.open("images/" + nameImage);
            Bitmap bitmap = BitmapFactory.decodeStream(inputStream);
            return bitmap;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;

    }
    public static void LoadData(ArrayList<User> lstUser)
    {
        lstUser=new ArrayList<>();
        lstUser.add(new User("1","Lạ lùng","lalung.jpg"));
        lstUser.add(new User("2","Chuyện những người yêu xa","cngyeuxa.jpg"));
        lstUser.add(new User("3","Sau lời khước từ","sauloikhuoctu.jpg"));
        lstUser.add(new User("4","Lời yêu ngày ấy","loihua.jpg"));
        lstUser.add(new User("5","Lời yêu em","loiyeuem.jpg"));
        lstUser.add(new User("6","Đông kiếm em","dongkiemem.jpg"));
        lstUser.add(new User("7","Những lời hứa chưa quên","loihua.jpg"));
        lstUser.add(new User("8","Tại vì sao","taivisao.jpg"));

    }
}
