/*
 * Sesión: S10 - Argumentos y parámetros: paso por valor
 * Ejercicio 01: intercambiar(int a, int b)
 * Enunciado: Escribe intercambiar(int a, int b) e intenta intercambiar dos variables de main. ¿Funciona? Explica.
 * Autor: Briones Cristopher
 * Fecha: 20/11/2026
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
