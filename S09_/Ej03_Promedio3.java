/*
 * Sesión: S09 - Métodos
 * Ejercicio 03: promedio3(double a, double b, double c)
 * Enunciado: Implementar promedio3(double a, double b, double c) que devuelva el promedio, y probarlo desde main con Scanner.
 * Autor: Briones Cristopher
 * Fecha: 20/11/2026
 */

import java.util.Locale;
import java.util.Scanner;

public class Ej03_Promedio3 {

    public static double promedio3(double a, double b, double c) {
        return (a + b + c) / 3.0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);

        System.out.print("Ingrese el primer número: ");
        double n1 = sc.nextDouble();
        System.out.print("Ingrese el segundo número: ");
        double n2 = sc.nextDouble();
        System.out.print("Ingrese el tercer número: ");
        double n3 = sc.nextDouble();

        double prom = promedio3(n1, n2, n3);
        System.out.printf("El promedio de los tres valores es: %.2f%n", prom);

        sc.close();
    }
}
