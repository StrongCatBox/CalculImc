package com.example.calculimc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity4 extends AppCompatActivity {

    private TextView Resultat;
    private TextView commentaire;
    private TextView clcResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);

        commentaire= findViewById(R.id.commentaire);
        clcResult= findViewById(R.id.clcResult);


        String MyImc = getIntent().getStringExtra("Imc");
        clcResult.setText("Votre IMC est : " + MyImc);


        String commentaireText;
        if (MyImc < 18.5) {
            commentaireText = "Vous êtes en insuffisance pondérale.";
        } else if (MyImc < 25) {
            commentaireText = "Votre poids est normal.";
        } else if (MyImc < 30) {
            commentaireText = "Vous êtes en surpoids.";
        } else {
            commentaireText = "Vous êtes en obésité.";
        }

        commentaire.setText(commentaireText);


    }
}