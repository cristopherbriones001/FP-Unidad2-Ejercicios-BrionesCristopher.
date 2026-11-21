Fundamentos de Programación B - NRC 37712

Universidad de las Fuerzas Armadas ESPE

Docente: Ing. Esteban Gonzabay Jimenez Mgtr.

Estudiante: Cristopher Alexander Briones Vera

Archivos de la sesión:
- `Ej01_ContarLlamadas.java`: lleva un contador de cuántas veces se llama un método usando `static`.
- `Ej02_AlcanceBloque.java`: pruebas de hasta dónde vive una variable según el bloque.
- `Ej03_MenuCalculadora.java`: menú en consola repartiéndolo en métodos.
- `Ej04_ReescribirSinStatic.java`: cambia el enfoque usando un objeto de la clase en vez de tanto `static`.

En esta parte me quedó más claro el alcance (`scope`): si declaras algo dentro de un bloque (`if`, `for`, etc.), fuera de esas llaves ya no existe y da error de compilación. Con `static`, el dato queda ligado a la clase y se mantiene durante la ejecución (útil para contar llamadas), mientras que sin `static` toca crear una instancia (`new ...`) para usar los métodos de instancia.

Para correrlos: VS Code o `javac Archivo.java` seguido de `java Archivo`.
