package com.example.tabselector;

public class Item {
    private int image;
    private String name;
    private String who;

    //========================================================
//định nghĩa đối tưởng
    public Item(int image, String name, String who) {
        this.image = image;
        this.name = name;
        this.who = who;
    }

    //===============================================
    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getWho() {
        return who;
    }

    public void setWho(String who) {
        this.who = who;
    }
}


