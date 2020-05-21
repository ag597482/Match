package com.example.android.match;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;

public class Toss extends AppCompatActivity {

    ImageView iv1;
    Button bt1;
    int x;
    int []images={R.drawable.tails,R.drawable.heads};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_toss);

        iv1=(ImageView)findViewById(R.id.coin);
        bt1=(Button)findViewById(R.id.toss);

        final MediaPlayer mediaPlayer=MediaPlayer.create(this,R.raw.coinflip);
        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer.start();
                double y= Math.random();
                x=(int)Math.round(y);

                iv1.setImageResource(R.drawable.ts1);

                new CountDownTimer(1000, 1000) { // 5000 = 5 sec

                    public void onTick(long millisUntilFinished) {
                    }

                    public void onFinish() {
                        iv1.setImageResource(images[x]);
                    }
                }.start();

            }
        });

    }

}
