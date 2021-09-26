package com.example.appcontest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.*;

public class login extends AppCompatActivity {
    EditText email,password;
    TextView forgotPassword;
    Button signIn,signUp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        email = findViewById(R.id.email);
        password = findViewById(R.id.password);
        forgotPassword = findViewById(R.id.forgotpassword);
        signIn  = findViewById(R.id.login);
        signUp  = findViewById(R.id.signup);

        signUp.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), signup.class);
                if(!email.getText().toString().isEmpty())
                    intent.putExtra("EMAIL",email.getText().toString());
                startActivity(intent);
            }
        });

        signIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!email.getText().toString().isEmpty() && !password.getText().toString().isEmpty()){
                    OneHealthUser user = new OneHealthUser();
                    user.setEmail(email.getText().toString());
                    user.setPassword(password.getText().toString());

                    DBHandler db = new DBHandler(getApplicationContext());
                    if(db.validateUser(user)){
                        Intent is=new Intent(getApplicationContext(), dieas.class);
                        startActivity(is);
                    }
                    else{
                        Toast.makeText(getApplicationContext(),"Check Credentials",Toast.LENGTH_LONG).show();
                    }
                }
                else{
                    Toast.makeText(getApplicationContext(),"CHECK FIELDS",Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}