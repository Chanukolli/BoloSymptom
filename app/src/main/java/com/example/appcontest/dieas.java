package com.example.appcontest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.TextView;

public class dieas extends AppCompatActivity {
    TextView t1;
    CheckBox c1, c2, c3, c4, c5, c6, c7, c8, c9, c10, c11, c12, c13, c14, c15;
    Button b1;
    String symptoms, disease, precautions, medicines;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dieas);
        t1 = findViewById(R.id.textView);
        c1 = findViewById(R.id.c1);
        c2 = findViewById(R.id.c2);
        c3 = findViewById(R.id.c3);
        c4 = findViewById(R.id.c4);
        c5 = findViewById(R.id.c5);
        c6 = findViewById(R.id.c6);
        c7 = findViewById(R.id.c7);
        c8 = findViewById(R.id.c8);
        c9 = findViewById(R.id.c9);
        c10 = findViewById(R.id.c10);
        c11 = findViewById(R.id.c11);
        c12 = findViewById(R.id.c12);
        c13 = findViewById(R.id.c13);
        c14 = findViewById(R.id.c14);
        c15 = findViewById(R.id.cb15);
        b1 = findViewById(R.id.submit);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (c1.isChecked() && c2.isChecked() && c3.isChecked() && c4.isChecked() && c5.isChecked() && c11.isChecked() && c13.isChecked()) {
                    symptoms = "Fever" + "\n" + "Body Pains" + "\n" + "No Smell" + "\n" + "Tiredness" + "\n" + "Headache" + "\n" + "Vomiting" + "\n" + "Cough";
                    disease = "Covid";
                    precautions = "Isolate yourself in a room" + "\n" + "Monitor temperature daily";
                    medicines = "Paracetamol" + "\n" + "Zinc" + "\n" + "Azithromycin";
                    Intent i = new Intent(getApplicationContext(), report.class);
                    i.putExtra("symptoms", symptoms);
                    i.putExtra("disease", disease);
                    i.putExtra("precautions", precautions);
                    i.putExtra("medicines", medicines);
                    startActivity(i);
                }
                if (c1.isChecked() && c4.isChecked() && c8.isChecked()&&c7.isChecked()&&c9.isChecked()) {
                    symptoms = "Fever" +"\n"+"Tiredness"+ "\n" + "Muscleaches"+ "\n"+"Rash"+"\n" +"Chills";
                    disease = "Chickenpox";
                    precautions="Soak in colloidal oatmeal baths"+"\n"+"After bathing, apply a topical ointment";
                    medicines="Zovirax"+"\n"+"Valtrex"+"\n"+"Valacyclovir";
                    Intent i=new Intent(getApplicationContext(),report.class);
                    i.putExtra("symptoms",symptoms);
                    i.putExtra("disease",disease);
                    i.putExtra("precautions",precautions);
                    i.putExtra("medicines",medicines);
                    startActivity(i);
                }
                 if(c1.isChecked() && c12.isChecked() && c4.isChecked()){
                    symptoms = "Fever" +"\n"+"Weight loss"+ "\n" + "Tiredness";
                    disease = "Aids";
                    precautions="Wear protective eye-masks or face shields"+"\n"+"Wash your hands after removing gloves";
                    medicines="Tenofovir"+"\n"+"Dolutegravir"+"\n"+"Ritonavir";
                    Intent i=new Intent(getApplicationContext(),report.class);
                    i.putExtra("symptoms",symptoms);
                    i.putExtra("disease",disease);
                    i.putExtra("precautions",precautions);
                    i.putExtra("medicines",medicines);
                    startActivity(i);
                }
                 if(c10.isChecked()&&c11.isChecked()&&c6.isChecked()){
                    symptoms = "Stomachache" +"\n"+"Nausea"+ "\n" + "Vomiting";
                    disease = "Appendicitis ";
                    precautions=" Avoid Fried foods"+"\n"+"Take highly fiber diet";
                    medicines="Zosyn"+"\n"+"Rocephin"+"\n"+"Gentamicin";
                    Intent i=new Intent(getApplicationContext(),report.class);
                    i.putExtra("symptoms",symptoms);
                    i.putExtra("disease",disease);
                    i.putExtra("precautions",precautions);
                    i.putExtra("medicines",medicines);
                    startActivity(i);
                }
                if(c13.isChecked()&&c12.isChecked()&&c9.isChecked()&&c14.isChecked()){
                    symptoms = "Weight loss" +"\n"+"Chills"+ "\n" + "Cough"+"\n"+"Chest pain";
                    disease = "Tuberculosis ";
                    precautions="Wash your hands after coughing"+"\n"+"Use a fan or open windows to move around fresh air";
                    medicines="Isoniazid"+"\n"+"Rifampicin"+"\n"+"Pyrazinamide"+"\n"+"Ethambutol";
                    Intent i=new Intent(getApplicationContext(),report.class);
                    i.putExtra("symptoms",symptoms);
                    i.putExtra("disease",disease);
                    i.putExtra("precautions",precautions);
                    i.putExtra("medicines",medicines);
                    startActivity(i);
                }
            }
        });
        c15.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                Intent i=new Intent(getApplicationContext(),symptoms.class);
                i.putExtra("symptoms",symptoms);
                i.putExtra("disease",disease);
                i.putExtra("precautions",precautions);
                i.putExtra("medicines",medicines);
                startActivity(i);
            }
        });
    }
}