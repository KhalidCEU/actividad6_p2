## Actividad 6 - Desarrollo dirigido por pruebas


Nota: Para ejecutar los tests, use el comando ```make maven_test```.


### Ejercicio 31

>  El propósito del presente ejercicio es mostrar cómo se lleva a
cabo el desarrollo dirigido por pruebas (TDD) mediante un ejemplo sencillo.
Se pide realizar los siguientes apartados:

> **1.** Elabore un test para comprobar que la suma de los n primeros enteros
positivos siendo n = 1 es 1, y véalo fallar.

> **2.** Escriba el código mínimo del método de sumar los n primeros números
con el propósito de que pase el test del apartado 1.

> **3.** Elabore un test para la suma de los n primeros enteros positivos siendo
n > 1, y véalo fallar.

> **4.** Modifique el código del método de sumar los n primeros números en-
teros con el propósito de que pase el test del apartado 3.

> **5.** Añada los tests que considere oportunos de tal forma que, para cada
uno ellos, primero lo vea fallar, y luego lo haga funcionar realizando
los cambios oportunos sobre el código del método de la suma de los n
primeros enteros.

El fichero de los **tests** se encuentra [aquí](/src/src/test/java/actividad6/AppTest.java).

El fichero con el metodo **sumarNPrimeros** se encuentra [aquí](/src/src/main/java/actividad6/Mates.java).

### Ejercicio 32

> Realice el [ejercicio 2](https://github.com/KhalidCEU/actividad2_p2) utilizando la técnica de TDD.

El fichero de los **tests** se encuentra [aquí](/src/src/test/java/actividad6/AppTest2.java).

El fichero con los **metodos** se encuentra [aquí](/src/src/main/java/actividad6/Mates2.java).

### Ejercicio 33

> Una progresión geométrica es una sucesión que se caracteriza por que el cociente entre dos términos consecutivos es una cantidad constante a la que se llama razón (http://www.ematematicas.net/sucesiones.php?a=4&tipo=geometrica).

> Por ejemplo, la sucesión `1 2, 4, 8, 16, ...` es una progresión geométrica de razón 2, pues `2/1 = 2`, `4/2=2`, `8/4 = 2`, etc.

> Se pretende codificar, de acuerdo con la técnica de desarrollo dirigido por pruebas (TDD), un método que calcule la suma de los n primeros términos de una progresión geométrica. Por ejemplo, la suma de los 3 primeros términos de la sucesión 1, 2, 4, 8, 16, ... es 7.

>  Se pide la secuencia de tests y de versiones del método a desarrollar según TDD que culmine con el método implementado que pase todos los tests. No se considerará válida una respuesta que aporte el código correcto del programa, pero que no siga correctamente los pasos del TDD.


El fichero de los **tests** se encuentra [aquí](/src/src/test/java/actividad6/SumaTest.java).

El fichero con las versiones del **metodo de la suma géometrica** se encuentra [aquí](/src/src/main/java/actividad6/SumaGeometrica.java).