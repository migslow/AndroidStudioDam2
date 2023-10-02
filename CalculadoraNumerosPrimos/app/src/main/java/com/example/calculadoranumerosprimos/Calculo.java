package com.example.calculadoranumerosprimos;

import android.widget.EditText;

public class Calculo {
    public static String ButtonCalcular(int posicion){

        //editTextText2 = ButtonCalcular(R.id.editTextText2);
        //textViewResultado = ButtonCalcular(R.id.textViewResultado);

        // String numeroTexto = Calculo.editTextText2.getText().toString();

        int contador = 0;
        int numero = 2;
        // int n = Integer.parseInt(numeroTexto);

        while (contador < posicion) {
            boolean esPrimo = true;
            for (int i = 2; i <= Math.sqrt(numero); i++) {
                if (numero % i == 0) {
                    esPrimo = false;
                    break;
                }
            }
            if (esPrimo) {
                contador++;
                if (contador == posicion) {
                    return "El número primo " + posicion + " es: " + numero;
                }
            }
            numero++;
        }
        return null;
    }
}
