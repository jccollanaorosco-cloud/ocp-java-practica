package operators_and_statements._05_java_statements._06_for;

// ====== FOR (repetir una cantidad conocida de veces) ======
//
// Estructura:  for (inicio; condicion; actualizacion) { cuerpo }
//   for (int i = 0; i < 10; i++) {
//       System.out.print(i + " ");   // imprime 0 1 2 3 4 5 6 7 8 9
//   }
//   Orden real: 1) inicio  2) revisa condicion  3) cuerpo  4) actualiza  5) vuelve al 2
//
// La variable del 'inicio' (i) SOLO vive dentro del for.
//
// 5 casos que salen en el examen:
//   1) INFINITO:  for( ; ; ) { ... }   // valido! los ; son obligatorios
//   2) VARIOS terminos:
//        for (long y=0, z=4; x<5 && y<10; x++, y++) { }   // OK
//   3) REDECLARAR la variable:
//        int x=0; for (long y=0, x=4; ...)   // NO COMPILA (x ya existia)
//   4) TIPOS distintos en el inicio:
//        for (long y=0, int x=4; ...)        // NO COMPILA (deben ser mismo tipo)
//   5) USAR la variable del for AFUERA:
//        for (long y=0, x=4; ...) {}  System.out.print(x);  // NO COMPILA (x murio con el for)
//
// ---- FOR-EACH (recorrer arrays o listas, mas comodo) ----
//   for (tipo elemento : coleccion) { ... }
//   String[] names = {"Lisa","Kevin","Roger"};
//   for (String name : names) { System.out.print(name + ", "); }
//   El lado derecho debe ser un array o algo Iterable (List, ArrayList).
//   El lado izquierdo debe ser del MISMO tipo que los elementos.
//     for (int name : names)  // NO COMPILA (names son String, no int)
//
// EN CORTO: for repite con contador (inicio; condicion; update); su variable solo
//           vive dentro; y el for-each recorre arrays/listas facilito.

public class ForStatement {
}
