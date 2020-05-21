package com.example.android.match;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class PlayerList extends AppCompatActivity {


    public LinearLayout l1;
    public int co=0;
    static ArrayList<String> arrayList1 =new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_player_list);

        l1=(LinearLayout)findViewById(R.id.ll);


        for(int i=0;i<MainActivity.arrayList.size();i++)
        {
            //LinearLayout row=new LinearLayout(PlayerList.this);
            CheckBox checkBox=new CheckBox(PlayerList.this);
            checkBox.setText(MainActivity.arrayList.get(i));
           // TextView textView=new TextView(PlayerList.this);
           // textView.setText(MainActivity.arrayList.get(i));
          //  row.addView(checkBox);
           // row.addView(textView);
            l1.addView(checkBox);
        }
        Button button=new Button(this);
        button.setText("Add Match");
        l1.addView(button);

        Button button1=new Button(this);
        button1.setText("Numbering");
        l1.addView(button1);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                co=0;
                for(int i=0;i<MainActivity.arrayList.size()+1;i++) {
                    Object object = l1.getChildAt(i);

                    if (object instanceof TextView) {
                        //TextView instance
                        //Your Question find it from your hashmap

                    }

                    if (object instanceof CheckBox) {
                        //CheckBox instance
                        boolean b1 = ((CheckBox) object).isChecked();
                        String s1 = ((CheckBox) object).getText().toString();
                        if(b1)
                        {
                            co++;
                            arrayList1.add(s1);
                        }
                        //as per your requirement
                    }
                }

                Intent i1=new Intent(PlayerList.this,MatchDetails.class);
                startActivity(i1);
                Toast.makeText(PlayerList.this,"Count of Checked Item is "+ String.valueOf(co),Toast.LENGTH_SHORT).show();
            }
        });

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                for(int i=0;i<MainActivity.arrayList.size()+1;i++) {
                    Object object = l1.getChildAt(i);

                    if (object instanceof TextView) {
                        //TextView instance
                        //Your Question find it from your hashmap

                    }

                    if (object instanceof CheckBox) {
                        //CheckBox instance
                        boolean b1 = ((CheckBox) object).isChecked();
                        String s1 = ((CheckBox) object).getText().toString();
                        if(b1)
                        {
                            if(!arrayList1.contains(s1))
                            arrayList1.add(s1);
                        }
                        //as per your requirement
                    }
                }
                Intent i1=new Intent(PlayerList.this,NumberingResult.class);
                startActivity(i1);

            }
        });

    }
}
