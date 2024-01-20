package com.example.tired;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;


public class Register extends AppCompatActivity {
    EditText regFullName,regEmail,regPass,regConfirmPass,austid;
    Button registerBtn,gotoLogin;
    FirebaseAuth fAuth;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        regFullName=findViewById(R.id.FullName);
        regEmail=findViewById(R.id.Email);
        regPass=findViewById(R.id.Password);
        regConfirmPass=findViewById(R.id.PasswordConfirm);
        austid=findViewById(R.id.AustId);
        registerBtn=findViewById(R.id.RegisterBtn);
        gotoLogin=findViewById(R.id.Loginbtn);

        fAuth=FirebaseAuth.getInstance();
        gotoLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),Login.class));
                finish();
            }
        });

        registerBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //extracting data here:
                String fullName=regFullName.getText().toString();
                String email=regEmail.getText().toString();
                String pass=regPass.getText().toString();
                String confirmPass=regConfirmPass.getText().toString();
                String id=austid.getText().toString();

                EditText send_button= (EditText) findViewById(R.id.AustId);
                String str = send_button.getText().toString();

                if(fullName.isEmpty()){
                    regFullName.setError("Full Name is Required!");
                    return;
                }
                if(email.isEmpty()){
                    regEmail.setError("Email ID is Required!");
                    return;
                }
                if(pass.isEmpty()){
                    regPass.setError("Password is Required!");
                    return;
                }
                if(!pass.equals(confirmPass)){
                    regConfirmPass.setError("Password do not match!");
                    return;
                }
                if(id.isEmpty()){
                    austid.setError("Aust ID is Required!");
                    return;
                }
                //data is validated now
                //register user with firebase
                Toast.makeText(Register.this, "Data validated ", Toast.LENGTH_SHORT).show();
                fAuth.createUserWithEmailAndPassword(email,pass).addOnSuccessListener(new OnSuccessListener<AuthResult>() {
                    @Override
                    public void onSuccess(AuthResult authResult) {

                        //send user to next page
                        Intent intent= new Intent(Register.this,MainActivity2.class);
                        startActivity(intent);
                        finish();

                    }
                }).addOnFailureListener(new OnFailureListener() {
                    @Override

                    public void onFailure(@NonNull  Exception e) {
                        Toast.makeText(Register.this, e.getMessage(), Toast.LENGTH_SHORT).show();
                    }
                });
            }
        });
    }
}