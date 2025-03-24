package actividad6;

import junit.framework.TestCase;

/**
 * Unit test for simple App.
 */
public class AppTest
    extends TestCase
{
    public void testSumaPrimerEntero() {
        assertEquals(1, Mates.sumarNPrimeros(1));
    }

    public void testSumaPrimerosTresEnteros() {
        assertEquals(6, Mates.sumarNPrimeros(3));
    }

    public void testSumaCero() {
        assertEquals(0, Mates.sumarNPrimeros(0));
    }

    public void testSumaNumeroGrande() {
        assertEquals(5050, Mates.sumarNPrimeros(100));
    }
}
