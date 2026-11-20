/*
 * Sesión: S09 - Métodos
 * Ejercicio 05: esBisiesto(int anio)
 * Enunciado: Implementar esBisiesto(int anio) (divisible para 4 y no para 100, o divisible para 400) y probarlo desde main con Scanner.
 * Autor: Briones Cristopher
 * Fecha: 20/11/2026
 */

import java.util.Scanner;

public class Ej05_EsBisiesto {

    public static boolean esBisiesto(int anio) {
        return (anio % 4 == 0 && anio % 100 != 0) || (anio % 400 == 0);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese un año para comprobar si es bisiesto: ");
        int anio = sc.nextInt();

        if (esBisiesto(anio)) {
            System.out.println("El año " + anio + " ES bisiesto.");
        } else {
            System.out.println("El año " + anio + " NO es bisiesto.");
        }

        sc.close();
    }
}
