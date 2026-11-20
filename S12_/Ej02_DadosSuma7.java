/*
 * Sesión: S12 - Métodos de biblioteca: Math, Random, Character y String
 * Ejercicio 02: Lanzar dos dados 1000 veces y contar cuántas veces suman 7
 * Enunciado: Lanzar dos dados 1000 veces con Random y mostrar el conteo y porcentaje de sumas iguales a 7.
 * Autor: Briones Cristopher
 * Fecha: 20/11/2026
 */

import java.util.Random;

public class Ej02_DadosSuma7 {

    public static void main(String[] args) {
        int lanzamientos = 1000;
        int conteoSuma7 = 0;
        Random rnd = new Random();

        for (int i = 0; i < lanzamientos; i++) {
            int dado1 = rnd.nextInt(6) + 1;
            int dado2 = rnd.nextInt(6) + 1;
            if (dado1 + dado2 == 7) {
                conteoSuma7++;
            }
        }

        double porcentaje = (conteoSuma7 * 100.0) / lanzamientos;
        System.out.println("Total de lanzamientos: " + lanzamientos);
        System.out.println("Veces que la suma fue 7: " + conteoSuma7);
        System.out.printf("Porcentaje de suma 7: %.2f%%%n", porcentaje);
    }
}
