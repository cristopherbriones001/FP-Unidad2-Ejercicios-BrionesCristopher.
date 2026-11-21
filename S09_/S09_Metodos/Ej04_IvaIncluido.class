/*
 * Sesión: S09 - Métodos
 * Ejercicio 04: ivaIncluido(double precio)
 * Enunciado: Implementar ivaIncluido(double precio) que devuelva el precio con IVA del 15 %, y probarlo desde main con Scanner.
 * Autor: Briones Cristopher
 * Fecha: 20/11/2026
 */

import java.util.Locale;
import java.util.Scanner;

public class Ej04_IvaIncluido {

    public static double ivaIncluido(double precio) {
        return precio * 1.15;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);

        System.out.print("Ingrese el precio sin IVA: ");
        double precioBase = sc.nextDouble();

        double precioFinal = ivaIncluido(precioBase);
        System.out.printf("Precio con 15%% de IVA incluido: %.2f%n", precioFinal);

        sc.close();
    }
}
