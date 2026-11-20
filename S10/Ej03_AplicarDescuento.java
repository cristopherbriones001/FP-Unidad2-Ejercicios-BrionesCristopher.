/*
 * Sesión: S10 - Argumentos y parámetros: paso por valor
 * Ejercicio 03: aplicarDescuento(double[] precios, double pct)
 * Enunciado: aplicarDescuento(double[] precios, double pct) que modifique todo el arreglo e imprima antes y después.
 * Autor: Briones Cristopher
 * Fecha: 20/11/2026
 */

public class Ej03_AplicarDescuento {

    public static void aplicarDescuento(double[] precios, double pct) {
        if (precios == null) {
            return;
        }
        double factor = 1.0 - (pct / 100.0);
        for (int i = 0; i < precios.length; i++) {
            precios[i] = precios[i] * factor;
        }
    }

    public static void imprimirPrecios(String etiqueta, double[] precios) {
        System.out.print(etiqueta + ": ");
        for (int i = 0; i < precios.length; i++) {
            System.out.printf("%.2f", precios[i]);
            if (i < precios.length - 1) {
                System.out.print(" | ");
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        double[] precios = {12.50, 8.00, 25.40, 15.00};
        double porcentajeDescuento = 10.0;

        imprimirPrecios("Precios antes del descuento", precios);
        aplicarDescuento(precios, porcentajeDescuento);
        imprimirPrecios("Precios después del " + porcentajeDescuento + "% de descuento", precios);
    }
}
