package java_building_blocks._10_destroying_objects._01_garbage_collection;

// ============ GARBAGE COLLECTION (recoleccion de basura) ============
//
// GC = Java libera memoria del heap borrando objetos que ya NO son "alcanzables".
//
// Puntos clave para el examen:
//   - System.gc() NO garantiza que corra: solo SUGIERE que Java recolecte.
//     Java puede ignorarlo.
//   - Un objeto es "elegible" para GC cuando ya no es alcanzable, o sea:
//       1) no queda ninguna referencia apuntandolo, o
//       2) todas sus referencias salieron de scope.
//   - Se recolecta el OBJETO, no la referencia (son cosas distintas:
//     la referencia tiene nombre; el objeto vive en el heap y no tiene nombre).
//
// ---- Ejemplo: cuando es elegible cada objeto ----
//   3: String one, two;
//   4: one = new String("a");   // objeto "a"
//   5: two = new String("b");   // objeto "b"
//   6: one = two;               // "a" queda SIN referencias -> "a" elegible AQUI (linea 6)
//   7: String three = one;      // three apunta a "b"
//   8: one = null;              // "b" aun tiene refs (two, three) -> NO elegible
//   9: }                        // "b" sale de scope al terminar el metodo (linea 9)
//
// TIP examen: dibuja cajas (objetos) y flechas (referencias) para no equivocarte.
//
// RESUMEN: un objeto es elegible para GC cuando nadie lo referencia o sus refs salen
//          de scope. System.gc() solo sugiere. Se recolecta el objeto, no la referencia.

public class GarbageCollection {
}