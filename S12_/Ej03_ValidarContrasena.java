/*
 * Sesión: S12 - Métodos de biblioteca: Math, Random, Character y String
 * Ejercicio 03: Validar una contraseña con Character
 * Enunciado: Validar contraseña: mínimo 8 caracteres, al menos una mayúscula y un dígito usando Character.
 * Autor: Briones Cristopher
 * Fecha: 20/11/2026
 */

import java.util.Scanner;

public class Ej03_ValidarContrasena {

    public static boolean esContrasenaValida(String clave) {
        if (clave == null || clave.length() < 8) {
            return false;
        }
        boolean tieneMayuscula = false;
        boolean tieneDigito = false;

        for (int i = 0; i < clave.length(); i++) {
            char c = clave.charAt(i);
            if (Character.isUpperCase(c)) {
                tieneMayuscula = true;
            }
            if (Character.isDigit(c)) {
                tieneDigito = true;
            }
        }
        return tieneMayuscula && tieneDigito;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese una contraseña: ");
        String clave = sc.nextLine();

        if (esContrasenaValida(clave)) {
            System.out.println("Contraseña VÁLIDA.");
        } else {
            System.out.println("Contraseña INVÁLIDA (requiere >= 8 caracteres, 1 mayúscula y 1 dígito).");
        }
        sc.close();
    }
}
