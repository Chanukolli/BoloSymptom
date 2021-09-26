package com.example.appcontest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class symptoms extends AppCompatActivity {
    TextView s1,s2,s3;
    Button s;
    String symptom, disease, precautions, medicines;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_symptoms);
        s1=findViewById(R.id.symptom1);
        s2=findViewById(R.id.symptom2);
        s3=findViewById(R.id.symptom3);
        s=findViewById(R.id.submit1);
        s.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view) {
                String a = s1.getText().toString();
                String b = s2.getText().toString();
                String c = s3.getText().toString();
                if (a.equals("fever") && b.equals("headache") && c.equals("vomiting")) {
                    symptom = "Fever" + "\n" + "Headache" + "\n" + "Vomiting";
                    disease = "Malaria";
                    precautions = "Avoid mosquito bites by using insect repellent" + "\n" + "Stay somewhere that has effective air conditioning";
                    medicines = "Malarone" + "\n" + "doxycycline";
                    Intent i = new Intent(getApplicationContext(), report.class);
                    i.putExtra("symptoms", symptom);
                    i.putExtra("disease", disease);
                    i.putExtra("precautions", precautions);
                    i.putExtra("medicines", medicines);
                    startActivity(i);
                }
                else if (a.equals("FEVER") & b.equals("HEADACHE") & c.equals("VOMITING")) {
                    symptom = "Fever" + "\n" + "Headache" + "\n" + "Vomiting";
                    disease = "Malaria";
                    precautions = "Avoid mosquito bites by using insect repellent" + "\n" + "Stay somewhere that has effective air conditioning";
                    medicines = "Malarone" + "\n" + "doxycycline";
                    Intent i = new Intent(getApplicationContext(), report.class);
                    i.putExtra("symptoms", symptom);
                    i.putExtra("disease", disease);
                    i.putExtra("precautions", precautions);
                    i.putExtra("medicines", medicines);
                    startActivity(i);
                }
                else if (a.equals("FEVER") & b.equals("HEADACHE") & c.equals("Cough")) {
                    symptom = "Fever" + "\n" + "Headache" + "\n" + "Cough";
                    disease = "Typhoid";
                    precautions = "Drinking only bottled water or water that has been boiled" + "\n" + "Avoiding food that is raw or undercooked.";
                    medicines = "Ciprofloxacin" + "\n" + "Ofloxacin";
                    Intent i = new Intent(getApplicationContext(), report.class);
                    i.putExtra("symptoms", symptom);
                    i.putExtra("disease", disease);
                    i.putExtra("precautions", precautions);
                    i.putExtra("medicines", medicines);
                    startActivity(i);
                }
                else if (a.equals("fever") && b.equals("headache") && c.equals("cough")) {
                    symptom = "Fever" + "\n" + "Headache" + "\n" + "Cough";
                    disease = "Typhoid";
                    precautions = "Drinking only bottled water or water that has been boiled" + "\n" + "Avoiding food that is raw or undercooked.";
                    medicines = "Ciprofloxacin" + "\n" + "Ofloxacin";
                    Intent i = new Intent(getApplicationContext(), report.class);
                    i.putExtra("symptoms", symptom);
                    i.putExtra("disease", disease);
                    i.putExtra("precautions", precautions);
                    i.putExtra("medicines", medicines);
                    startActivity(i);
                }
            }
        });
    }
}