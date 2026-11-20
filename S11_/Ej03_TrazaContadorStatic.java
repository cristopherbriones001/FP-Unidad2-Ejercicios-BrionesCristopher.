/*
 * Sesión: S11 - Ámbito de las variables
 * Ejercicio 03: Traza de un contador static llamado desde un for
 * Enunciado: Haz la traza de un programa con un contador static llamado desde un for.
 * Autor: Briones Cristopher
 * Fecha: 20/11/2026
 */

/*
 * Tabla de traza (línea | variables vivas | valor):
 * inicio main          | contador = 0, i (no inicializada)          | contador=0
 * for (i=0; i<3)       | contador = 0, i = 0                        | i=0, contador=0
 * llamar incrementar() | contador, i (en main), paso (en método)    | paso=1 -> contador=1
 * fin iteración 0      | contador = 1, i = 0 (paso destruida)       | contador=1
 * for (i=1; i<3)       | contador = 1, i = 1                        | i=1, contador=1
 * llamar incrementar() | contador, i (en main), paso (en método)    | paso=1 -> contador=2
 * fin iteración 1      | contador = 2, i = 1 (paso destruida)       | contador=2
 * for (i=2; i<3)       | contador = 2, i = 2                        | i=2, contador=2
 * llamar incrementar() | contador, i (en main), paso (en método)    | paso=1 -> contador=3
 * fin iteración 2      | contador = 3, i = 2 (paso destruida)       | contador=3
 * fin for (i=3)        | contador = 3 (i destruida al salir del for) | contador=3
 * fin main             | contador = 3                               | salida final: 3
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
