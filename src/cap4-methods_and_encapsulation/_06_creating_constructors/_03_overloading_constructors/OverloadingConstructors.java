package methods_and_encapsulation._06_creating_constructors._03_overloading_constructors;

// ====== SOBRECARGAR CONSTRUCTORES (this()) ======
//
// Puedes tener varios constructores si tienen DISTINTOS parametros.
//   public Hamster(int weight) { ... }
//   public Hamster(int weight, String color) { ... }
//
// Para que uno llame a OTRO constructor, se usa  this(...)  (NO new, NO el nombre):
//   public Hamster(int weight) {
//       Hamster(weight, "brown");     // NO COMPILA (no se llama asi)
//       new Hamster(weight, "brown"); // compila pero crea OTRO objeto (mal!)
//       this(weight, "brown");        // CORRECTO: llama al otro constructor de ESTE objeto
//   }
//
// REGLA de this(): debe ser la PRIMERA linea (sin contar comentarios):
//   public Hamster(int weight) {
//       System.out.println("in constructor");  // esto ANTES rompe...
//       this(weight, "brown");                  // NO COMPILA (this() debe ir primero)
//   }
//
// EN CORTO: varios constructores con parametros distintos; this(...) llama a otro
//           constructor y DEBE ir en la primera linea.

public class OverloadingConstructors {
}
