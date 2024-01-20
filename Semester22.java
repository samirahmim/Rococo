package com.example.tired;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Semester22 extends AppCompatActivity implements View.OnClickListener{
    public CardView c1,c2,c3,c4,c5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_semester22);
        Button backbtn=findViewById(R.id.backbtn);
        backbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),MainActivity2.class));
                finish();
            }
        });

        c1=(CardView) findViewById(R.id.sem22cse2201);
        c2=(CardView) findViewById(R.id.sem22cse2209);
        c3=(CardView) findViewById(R.id.sem22math2203);
        c4=(CardView) findViewById(R.id.sem22cse2213);
        c5=(CardView) findViewById(R.id.sem22cse2207);

        c1.setOnClickListener(this);
        c2.setOnClickListener(this);
        c3.setOnClickListener(this);
        c4.setOnClickListener(this);
        c5.setOnClickListener(this);




    }

    @Override
    public void onClick(View v) {
        Intent i;
        switch (v.getId()){
            case R.id.sem22cse2201:
                i=new Intent(this,Semester22_cse2201.class);

                startActivity(i);
                break;

            case R.id.sem22cse2209:
                i=new Intent(this,Semester22_cse2209.class);
                startActivity(i);
                break;

            case R.id.sem22math2203:
                i=new Intent(this,Semester22_math2203.class);
                startActivity(i);
                break;

            case R.id.sem22cse2213:
                i=new Intent(this,Semester22_cse2213.class);
                startActivity(i);
                break;

            case R.id.sem22cse2207:
                i=new Intent(this,Semester22_cse2207.class);
                startActivity(i);
                break;


        }

    }
}