/*
 * Sesión: S12 - Métodos de biblioteca: Math, Random, Character y String
 * Ejercicio 04: Contar vocales de una frase con String y Character
 * Enunciado: Contar vocales (mayúsculas y minúsculas) de una frase usando String y Character.
 * Autor: Briones Cristopher
 * Fecha: 20/11/2026
 */

import java.util.Scanner;

public class Ej04_ContarVocales {

    public static int contarVocales(String frase) {
        if (frase == null || frase.isEmpty()) {
            return 0;
        }
        int contador = 0;
        for (int i = 0; i < frase.length(); i++) {
            char ch = frase.charAt(i);
            char minuscula = Character.toLowerCase(ch);
            if (minuscula == 'a' || minuscula == 'e' || minuscula == 'i'
                    || minuscula == 'o' || minuscula == 'u') {
                contador++;
            }
        }
        return contador;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese una frase: ");
        String frase = sc.nextLine();

        System.out.println("Cantidad de vocales: " + contarVocales(frase));
        sc.close();
    }
}
