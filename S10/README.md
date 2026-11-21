Fundamentos de Programación B - NRC 37712

Universidad de las Fuerzas Armadas ESPE

Docente: Ing. Esteban Gonzabay Jimenez Mgtr.

Estudiante: Cristopher Alexander Briones Vera

Qué hay en esta carpeta:
- `Ej01_IntercambiarPrimitivos.java`: intenta intercambiar dos `int` pasando variables a un método.
- `Ej02_IntercambiarArreglo.java`: cambia de posición elementos de un arreglo `int[]`.
- `Ej03_AplicarDescuento.java`: calcula cuánto queda un precio con descuento.
- `Ej04_SobrecargaPerimetro.java`: calcula perímetros usando métodos con el mismo nombre pero distintos parámetros.
- `Ej05_PrediccionSalida.java`: sigue el orden en que se imprimen valores y cambian datos.

¿Por qué no funciona el intercambio de primitivos en `Ej01`? Porque Java pasa los primitivos por valor, o sea, el método recibe copias; si cambio algo ahí adentro, las variables del `main` siguen igual. En cambio, con un arreglo (`Ej02`), la referencia apunta al mismo arreglo en memoria y por eso los cambios en sus posiciones sí se notan afuera. En `Ej04` la sobrecarga sirve para tener varias versiones de `calcularPerimetro` según los parámetros que le mande.

Se compila y ejecuta desde VS Code o con `javac` / `java` en terminal.
