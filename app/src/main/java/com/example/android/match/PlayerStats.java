package com.example.android.match;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.TextView;

public class PlayerStats extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_player_stats);

        LinearLayout playerstats=(LinearLayout)findViewById(R.id.playerstats);

        for(int i=0;i<MainActivity.armw.size();i++)
        {
            TextView tes=new TextView(this);
            tes.setText(MainActivity.armw.get(i).getMplayerName() + " " + MainActivity.armw.get(i).getMwins() + " " +MainActivity.armw.get(i).getMwiks());
            playerstats.addView(tes);
        }

    }
}
