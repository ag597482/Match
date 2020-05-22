package com.example.android.match;

import java.util.ArrayList;

public class DateItem {
    String date;
    ArrayList<String> wins=new ArrayList<>();
    ArrayList<String> wickets=new ArrayList<>();
    public DateItem(String d)
    {
        date=d;

    }
    public String getDate() {
        return date;
    }
    public void updatewin(String s)
    {
        wins.add(s);
    }
    public void updatewickets(String s)
    {
        wickets.add(s);
    }

    public ArrayList<String> getWins() {
        return wins;
    }

    public ArrayList<String> getWickets() {
        return wickets;
    }
}
