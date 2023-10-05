import android.widget.EditText;

public class Calculo {
    public static String ButtonCalcular(int posicion){
        int contador = 0;
        int numero = 2;
        while (true) {
            if (esPrimo(numero)) {
                contador++;
                if (contador == posicion) {
                    return "El número primo " + posicion + " es: " + numero;
                }
            }
            numero++;
        }
    }

    public static boolean esPrimo(int numero) {
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    }
}
