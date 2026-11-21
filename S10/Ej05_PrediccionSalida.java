/*
 * Sesión: S10 - Argumentos y parámetros: paso por valor
 * Ejercicio 05: Predicción de salida con 3 llamadas
 * Enunciado: Predice en papel la salida de un programa con 3 llamadas antes de ejecutarlo.
 * Autor: Briones Cristopher
 * Fecha: 20/11/2026
 */

public class Ej05_PrediccionSalida {

    public static int duplicarYSumar(int numero, int extra) {
        numero = numero * 2;
        return numero + extra;
    }

    public static void main(String[] args) {
        int base = 4;

        int r1 = duplicarYSumar(base, 6);
        System.out.println("Llamada 1 -> resultado: " + r1 + ", base en main: " + base);

        int r2 = duplicarYSumar(base, 10);
        System.out.println("Llamada 2 -> resultado: " + r2 + ", base en main: " + base);

        int r3 = duplicarYSumar(base + 2, 6);
        System.out.println("Llamada 3 -> resultado: " + r3 + ", base en main: " + base);
    }
}
