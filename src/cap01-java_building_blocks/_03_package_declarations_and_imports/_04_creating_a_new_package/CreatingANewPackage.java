package java_building_blocks._03_package_declarations_and_imports._04_creating_a_new_package;

// ================= CREATING A NEW PACKAGE (crear un paquete) =================
//
// El "default package" (paquete por defecto) es un paquete SIN NOMBRE.
// Se reconoce porque el archivo no tiene linea "package".
// Solo sirve para codigo de prueba/desechable.
// En la vida real: SIEMPRE nombra tus paquetes (evita choques de nombres
// y permite que otros reutilicen tu codigo).

// ---- Regla clave: la CARPETA refleja el nombre del paquete ----
// El nombre del paquete debe coincidir con la estructura de carpetas.

// ---- Ejemplo del libro (dos clases en dos paquetes) ----
//
// Archivo:  C:\temp\packagea\ClassA.java
//   package packagea;
//   public class ClassA {
//   }
//
// Archivo:  C:\temp\packageb\ClassB.java
//   package packageb;
//   import packagea.ClassA;    -> ClassB usa ClassA, por eso la importa
//   public class ClassB {
//     public static void main(String[] args) {
//       ClassA a;
//       System.out.println("Got it");
//     }
//   }
//
// Fijate: la carpeta "packagea" -> package packagea
//         la carpeta "packageb" -> package packageb

// ---- Por que funciona ----
// Al ejecutar desde C:\temp, Java encuentra ambos paquetes porque
// packagea y packageb estan DEBAJO de esa carpeta.

// ================= RESUMEN =================
// 1) Sin linea "package" = default package (solo para pruebas).
// 2) El nombre del paquete DEBE coincidir con la ruta de carpetas.
// 3) Una clase de otro paquete se usa importandola (import paquete.Clase).
// 4) Java busca los paquetes a partir de la carpeta raiz desde donde ejecutas.

public class CreatingANewPackage {
}