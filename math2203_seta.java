package com.example.tired;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.google.android.material.bottomsheet.BottomSheetDialog;

import java.util.ArrayList;
import java.util.Random;

public class math2203_seta extends AppCompatActivity {
    private TextView questv,quesno;
    private Button op1btn,op2btn,op3btn,op4btn;
    private ArrayList<QuizModelcse2201> quizModelcse2201s;
    Random random;
    int crntscr=0,quesAttmptd=0,currentpos;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_math2203_seta);
        questv=findViewById(R.id.ques);
        quesno=findViewById(R.id.quesAttempted);
        op1btn=findViewById(R.id.op1);
        op2btn=findViewById(R.id.op2);
        op3btn=findViewById(R.id.op3);
        op4btn=findViewById(R.id.op4);
        quizModelcse2201s=new ArrayList<>();
        random=new Random();

        getquizques(quizModelcse2201s);
        currentpos=random.nextInt(quizModelcse2201s.size());
        setdatatoviews(currentpos);
        op1btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(quizModelcse2201s.get(currentpos).getAns().trim().toLowerCase().equals(op1btn.getText().toString().trim().toLowerCase())){
                    crntscr++;
                }
                quesAttmptd++;
                int previousIndex=currentpos;
                currentpos=random.nextInt(quizModelcse2201s.size());
                while (currentpos == previousIndex)
                {
                    currentpos = random.nextInt(quizModelcse2201s.size());
                }
                setdatatoviews(currentpos);
            }

        });

        op2btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(quizModelcse2201s.get(currentpos).getAns().trim().toLowerCase().equals(op2btn.getText().toString().trim().toLowerCase())){
                    crntscr++;
                }
                quesAttmptd++;
                int previousIndex=currentpos;
                currentpos=random.nextInt(quizModelcse2201s.size());
                while (currentpos == previousIndex)
                {
                    currentpos = random.nextInt(quizModelcse2201s.size());
                }
                setdatatoviews(currentpos);
            }

        });

        op3btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(quizModelcse2201s.get(currentpos).getAns().trim().toLowerCase().equals(op3btn.getText().toString().trim().toLowerCase())){
                    crntscr++;
                }
                quesAttmptd++;
                int previousIndex=currentpos;
                currentpos=random.nextInt(quizModelcse2201s.size());
                while (currentpos == previousIndex)
                {
                    currentpos = random.nextInt(quizModelcse2201s.size());
                }
                setdatatoviews(currentpos);
            }

        });

        op4btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(quizModelcse2201s.get(currentpos).getAns().trim().toLowerCase().equals(op4btn.getText().toString().trim().toLowerCase())){
                    crntscr++;
                }
                quesAttmptd++;
                int previousIndex=currentpos;
                currentpos=random.nextInt(quizModelcse2201s.size());
                while (currentpos == previousIndex)
                {
                    currentpos = random.nextInt(quizModelcse2201s.size());
                }
                setdatatoviews(currentpos);
            }

        });


    }
    private void showBottomSheet(){
        BottomSheetDialog bottomSheetDialog=new BottomSheetDialog(math2203_seta.this);
        View bottomsheetview=LayoutInflater.from(getApplicationContext()).inflate(R.layout.scorebottomsheet, (LinearLayout)findViewById(R.id.llscr));
        TextView scrtv=bottomsheetview.findViewById(R.id.idtvscr);
        Button restartquizbtn=bottomsheetview.findViewById(R.id.btnrestart);
        scrtv.setText("Your Score is \n"+crntscr+"/5");
        restartquizbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int previousIndex=currentpos;
                currentpos=random.nextInt(quizModelcse2201s.size());
                while (currentpos == previousIndex)
                {
                    currentpos = random.nextInt(quizModelcse2201s.size());
                }
                setdatatoviews(currentpos);
                quesAttmptd=0;
                crntscr=0;
                bottomSheetDialog.dismiss();
            }
        });
        bottomSheetDialog.setCancelable(false);
        bottomSheetDialog.setContentView(bottomsheetview);
        bottomSheetDialog.show();
    }

    private void setdatatoviews(int currentpos){
        quesno.setText("Questions Attempted"+quesAttmptd+"/5");
        if(quesAttmptd==5){
            showBottomSheet();
        }else{
            questv.setText(quizModelcse2201s.get(currentpos).getQues());
            op1btn.setText(quizModelcse2201s.get(currentpos).getOp1());
            op2btn.setText(quizModelcse2201s.get(currentpos).getOp2());
            op3btn.setText(quizModelcse2201s.get(currentpos).getOp3());
            op4btn.setText(quizModelcse2201s.get(currentpos).getOp4());

        }

    }
    private void getquizques(ArrayList<QuizModelcse2201>quizModelcse2201s) {
        quizModelcse2201s.add(new QuizModelcse2201("A real matrix and a complex matrix are matrices whose entries are respectively real numbers or complex number-","true","false","none","all above","true"));
        quizModelcse2201s.add(new QuizModelcse2201("The size of a matrix is defined by the number of-","number of rows","number of columns","both","none","both"));
        quizModelcse2201s.add(new QuizModelcse2201("a+b=b+a.","equal","not equal","none","both","equal"));
        quizModelcse2201s.add(new QuizModelcse2201("A square matrix is a matrix with the same number - ","rows ","columns","none","all above","all above"));
        quizModelcse2201s.add(new QuizModelcse2201("A = AT, is a-","symmetric matrix","diagonal matrix","none","all above","symmetric matrix"));

    }
}