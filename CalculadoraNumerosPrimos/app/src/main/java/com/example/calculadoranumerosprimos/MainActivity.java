package com.example.calculadoranumerosprimos;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText editTextText2;
    private TextView textViewResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTextText2 = findViewById(R.id.editTextText2);
        textViewResultado = findViewById(R.id.textViewResultado);
    }
    public void ButtonCalcular(View view){
        String numeroTexto = editTextText2.getText().toString();
        int contador = 0;
        int numero = 2;
        int n = Integer.parseInt(numeroTexto);

        while (contador < n) {
            boolean esPrimo = true;
            for (int i = 2; i <= Math.sqrt(numero); i++) {
                if (numero % i == 0) {
                    esPrimo = false;
                    break;
                }
            }
            if (esPrimo) {
                contador++;
                if (contador == n) {
                    textViewResultado.setText("El número primo " + n + " es: " + numero);
                }
            }
            numero++;
        }
    }

}