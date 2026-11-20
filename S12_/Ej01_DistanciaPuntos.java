/*
 * Sesión: S12 - Métodos de biblioteca: Math, Random, Character y String
 * Ejercicio 01: Distancia entre dos puntos con Math.sqrt y Math.pow
 * Enunciado: Calcular la distancia entre dos puntos (x1, y1) y (x2, y2) usando Math.sqrt y Math.pow.
 * Autor: Briones Cristopher
 * Fecha: 20/11/2026
 */

import java.util.Locale;
import java.util.Scanner;

public class Ej01_DistanciaPuntos {

    public static double calcularDistancia(double x1, double y1, double x2, double y2) {
        double dx = x2 - x1;
        double dy = y2 - y1;
        return Math.sqrt(Math.pow(dx, 2) + Math.pow(dy, 2));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);

        System.out.print("Ingrese x1 y y1: ");
        double x1 = sc.nextDouble();
        double y1 = sc.nextDouble();

        System.out.print("Ingrese x2 y y2: ");
        double x2 = sc.nextDouble();
        double y2 = sc.nextDouble();

        double distancia = calcularDistancia(x1, y1, x2, y2);
        System.out.printf("Distancia entre (%.2f, %.2f) y (%.2f, %.2f): %.4f%n",
                x1, y1, x2, y2, distancia);

        sc.close();
    }
}
