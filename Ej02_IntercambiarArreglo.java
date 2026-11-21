/*
 * Sesión: S10 - Argumentos y parámetros: paso por valor
 * Ejercicio 02: intercambiar(int[] v, int i, int j)
 * Enunciado: Escribe intercambiar(int[] v, int i, int j) que intercambie dos posiciones del arreglo. ¿Ahora sí?
 * Autor: Briones Cristopher
 * Fecha: 20/11/2026
 */

/*
 * ¿Ahora sí funciona? Sí, los elementos en las posiciones i y j del arreglo quedan intercambiados.
 * Explicación: Aunque Java sigue pasando argumentos por valor, el valor copiado al parámetro 'v'
 * es la referencia (dirección) hacia el mismo objeto arreglo ubicado en el montículo (heap).
 * Por ello, al acceder a v[i] y v[j] dentro del método, se modifica directamente el contenido
 * del arreglo compartido que 'datos' en main también referencia.
 */

public class Ej02_IntercambiarArreglo {

    public static void intercambiar(int[] v, int i, int j) {
        if (v == null || i < 0 || j < 0 || i >= v.length || j >= v.length) {
            System.out.println("Índices fuera de rango o arreglo nulo.");
            return;
        }
        int aux = v[i];
        v[i] = v[j];
        v[j] = aux;
    }

    public static void imprimirArreglo(int[] v) {
        System.out.print("[");
        for (int k = 0; k < v.length; k++) {
            System.out.print(v[k]);
            if (k < v.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }

    public static void main(String[] args) {
        int[] datos = {10, 20, 30, 40};
        System.out.print("Arreglo antes del intercambio: ");
        imprimirArreglo(datos);

        intercambiar(datos, 1, 3);

        System.out.print("Arreglo después de intercambiar índices 1 y 3: ");
        imprimirArreglo(datos);
    }
}
