package com.example.ud2_1_internacionalizacindeaplicaciones;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView textView;
    Button b;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = findViewById(R.id.tv1);
        textView.setText(R.string.texto1);

        textView = findViewById(R.id.tv2);
        textView.setText(R.string.texto2);

        b = findViewById(R.id.button1);
        b.setText(R.string.boton1);

    }

    public void cambiarTexto(View view){
        textView.setText(R.string.boton1);
    }
}