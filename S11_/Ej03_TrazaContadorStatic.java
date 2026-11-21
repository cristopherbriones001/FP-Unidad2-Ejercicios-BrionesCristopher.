/*
 * Sesión: S11 - Ámbito de las variables
 * Ejercicio 03: Traza de un contador static llamado desde un for
 * Enunciado: Haz la traza de un programa con un contador static llamado desde un for.
 * Autor: Briones Cristopher
 * Fecha: 20/11/2026
 */

public class Ej03_TrazaContadorStatic {

    static int contador = 0;

    public static void incrementar() {
        int paso = 1;
        contador += paso;
    }

    public static void main(String[] args) {
        for (int i = 0; i < 3; i++) {
            incrementar();
        }
        System.out.println("Valor final de contador: " + contador);
    }
}
