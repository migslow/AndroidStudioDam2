package com.example.intents2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText et;
    Button b;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        et = findViewById(R.id.editText);
        b = findViewById(R.id.button);
    }

    public void clic (View view){
        Intent i = new Intent(this, MainActivity2.class);
        // Cogemos lo que hay en el t3extView y lo añadimos al intent para pasarlo
        i.putExtra("datos", et.getText().toString());

        // Iniciamos la nueva actividad
        startActivity(i);
    }
}