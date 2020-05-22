package com.example.android.match;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.os.Bundle;
import android.util.TypedValue;
import android.widget.EditText;
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
//            LinearLayout mdl = new LinearLayout(this);
//
//            int cl= ContextCompat.getColor(this,R.color.gray);
//            if(i%2==1)
//                mdl.setBackgroundColor(cl);
//
//            TextView mdt = new TextView(this);
//            mdt.setText(MainActivity.armw.get(i).getMplayerName());
//            mdt.setTextSize(TypedValue.COMPLEX_UNIT_SP,32);
//            mdt.setTextAppearance(this,R.style.TextAppearance_AppCompat_Medium);
//
//
//
//            TextView mde1 = new TextView(this);
//            mde1.setText(MainActivity.armw.get(i).getMwins());
//            mde1.setTextSize(TypedValue.COMPLEX_UNIT_SP,32);
//            mde1.setTextAppearance(this,R.style.TextAppearance_AppCompat_Medium);
//
//
//            TextView mde2 = new TextView(this);
//            mde2.setText(MainActivity.armw.get(i).getMwiks());
//            mde2.setTextSize(TypedValue.COMPLEX_UNIT_SP,32);
//            mde2.setTextAppearance(this,R.style.TextAppearance_AppCompat_Medium);
//
//
//            mdl.addView(mdt);
//            mdl.addView(mde1);
//            mdl.addView(mde2);
//            playerstats.addView(mdl);

           TextView tes=new TextView(this);
           tes.setTextSize(TypedValue.COMPLEX_UNIT_SP,32);
            int cl= ContextCompat.getColor(this,R.color.gray);
            if(i%2==1)
                tes.setBackgroundColor(cl);
            tes.setTextAppearance(this,R.style.TextAppearance_AppCompat_Medium);


            tes.setText(MainActivity.armw.get(i).getMplayerName() + "        " + MainActivity.armw.get(i).getMwins() +
                    "        " +MainActivity.armw.get(i).getMwiks());

            playerstats.addView(tes);
        }

    }
}
