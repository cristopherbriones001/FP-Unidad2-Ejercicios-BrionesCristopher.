/*
 * Sesión: S12 - Métodos de biblioteca: Math, Random, Character y String
 * Ejercicio 05: Generar un código de 6 caracteres (3 letras + 3 dígitos)
 * Enunciado: Generar un código de 6 caracteres: 3 letras aleatorias y 3 dígitos aleatorios.
 * Autor: Briones Cristopher
 * Fecha: 20/11/2026
 */

import java.util.Random;

public class Ej05_GenerarCodigo {

    public static String generarCodigo(Random rnd) {
        StringBuilder sb = new StringBuilder(6);
        for (int i = 0; i < 3; i++) {
            char letra = (char) ('A' + rnd.nextInt(26));
            sb.append(letra);
        }
        for (int i = 0; i < 3; i++) {
            int digito = rnd.nextInt(10);
            sb.append(Character.forDigit(digito, 10));
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        Random rnd = new Random();
        String codigo = generarCodigo(rnd);
        System.out.println("Código generado: " + codigo);
    }
}
