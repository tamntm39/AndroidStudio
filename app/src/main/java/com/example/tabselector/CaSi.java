package com.example.tabselector;

public class CaSi {
    String id;
    String name;
    String avatar;
    String viewbh;

    public CaSi(String id, String name, String avatar, String viewbh) {
        this.id = id;
        this.name = name;
        this.avatar = avatar;
        this.viewbh= String.valueOf(viewbh);
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public String getViewbh() {
        return viewbh;
    }

    public void setViewbh(String viewbh) {
        this.viewbh = viewbh;
    }
}
