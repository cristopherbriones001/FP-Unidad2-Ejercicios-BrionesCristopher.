/*
 * Sesión: S11 - Ámbito de las variables
 * Ejercicio 01: Marcar el ámbito de cada variable
 * Enunciado: Marca el ámbito de cada variable (local, de bloque o static) en un programa.
 * Autor: Briones Cristopher
 * Fecha: 20/11/2026
 */

public class Ej01_MarcarAmbito {
    
    static int totalProcesados = 0;
    public static void main(String[] args) {
        int limite = 3;

        for (int i = 1; i <= limite; i++) {
            
            int parcial = i * 10;

            if (parcial >= 20) {
               
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
