/*
 * Sesión: S11 - Ámbito de las variables
 * Ejercicio 01: Marcar el ámbito de cada variable
 * Enunciado: Marca el ámbito de cada variable (local, de bloque o static) en un programa.
 * Autor: Briones Cristopher
 * Fecha: 20/11/2026
 */

public class Ej01_MarcarAmbito {

    // Ámbito: static (pertenece a la clase durante toda la ejecución del programa)
    static int totalProcesados = 0;

    public static void main(String[] args) {
        // Ámbito: local al método main (visible desde su declaración hasta el cierre de main)
        int limite = 3;

        // 'i' tiene ámbito: de bloque (pertenece al encabezado y cuerpo del ciclo for)
        for (int i = 1; i <= limite; i++) {
            // Ámbito: de bloque (existe solo dentro de esta iteración del for)
            int parcial = i * 10;

            if (parcial >= 20) {
                // Ámbito: de bloque (existe solo dentro del bloque if)
                String mensaje = "Alto";
                System.out.println(i + " -> " + parcial + " (" + mensaje + ")");
            } else {
                // Ámbito: de bloque (existe solo dentro del bloque else)
                String mensaje = "Bajo";
                System.out.println(i + " -> " + parcial + " (" + mensaje + ")");
            }
            totalProcesados++;
        }

        // Ámbito: local al método main
        System.out.println("Total procesados: " + totalProcesados);
    }
}
