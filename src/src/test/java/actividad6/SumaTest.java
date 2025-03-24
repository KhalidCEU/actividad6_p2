package actividad6;

import junit.framework.TestCase;

public class SumaTest
    extends TestCase
{

    // "necesito lo minimo"
    public void test1() {
        assertEquals(1, SumaGeometrica.paraTest1(1, 1, 2));
    }

    // "y si es 0?"
    public void test2() {
        assertEquals(0, SumaGeometrica.paraTest2(0, 0, 0));
    }

    // "vamos a hacer pasar algo correcto, con un numero entero"
    public void test3() {
        assertEquals(7, SumaGeometrica.v2(1, 2, 3));
    }

    // "y si n = 1 ?"
    public void test4() {
        assertEquals(1, SumaGeometrica.v2(1, 2, 1));
    }

    // "y si r = 1 ?"
    public void test5() {
        assertEquals(15, SumaGeometrica.v2(5, 1, 3));
    }

    // otro caso
    public void test6() {
        assertEquals(31, SumaGeometrica.v2(1, 2, 5));
    }

    // y si n = negativo ?
    public void test7() {
        // assertEquals(-7, SumaGeometrica.v3(1, 2, -3)); // falla con la v2, creamos nuevo metodo
        try {
            SumaGeometrica.v3(1, 2, -3);
            fail("no hemos recibido IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            assertEquals("n no debe de ser negativo", e.getMessage());
        }
    }

    // y si a = negativo ?
    public void test8() {
        assertEquals(-31, SumaGeometrica.v3(-1, 2, 5));
    }

    // y si r = negativo ?
    public void test9() {
        assertEquals(3, SumaGeometrica.v3(1, -2, 3));
    }

}



