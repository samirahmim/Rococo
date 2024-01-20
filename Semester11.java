package com.example.tired;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Semester11 extends AppCompatActivity implements View.OnClickListener{
    public CardView c1,c2,c3,c4,c5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_semester11);
        Button backbtn=findViewById(R.id.backbtn);
        backbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),MainActivity2.class));
                finish();
            }
        });

        c1=(CardView) findViewById(R.id.sem11cse1101);
        c2=(CardView) findViewById(R.id.sem11hum1108);
        c3=(CardView) findViewById(R.id.sem11math1115);
        c4=(CardView) findViewById(R.id.sem11chem1101);
        c5=(CardView) findViewById(R.id.sem11phy1115);

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
            case R.id.sem11cse1101:
                i=new Intent(this,cse1101.class);

                startActivity(i);
                break;

            case R.id.sem11hum1108:
                i=new Intent(this,hum1107.class);
                startActivity(i);
                break;

            case R.id.sem11math1115:
                i=new Intent(this,math1115.class);
                startActivity(i);
                break;

            case R.id.sem11chem1101:
                i=new Intent(this,chem1115.class);
                startActivity(i);
                break;

            case R.id.sem11phy1115:
                i=new Intent(this,phy1115.class);
                startActivity(i);
                break;


        }

    }
}