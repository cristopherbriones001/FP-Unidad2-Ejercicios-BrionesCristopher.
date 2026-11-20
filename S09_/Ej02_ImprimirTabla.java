/*
 * Sesión: S09 - Métodos
 * Ejercicio 02: imprimirTabla(int n)
 * Enunciado: Implementar imprimirTabla(int n) (void) que imprima la tabla de multiplicar de n, y probarlo desde main con Scanner.
 * Autor: Briones Cristopher
 * Fecha: 20/11/2026
 */

import java.util.Scanner;

public class Ej02_ImprimirTabla {

    public static void imprimirTabla(int n) {
        System.out.println("Tabla de multiplicar del " + n + ":");
        for (int i = 1; i <= 12; i++) {
            System.out.println(n + " x " + i + " = " + (n * i));
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese un entero para mostrar su tabla de multiplicar: ");
        int n = sc.nextInt();

        imprimirTabla(n);

        sc.close();
    }
}
