package actividad6;

public class Mates2 {
    // Suma 0 + 1 + 2 + ... + n.
    public static int sumaHastaN(int nb) {
        if (nb == 0) {
            return 0;
        }

        return nb + sumaHastaN(nb - 1);
    }

    // Factorial de un numero
    public static int factorial(int nb) {
        if (nb == 1) {
            return 1;
        }

        return nb * (factorial(nb - 1));
    }

    // Potencia n-esima
    public static int potencia(int nb, int exponente) {
        if (exponente == 0) {
            return 1;
        }
        return nb * potencia(nb, exponente - 1);
    }

    // Suma elementos de una lista de numeros
    public static int sumaElementosLista(int[] listaNumeros, int index) {
        if (index == listaNumeros.length) {
            return 0;
        }

        return listaNumeros[index] + sumaElementosLista(listaNumeros, index + 1);
    }
}
