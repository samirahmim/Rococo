package com.example.tired;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private static int SPLASH_TIME_OUT=5000;

    //hooks
    View first,second,third,fourth,fifth,sixth;
    TextView rococotxt,tagline;

    //animation
    Animation topAnim,middleAnim,bottomAnim;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        topAnim= AnimationUtils.loadAnimation(this,R.anim.top_animation);
        middleAnim= AnimationUtils.loadAnimation(this,R.anim.middle_animation);
        bottomAnim= AnimationUtils.loadAnimation(this,R.anim.bottom_animation);

        //hooks
        first=findViewById(R.id.firstLine);
        second=findViewById(R.id.secondLine);
        third=findViewById(R.id.thirdLine);
        fourth=findViewById(R.id.fourthLine);
        fifth=findViewById(R.id.fifthLine);
        sixth=findViewById(R.id.sixthLine);

        first.setAnimation(topAnim);
        second.setAnimation(topAnim);
        third.setAnimation(topAnim);
        fourth.setAnimation(topAnim);
        fifth.setAnimation(topAnim);
        sixth.setAnimation(topAnim);

        rococotxt=findViewById(R.id.rococotxt);
        rococotxt.setAnimation(middleAnim);

        tagline=findViewById(R.id.tagline);
        tagline.setAnimation(bottomAnim);


        //SPLASHSCREEN
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent= new Intent(MainActivity.this,Login.class);
                startActivity(intent);
                finish();
            }
        },SPLASH_TIME_OUT);


    }
}