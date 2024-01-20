package com.example.tired;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Semester21 extends AppCompatActivity implements View.OnClickListener{
    public CardView c1,c2,c3,c4,c5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_semester21);
        Button backbtn=findViewById(R.id.backbtn);
        backbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),MainActivity2.class));
                finish();
            }
        });

        c1=(CardView) findViewById(R.id.cse2103);
        c2=(CardView) findViewById(R.id.cse2106);
        c3=(CardView) findViewById(R.id.eee2147);
        c4=(CardView) findViewById(R.id.hum2109);
        c5=(CardView) findViewById(R.id.math2101);

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
            case R.id.cse2103:
                i=new Intent(this,cse2103.class);

                startActivity(i);
                break;

            case R.id.cse2106:
                i=new Intent(this,cse2106.class);
                startActivity(i);
                break;

            case R.id.eee2147:
                i=new Intent(this,eee2147.class);
                startActivity(i);
                break;

            case R.id.hum2109:
                i=new Intent(this,hum2109.class);
                startActivity(i);
                break;

            case R.id.math2101:
                i=new Intent(this,math2101.class);
                startActivity(i);
                break;


        }

    }
}