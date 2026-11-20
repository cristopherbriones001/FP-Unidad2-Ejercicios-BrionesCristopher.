/*
 * Sesión: S10 - Argumentos y parámetros: paso por valor
 * Ejercicio 04: Sobrecarga de perimetro
 * Enunciado: Sobrecarga perimetro(double lado) (cuadrado) y perimetro(double a, double b) (rectángulo).
 * Autor: Briones Cristopher
 * Fecha: 20/11/2026
 */

public class Ej04_SobrecargaPerimetro {

    public static double perimetro(double lado) {
        return 4.0 * lado;
    }

    public static double perimetro(double a, double b) {
        return 2.0 * (a + b);
    }

    public static void main(String[] args) {
        double ladoCuadrado = 5.5;
        double baseRectangulo = 6.0;
        double alturaRectangulo = 3.5;

        System.out.printf("Perímetro del cuadrado (lado %.2f): %.2f%n",
                ladoCuadrado, perimetro(ladoCuadrado));
        System.out.printf("Perímetro del rectángulo (%.2f x %.2f): %.2f%n",
                baseRectangulo, alturaRectangulo, perimetro(baseRectangulo, alturaRectangulo));
    }
}
