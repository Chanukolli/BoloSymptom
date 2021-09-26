package com.example.appcontest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class report extends AppCompatActivity {
    TextView t1,t2,t3,t4,t5,t6,t7,t8;
    FloatingActionButton f1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_report);
        t1=findViewById(R.id.entered);
        t2=findViewById(R.id.s1);
        t3=findViewById(R.id.s2);
        t4=findViewById(R.id.problem);
        t5=findViewById(R.id.precautions);
        t6=findViewById(R.id.solutions);
        t7=findViewById(R.id.med);
        t8=findViewById(R.id.medication);
        f1=findViewById(R.id.call);
        Intent i=getIntent();
        String a= i.getStringExtra("symptoms");
        t2.setText(a);
        String b= i.getStringExtra("disease");
        t4.setText(b);
        String c= i.getStringExtra("precautions");
        t6.setText(c);
        String d= i.getStringExtra("medicines");
        t8.setText(d);

        f1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri p=Uri.parse("tel:9493510632");
                Intent i=new Intent(Intent.ACTION_DIAL,p);
                startActivity(i);
            }
        });
    }
}