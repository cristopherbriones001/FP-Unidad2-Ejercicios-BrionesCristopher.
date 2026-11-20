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

        // Línea inválida: System.out.println(dentroIf);
        // Mensaje del compilador: cannot find symbol -> variable dentroIf
        // Causa: 'dentroIf' tiene ámbito de bloque dentro del 'if' y ya salió de alcance.

        for (int idx = 0; idx < 2; idx++) {
            System.out.println("idx = " + idx);
        }

        // Línea inválida: System.out.println(idx);
        // Mensaje del compilador: cannot find symbol -> variable idx
        // Causa: 'idx' pertenece exclusivamente al bloque del ciclo 'for'.

        // Línea inválida: int base = 20;
        // Mensaje del compilador: variable base is already defined in method main(String[])
        // Causa: No se puede redeclarar una variable local con el mismo nombre en el mismo ámbito.

        System.out.println("Compilación correcta con base = " + base);
    }
}
