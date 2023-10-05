package com.example.calculadoraimc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    static Button b;
    static TextView tv1, tv2;
    static EditText et1;
    static EditText et2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b = findViewById(R.id.buttonCalcular);
        tv1 = findViewById(R.id.textViewPeso);
        tv2 = findViewById(R.id.textViewEstatura);
        et1 = findViewById(R.id.editTextTextPeso);
        et2 = findViewById(R.id.editTextTextEstatura);
    }


    public void clic (View view){
        Intent i = new Intent(this, MainActivity2.class);
        //coger el peso y añadirlo a los extras
        i.putExtra("datos", et1.getText().toString());
        //coger la altura y añadirlo a los extras
        i.putExtra("datos", et2.getText().toString());


        startActivity(i);
    }



}