package com.example.calculimc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity2 extends AppCompatActivity {


    private Button btnCalculer1;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        btnCalculer1= findViewById(R.id.btnCalculer1);

        btnCalculer1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent monIntent = new Intent(getApplicationContext(),MainActivity3.class);
                startActivity(monIntent);
                finish();
            }
        });
    }
}