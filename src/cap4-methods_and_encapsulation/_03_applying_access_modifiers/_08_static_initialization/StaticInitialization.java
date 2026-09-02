package methods_and_encapsulation._03_applying_access_modifiers._08_static_initialization;

// ====== INICIALIZADORES static ======
//
// Un bloque  static { ... }  se ejecuta UNA vez, cuando la clase se usa por primera vez.
// Sirve para armar una static que necesita varias lineas:
//   private static final int NUM_SECONDS_PER_HOUR;
//   static {
//       int min = 60, seg = 60;
//       NUM_SECONDS_PER_HOUR = min * seg;   // primera (y unica) asignacion -> OK
//   }
//
// Reglas de final en bloques static:
//   private static int one;              // no final: se puede asignar varias veces
//   private static final int two;        // final sin valor: se asigna 1 vez en el static
//   private static final int three = 3;  // final ya inicializado
//   private static final int four;       // NO COMPILA (final que nunca se inicializa)
//   static {
//       one = 1;      // OK
//       two = 2;      // OK (primera vez)
//       three = 3;    // NO COMPILA (three ya tenia valor)
//       two = 4;      // NO COMPILA (two ya se asigno arriba)
//   }
//
// EN CORTO: static { } corre 1 vez al usar la clase; una final se asigna exactamente
//           una vez (ahi o al declararla).

public class StaticInitialization {
}
