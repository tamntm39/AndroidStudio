package com.example.tabselector;

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
    public static void LoadData(ArrayList<CaSi> lstCaSi)
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
