package com.example.android.match;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public class AddPlayer extends AppCompatActivity {

    EditText editText1,editText2;
    Button button;
    public LinearLayout linearLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_player);
        editText1=(EditText)findViewById(R.id.ed1);
        editText2=(EditText)findViewById(R.id.ed2);
        button=(Button)findViewById(R.id.bt1);

        linearLayout = (LinearLayout)findViewById(R.id.ll);


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(editText2.getText().toString().equalsIgnoreCase("match"))
                {
                    if(MainActivity.arrayList.contains(editText1.getText().toString()))
                    {
                        Toast.makeText(AddPlayer.this, "Player Already Present", Toast.LENGTH_SHORT).show();
                    }
                    else {

                        Toast.makeText(AddPlayer.this, "Player Added", Toast.LENGTH_SHORT).show();
                        MainActivity.arrayList.add(editText1.getText().toString());
                        MainActivity.armw.add(new Item(editText1.getText().toString()));

                    }

//                    TextView textView=new TextView(AddPlayer.this);
//                    textView.setText(editText1.getText().toString());
//                    linearLayout.addView(textView);                NOT WORKING ASS LINER LAYOUT IS OF DIFFERENT CLASS


                }
                else
                {
                    Toast.makeText(AddPlayer.this,"Wrong Code",Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
