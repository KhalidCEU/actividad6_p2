package actividad6;

public class Mates {
    public static int sumarNPrimeros(int n) {
        int suma = 0;

        for (int i = 1; i <= n; i++) {
            suma += i;
        }
        return suma;
    }
}
