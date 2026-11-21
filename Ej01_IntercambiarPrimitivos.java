/*
 * Sesión: S10 - Argumentos y parámetros: paso por valor
 * Ejercicio 01: intercambiar(int a, int b)
 * Enunciado: Escribe intercambiar(int a, int b) e intenta intercambiar dos variables de main. ¿Funciona? Explica.
 * Autor: Briones Cristopher
 * Fecha: 20/11/2026
 */

/*
 * ¿Funciona? No, no intercambia las variables x e y de main.
 * ¿Por qué? Porque Java siempre pasa argumentos por valor. Al llamar a intercambiar(x, y),
 * los parámetros formales 'a' y 'b' reciben copias independientes de los valores almacenados
 * en 'x' e 'y' dentro del marco de pila del método. Intercambiar 'a' y 'b' solo afecta a esas
 * copias locales y se pierden cuando el método termina; 'x' e 'y' en main conservan sus valores.
 */

public class Ej01_IntercambiarPrimitivos {

    public static void intercambiar(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
        System.out.println("Dentro de intercambiar -> a = " + a + ", b = " + b);
    }

    public static void main(String[] args) {
        int x = 10;
        int y = 25;

        System.out.println("Antes de llamar a intercambiar -> x = " + x + ", y = " + y);
        intercambiar(x, y);
        System.out.println("Después de llamar a intercambiar -> x = " + x + ", y = " + y);
    }
}
