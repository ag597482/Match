package com.example.android.match;

public class Item {
    String mplayerName;
    int mwins,mwiks;
    public Item(String Name)
    {
        mplayerName=Name;
        mwins=0;
        mwiks=0;

    }
    public Item(String Name,int win,int wik)
    {
        mplayerName=Name;
        mwins=win;
        mwiks=wik;

    }
    public String getMplayerName(){
        return mplayerName;
    }
    public int getMwins(){
        return mwins;
    }
    public int getMwiks(){
        return mwiks;
    }

    public void setMwins(int win)
    {
        mwins=win;
    }
    public void setMwiks(int wik)
    {
        mwiks=wik;
    }

}
