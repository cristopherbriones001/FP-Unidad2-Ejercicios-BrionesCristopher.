/*
 * Sesión: S11 - Ámbito de las variables
 * Ejercicio 04: Reescribir un programa con 3 atributos static usando parámetros y return
 * Enunciado: Reescribe un programa que usa 3 atributos static para que use parámetros y return.
 * Autor: Briones Cristopher
 * Fecha: 20/11/2026
 */

public class Ej04_ReescribirSinStatic {

    public static double calcularTotal(double precioUnitario, int cantidad, double descuentoPct) {
        double subtotal = precioUnitario * cantidad;
        return subtotal - (subtotal * descuentoPct / 100.0);
    }

    public static void main(String[] args) {
        double precioUnitario = 12.0;
        int cantidad = 3;
        double descuentoPct = 10.0;

        double total = calcularTotal(precioUnitario, cantidad, descuentoPct);
        System.out.printf("Total a pagar: %.2f%n", total);
    }
}
