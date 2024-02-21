package com.example.calculimc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity3 extends AppCompatActivity {


    private EditText XPoids;
    private EditText XTaille;
    private Button btnCalculer;

    private String MyImc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        XPoids= findViewById(R.id.XPoids);
        XTaille= findViewById(R.id.XTaille);
        btnCalculer= findViewById(R.id.btnCalculer1);

        btnCalculer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String strPoids = XPoids.getText().toString().trim();
                String strTaille = XTaille.getText().toString().trim();

                if (strPoids.equals("") && strTaille.equals("")) {
                    Toast.makeText(MainActivity3.this, "Merci de Saisir une Valeur", Toast.LENGTH_SHORT).show();
                    return;
                }
                    float poids = Float.parseFloat(strPoids);
                    float taille = Float.parseFloat(strTaille);


               if(poids < 40 || poids >200) {
                   Toast.makeText(MainActivity3.this, "veuillez mettre une valeur entre 40 et 200kg", Toast.LENGTH_SHORT).show();
               }else if(taille < 100 || taille> 250){
                   Toast.makeText(MainActivity3.this, "veuillez mettre une valeur entre 100 et 250cm", Toast.LENGTH_SHORT).show();
               }else {
                   MyImc = String.valueOf(Math.round(poids * 10 / Math.pow(taille / 100,2) / 10));
               }

               Intent monIntent = new Intent(getApplicationContext(),MainActivity4.class);
               monIntent.putExtra("calculimc.MyImc", MyImc);
                    startActivity(monIntent);
                    finish();


            }
        });
    }
}