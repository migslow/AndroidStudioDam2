package com.example.calculadoraprimosv2;

import java.util.ArrayList;
import java.util.List;

public class Calculo {
    private static ArrayList<Integer> numerosPrimos = new ArrayList<>();

    public static String ButtonCalcular(int posicion) {
        if (posicion <= 0) {
            return null;
        }

        if (posicion <= numerosPrimos.size()) {
            return "El número primo " + posicion + " es: " + numerosPrimos.get(posicion - 1);
        }

        int contador = numerosPrimos.size();
        int numero = 0;

        while (true) {
            if (esPrimo(numero)) {
                numerosPrimos.add(numero);
                contador++;
                if (contador == posicion) {
                    return "El número primo " + posicion + " es: " + numero;
                }
            }
            numero++;
        }
    }

    private static boolean esPrimo(int numero) {
        if (numero <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false;
            }
        }

        return true;
    }
}
