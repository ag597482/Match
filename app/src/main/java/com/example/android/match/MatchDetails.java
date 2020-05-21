package com.example.android.match;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.text.DateFormat;
import java.util.Calendar;

import static com.example.android.match.MainActivity.armw;
import static java.lang.Integer.parseInt;

public class MatchDetails extends AppCompatActivity {


    LinearLayout mdll;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_match_details);

        mdll=(LinearLayout)findViewById(R.id.md);

        for(int i=0;i<PlayerList.arrayList1.size();i++) {
            LinearLayout mdl = new LinearLayout(this);
            TextView mdt = new TextView(this);
            mdt.setText(PlayerList.arrayList1.get(i));
            EditText mde1 = new EditText(this);
            mde1.setHint("Enter Positon");
            EditText mde2 = new EditText(this);
            mde2.setHint("Enter Wickets");
            mdl.addView(mdt);
            mdl.addView(mde1);
            mdl.addView(mde2);
            mdll.addView(mdl);

        }
        Button bt=new Button(this);
        bt.setText("Add Match");
        mdll.addView(bt);

        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                for(int i=0;i<mdll.getChildCount();i++) {
                    Object object = mdll.getChildAt(i);

                    if (object instanceof LinearLayout) {


//                        for(int k=0;k<((LinearLayout) object).getChildCount();k++)
//                        {
//                            Object o=((LinearLayout) object).getChildAt(k);
//
//                        }

                             Object o1=((LinearLayout) object).getChildAt(0);
                            Object o2=((LinearLayout) object).getChildAt(1);
                            Object o3=((LinearLayout) object).getChildAt(2);






                            String s1=((TextView) o1).getText().toString();
                            String s2=((EditText) o2).getText().toString();
                            String s3=((EditText) o3).getText().toString();
                            //((LinearLayout) object).getChildCount()


                        //  MainActivity.armw.add(new Item(s1,Integer.valueOf(s2),Integer.valueOf(s3)));
                        //Toast.makeText(MatchDetails.this,"Players Data updated entered " + s1+s2+s3,Toast.LENGTH_SHORT).show();


                            for(int j = 0; j< MainActivity.armw.size(); j++)
                            {
                                if(MainActivity.armw.get(j).getMplayerName().equalsIgnoreCase(s1))
                                {
                                    MainActivity.armw.get(j).setMwins(parseInt(s2));
                                    MainActivity.armw.get(j).setMwiks(parseInt(s3));
                                }
                            }
                        //TextView instance
                        //Your Question find it from your hashmap

                    }
                    else
                    {

                    }


                }
                Calendar calendar=Calendar.getInstance();
                String curr= DateFormat.getDateInstance().format(calendar.getTime());
                Toast.makeText(MatchDetails.this,"Players Data updated exit" + curr,Toast.LENGTH_SHORT).show();
                 PlayerList.arrayList1.clear();
            }
        });

    }
}
