package com.example.android.match;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
            mde1.setHint("Enter Runs");
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
        final Map<String,Integer> daa= new HashMap<String,Integer>();

        Calendar calendar=Calendar.getInstance();
        final String curr= DateFormat.getDateInstance().format(calendar.getTime());
        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int fi=0;
                for(int i=0;i<MainActivity.ditem.size();i++)
                {
                    if(MainActivity.ditem.get(i).getDate().equals(curr))
                    {
                        fi=1;
                        break;
                    }
                }
                if(fi==0)
                {
                    MainActivity.ditem.add(new DateItem(curr));
                }
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
                            if(s2.isEmpty())
                            {
                                s2="0";
                            }
                            if(s3.isEmpty())
                            {
                                s3="0";
                            }

                            //((LinearLayout) object).getChildCount()


                        //  MainActivity.armw.add(new Item(s1,Integer.valueOf(s2),Integer.valueOf(s3)));
                        //Toast.makeText(MatchDetails.this,"Players Data updated entered " + s1+s2+s3,Toast.LENGTH_SHORT).show();
                        for(int jk=0;jk<MainActivity.ditem.size();jk++)
                        {
                            if(MainActivity.ditem.get(jk).getDate().equals(curr))
                            {
                                for(int k=0;k<parseInt(s3);k++)
                                {
                                    MainActivity.ditem.get(jk).updatewickets(s1);
                                }
                            }

                        }


                            daa.put(s1,parseInt(s2));
                            for(int j = 0; j< MainActivity.armw.size(); j++)
                            {
                                if(MainActivity.armw.get(j).getMplayerName().equalsIgnoreCase(s1))
                                {
                                    //MainActivity.armw.get(j).setMwins(parseInt(s2));
                                    MainActivity.armw.get(j).setMwiks(parseInt(s3));
                                }
                            }





                        //TextView instance
                        //Your Question find it from your hashmap

                    }



                }
                int ma=0;
                ArrayList<String> nam=new ArrayList<>(daa.keySet());
                for(int i=0;i<nam.size();i++)
                {
                 if(daa.get(nam.get(i))>ma)
                     ma=daa.get(nam.get(i));
                }
                for(int i=0;i<nam.size();i++)
                {
                    if(daa.get(nam.get(i))==ma) {

                        for(int jk=0;jk<MainActivity.ditem.size();jk++)
                        {
                            if(MainActivity.ditem.get(jk).getDate().equals(curr))
                            {
                                    MainActivity.ditem.get(jk).updatewin(nam.get(i));
                            }

                        }
                      //  MainActivity.map1.get(curr).add(nam.get(i));
                        for(int j = 0; j< MainActivity.armw.size(); j++) {
                            if (MainActivity.armw.get(j).getMplayerName().equalsIgnoreCase(nam.get(i))) {
                                MainActivity.armw.get(j).setMwins(1);
                            }
                        }
                    }
                }

                Toast.makeText(MatchDetails.this,"Players Data updated" ,Toast.LENGTH_SHORT).show();
                 PlayerList.arrayList1.clear();
                nam.clear();
                daa.clear();
                finish();

            }
        });

    }
}
