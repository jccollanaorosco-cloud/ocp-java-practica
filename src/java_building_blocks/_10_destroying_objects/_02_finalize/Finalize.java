package java_building_blocks._10_destroying_objects._02_finalize;

// ============ finalize() ============
//
// Un objeto puede implementar el metodo finalize(), que PODRIA ejecutarse
// cuando el garbage collector intenta recolectar ese objeto.
//
// Reglas clave (lo unico que importa para el examen):
//   - Si el GC no corre -> finalize() NO se llama.
//   - finalize() se ejecuta CERO o UNA vez. NUNCA dos veces.
//   - En la practica casi no se usa.
//
// ---- Ejemplo 1: no imprime nada ----
//   protected void finalize() { System.out.println("Calling finalize"); }
//   public static void main(String[] args) {
//     Finalizer f = new Finalizer();
//   }
// -> el programa termina antes de que haga falta correr el GC, asi que
//    finalize() no llega a ejecutarse (0 veces).
//
// ---- Ejemplo 2 (el truco) ----
//   protected void finalize() { objects.add(this); }  // objects es static
// -> al agregarse a una lista static, el objeto vuelve a ser alcanzable
//    (los static viven hasta que acaba el programa) y Java aborta borrarlo.
//    Si luego objects = null y se recolecta, Java NO vuelve a llamar finalize()
//    porque ya lo corrio una vez.
//
// RESUMEN: finalize() puede correr 0 o 1 vez, nunca dos. Si el GC no actua, no se llama.

public class Finalize {
}