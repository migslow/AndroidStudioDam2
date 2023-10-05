package com.example.calculadoraimc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        //hacer el cálculo
        //double resultado = tv.getExtra / (estatura * estatura);

        tv = calculo()

        Intent intent = getIntent();
        Bundle tv = intent.getExtras();
        String s = tv.getString("datos").toString();
        TextView tc = findViewById(R.id.textViewResultado);
        tc.setText(s);
        }

        //cambias el color del fondo
    }

    public static double calculo(double peso, int estatura) {
        double resultado = peso / (estatura * estatura);
        return resultado;
    }
   /* public void click(View v) {
        String cad="";
        if(calculoIMC()<16.00){
            cad="Infrapeso: Delgadez Severa";
        }else if(calculoIMC()>=16.00 && calculoIMC()<=16.99){
            cad="Infrapeso: Delgadez moderada";
        }else if(calculoIMC()>=17.00 && calculoIMC()<=18.49){
            cad="Infrapeso: Delgadez aceptable";
        }else if(calculoIMC()>=18.50 && calculoIMC()<=24.99){
            cad="Peso Normal";
        }else if(calculoIMC()>=25.00 && calculoIMC()<=29.99){
            cad="Sobrepeso";
        }else if(calculoIMC()>=30.00 && calculoIMC()<=34.99){
            cad="Obeso: Tipo I";
        }else if(calculoIMC()>=35.00 && calculoIMC()<40.00){
            cad="Obeso: Tipo III";
        }else{
            cad="no existe clasificacion";
        }
        return cad;

    }*/
}