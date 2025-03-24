package actividad6;

import junit.framework.TestCase;

public class AppTest2
    extends TestCase
{
    public void testSumaHastaN() {
        assertEquals(0, Mates2.sumaHastaN(0));
        assertEquals(1, Mates2.sumaHastaN(1));
        assertEquals(15, Mates2.sumaHastaN(5));
        assertEquals(55, Mates2.sumaHastaN(10));
    }

    public void testFactorial() {
        assertEquals(1, Mates2.factorial(1));
        assertEquals(6, Mates2.factorial(3));
        assertEquals(120, Mates2.factorial(5));
    }

    public void testPotencia() {
        assertEquals(1, Mates2.potencia(5, 0));
        assertEquals(1, Mates2.potencia(0, 0));
        assertEquals(8, Mates2.potencia(2, 3));
        assertEquals(-8, Mates2.potencia(-2, 3));
    }

    public void testSumaElementosLista() {
        int[] listaVacia = {};
        assertEquals(0, Mates2.sumaElementosLista(listaVacia, 0));

        int[] lista1 = {5};
        assertEquals(5, Mates2.sumaElementosLista(lista1, 0));

        int[] lista2 = {1, 2, 3, 4, 5};
        assertEquals(15, Mates2.sumaElementosLista(lista2, 0));

        int[] lista3 = {-1, -2, -3, -4, -5};
        assertEquals(-15, Mates2.sumaElementosLista(lista3, 0));
    }
}
