package com.example.android.match;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Random;

public class NumberingResult extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbering_result);

        LinearLayout lll = (LinearLayout)findViewById(R.id.nr);

        ArrayList<Integer> arr =new ArrayList<>();

        while(arr.size()<PlayerList.arrayList1.size())
        {
            Random r = new Random();
            int result = r.nextInt(PlayerList.arrayList1.size());
            if(!arr.contains(result))
            {
                arr.add(result);
            }
        }
        for(int i=0;i<PlayerList.arrayList1.size();i++)
        {
            TextView tv=new TextView(this);
            tv.setText(PlayerList.arrayList1.get(arr.get(i)));
            lll.addView(tv);
        }
        PlayerList.arrayList1.clear();
    }

}
