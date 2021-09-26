package com.example.appcontest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import android.view.View;
import android.widget.*;

public class signup extends AppCompatActivity {
    EditText name,email,passWord;
    Button btn;
    int i=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);

        name = findViewById(R.id.signupName);
        email = findViewById(R.id.signupEmail);
        passWord = findViewById((R.id.signupPassword));

        btn = findViewById(R.id.signupBtn);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(i==0){
                    if(name.getText().toString().isEmpty()){
                        name.setHint(new String("Enter your Name here"));
                        name.setTextColor(getResources().getColor(R.color.red));
                    }
                    if(email.getText().toString().isEmpty()){
                        email.setHint(new String("Enter your Email here"));
                        email.setTextColor(getResources().getColor(R.color.red));
                    }
                    if(passWord.getText().toString().isEmpty()){
                        passWord.setHint(new String("Enter your PASSWORD here"));
                        passWord.setTextColor(getResources().getColor(R.color.red));
                    }
                    if(!name.getText().toString().isEmpty() && !email.getText().toString().isEmpty() && !passWord.getText().toString().isEmpty()){
                        i=1;
                        btn.setText(new String("Sign-Up"));
                    }

                }
                if(i==1){
                    Toast.makeText(getApplicationContext(),"User added",Toast.LENGTH_LONG).show();
                    DBHandler db = new DBHandler(getApplicationContext());
                    OneHealthUser user = new OneHealthUser();
                    user.setName(name.getText().toString());
                    user.setEmail(email.getText().toString());
                    user.setPassword(passWord.getText().toString());
                    db.addUser(user);
                    Intent intent = new Intent(getApplicationContext(),login.class);
                    i=0;
                    startActivity(intent);
                }
            }
        });


    }
}