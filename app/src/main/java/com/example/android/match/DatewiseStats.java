package com.example.android.match;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;

public class DatewiseStats extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_datewise_stats);

        LinearLayout lll=(LinearLayout)findViewById(R.id.dstat);
        for(int i=0;i<MainActivity.ditem.size();i++)
        {
            TextView ttt=new TextView(this);
            String s1=MainActivity.ditem.get(i).getDate() + "\n " + MainActivity.ditem.get(i).getWins()
                    + " " + MainActivity.ditem.get(i).getWickets();
            String fs=MainActivity.ditem.get(i).getDate() + "               Wins                Wickets\n  ";
            for(int j=0;j<MainActivity.arrayList.size();j++)
            {
                int c1=0,c2=0;
                for(int k=0;k<MainActivity.ditem.get(i).getWins().size();k++)
                {
                    if(MainActivity.ditem.get(i).getWins().get(k).equals(MainActivity.arrayList.get(j)))
                    {
                        c1++;
                    }
                }
                for(int k=0;k<MainActivity.ditem.get(i).getWickets().size();k++)
                {
                    if(MainActivity.ditem.get(i).getWickets().get(k).equals(MainActivity.arrayList.get(j)))
                    {
                        c2++;
                    }
                }
                fs=fs+MainActivity.arrayList.get(j).toString()+"                    "+c1+"             "+c2+"\n  ";

            }
            ttt.setText(fs);
            lll.addView(ttt);
        }



    }
}
