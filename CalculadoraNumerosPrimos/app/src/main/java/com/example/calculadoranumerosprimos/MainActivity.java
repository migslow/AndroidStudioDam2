package com.example.calculadoranumerosprimos;

import static com.example.calculadoranumerosprimos.Calculo.ButtonCalcular;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    public static EditText editTextText2;
    private static TextView textViewResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTextText2 = findViewById(R.id.editTextText2);

        //Hay que pasar lo que tiene el editTextText2 a int
        String s = editTextText2.getText().toString();
        int numero = Integer.parseInt(s);

        System.out.println(ButtonCalcular(numero));
    }


}