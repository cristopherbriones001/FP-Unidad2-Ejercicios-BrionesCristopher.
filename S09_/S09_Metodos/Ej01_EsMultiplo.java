/*
 * Sesión: S09 - Métodos
 * Ejercicio 01: esMultiplo(int a, int b)
 * Enunciado: Implementar esMultiplo(int a, int b) que devuelva true si a es múltiplo de b, y probarlo desde main con Scanner.
 * Autor: Briones Cristopher
 * Fecha: 20/11/2026
 */

import java.util.Scanner;

public class Ej01_EsMultiplo {

    public static boolean esMultiplo(int a, int b) {
        if (b == 0) {
            return false;
        }
        return a % b == 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el número entero a: ");
        int a = sc.nextInt();
        System.out.print("Ingrese el número entero b: ");
        int b = sc.nextInt();

        if (esMultiplo(a, b)) {
            System.out.println(a + " SÍ es múltiplo de " + b + ".");
        } else {
            System.out.println(a + " NO es múltiplo de " + b + ".");
        }

        sc.close();
    }
}
