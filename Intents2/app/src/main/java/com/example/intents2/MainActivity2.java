package com.example.intents2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        // recoget los datos que nos llegan

        Intent intent = getIntent();
        Bundle b = intent.getExtras();

        String s = b.getString("datos").toString();


        // mostrar los datos por pantalla
        TextView tc = findViewById(R.id.textView);
        tc.setText(s);
    }
}