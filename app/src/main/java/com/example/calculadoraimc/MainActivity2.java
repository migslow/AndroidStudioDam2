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

        Intent intent = getIntent();
        Bundle extras = intent.getExtras();
            double peso = extras.getDouble("peso");
            double estatura = extras.getDouble("estatura");
            double resultado = calculo(peso, (int) estatura);
            TextView tc = findViewById(R.id.textViewResultado);
            String cad="";
            if(resultado<16.00){
                cad="Infrapeso: Delgadez Severa";
            }else if(resultado>=16.00 && resultado<=16.99){
                cad="Infrapeso: Delgadez moderada";
            }else if(resultado>=17.00 && resultado<=18.49){
                cad="Infrapeso: Delgadez aceptable";
            }else if(resultado>=18.50 && resultado<=24.99){
                cad="Peso Normal";
            }else if(resultado>=25.00 && resultado<=29.99){
                cad="Sobrepeso";
            }else if(resultado>=30.00 && resultado<=34.99){
                cad="Obeso: Tipo I";
            }else if(resultado>=35.00 && resultado<40.00){
                cad="Obeso: Tipo III";
            }else{
                cad="no existe clasificacion";
            }
            tc.setText(cad);
        }


        //cambias el color del fondo


    public static double calculo(double peso, int estatura) {
        double resultado = peso / (estatura * estatura);
        return resultado;
    }
}