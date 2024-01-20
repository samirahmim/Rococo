package com.example.tired;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Semester12 extends AppCompatActivity implements View.OnClickListener{
    public CardView c1,c2,c3,c4,c5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_semester12);
        Button backbtn=findViewById(R.id.backbtn);
        backbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),MainActivity2.class));
                finish();
            }
        });

        c1=(CardView) findViewById(R.id.me1214);
        c2=(CardView) findViewById(R.id.cse1203);
        c3=(CardView) findViewById(R.id.math1219);
        c4=(CardView) findViewById(R.id.eee1241);
        c5=(CardView) findViewById(R.id.cse1205);

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
            case R.id.me1214:
                i=new Intent(this,me1214.class);

                startActivity(i);
                break;

            case R.id.cse1203:
                i=new Intent(this,cse1203.class);
                startActivity(i);
                break;

            case R.id.math1219:
                i=new Intent(this,math1219.class);
                startActivity(i);
                break;

            case R.id.eee1241:
                i=new Intent(this,eee1241.class);
                startActivity(i);
                break;

            case R.id.cse1205:
                i=new Intent(this,cse1205.class);
                startActivity(i);
                break;


        }

    }
}