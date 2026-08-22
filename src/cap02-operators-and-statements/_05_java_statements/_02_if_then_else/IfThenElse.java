package operators_and_statements._05_java_statements._02_if_then_else;

// ====== IF-THEN-ELSE (si no... entonces) ======
//
// else es el "en caso contrario". else if encadena mas casos:
//   if (hourOfDay < 11) {
//       System.out.println("Buenos dias");
//   } else if (hourOfDay < 15) {
//       System.out.println("Buenas tardes");
//   } else {
//       System.out.println("Buenas noches");
//   }
//   Java prueba de arriba a abajo y se queda en el PRIMERO que sea true.
//
// EL ORDEN IMPORTA (codigo inalcanzable):
//   if (hourOfDay < 15) { ... }
//   else if (hourOfDay < 11) { ... }   // NUNCA se llega aqui!
//   Porque si algo es < 11, tambien es < 15, asi que ya entro arriba.
//
// El if PIDE un boolean de verdad:
//   if (x) { }        // NO COMPILA si x es int (0 y 1 no son boolean en Java)
//   if (x = 5) { }    // NO COMPILA (eso es asignacion =, no comparacion ==)
//
// ---- TERNARIO  ? :  (un if-then-else que DEVUELVE un valor) ----
//   int x = (y > 5) ? (2 * y) : (3 * y);
//   se lee:  condicion ? valorSiTrue : valorSiFalse
//   Solo se evalua UNA de las dos ramas.
//   Los dos lados pueden ser de tipos distintos, pero al ASIGNAR importa:
//     System.out.println((y > 5) ? 21 : "Zebra");   // OK (println acepta ambos)
//     int animal = (y < 91) ? 9 : "Horse";          // NO COMPILA ("Horse" no es int)
//
// EN CORTO: else = lo contrario; else if encadena; el orden puede dejar codigo muerto;
//           el if necesita boolean; el ternario ?: es un if corto que devuelve valor.

public class IfThenElse {
}
