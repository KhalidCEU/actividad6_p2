package actividad6;

public class SumaGeometrica {

    // a = primer elemento de la progresion geometrica
    // r = razon entre elementos consecutivos
    // n = numero de terminos / posicion del termino a calcular en la progresion

    // Ej: a = 1, r = 2, n = 3
    // Empezamos por 1, multiplicamos * 2 cada vez () hasta 3

        // resultado += 1           resultado 1, iteracion 1 (n=0)
        // resultado += (1 * 2)     resultado 3, iteracion 2 (n=1)
        // resultado += (2 * 2)     resultado 7, iteracion 3 (n=2) STOP (i < n, y n = 3)


    public static int paraTest1(int a, int r, int n) {
        return a;
    }

    public static int paraTest2(int a, int r, int n) {
        if (n == 0)
            return 0;
        return a;
    }

    public static int v2(int a, int r, int n) {
        int resultado = 0;
        int termino = a;

        for (int i = 0; i < n; i++) {
            resultado += termino;
            termino *= r;
        }

        return resultado;
    }

    public static int v3(int a, int r, int n) {
        if (n < 0) {
            throw new IllegalArgumentException("n no debe de ser negativo");
        }

        int resultado = 0;
        int termino = a;

        for (int i = 0; i < n; i++) {
            resultado += termino;
            termino *= r;
        }

        return resultado;
    }

}
