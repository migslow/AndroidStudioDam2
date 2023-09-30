package com.example.calculadoranumerosprimos;

import android.widget.EditText;
import android.widget.TextView;

public class Calculo {

    private static EditText editTextText2;
    private static TextView textViewResultado;
    public static void ButtonCalcular(){
        editTextText2 = ButtonCalcular(R.id.editTextText2);
        textViewResultado = ButtonCalcular(R.id.textViewResultado);

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
