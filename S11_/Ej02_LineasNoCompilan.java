/*
 * Sesión: S11 - Ámbito de las variables
 * Ejercicio 02: Líneas que no compilan y por qué
 * Enunciado: Indica qué líneas no compilan y por qué.
 * Autor: Briones Cristopher
 * Fecha: 20/11/2026
 */

public class Ej02_LineasNoCompilan {

    public static void main(String[] args) {
        int base = 5;

        if (base > 0) {
            int dentroIf = 15;
            System.out.println("Dentro del if: " + dentroIf);
        }

        for (int idx = 0; idx < 2; idx++) {
            System.out.println("idx = " + idx);
        }
        System.out.println("Compilación correcta con base = " + base);
    }
}
