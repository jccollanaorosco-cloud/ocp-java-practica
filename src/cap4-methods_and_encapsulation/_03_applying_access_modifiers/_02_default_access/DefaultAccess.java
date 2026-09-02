package methods_and_encapsulation._03_applying_access_modifiers._02_default_access;

// ====== ACCESO default (package private) ======
//
// default = sin escribir modificador. Lo pueden usar las clases del MISMO paquete.
//
//   package pond.duck;
//   public class MotherDuck {
//       String noise = "quack";          // sin modificador = default
//       void quack() { ... }             // default
//   }
//
// Una clase del MISMO paquete SI puede usarlo:
//   duck.quack();   duck.noise;   // OK si estan en pond.duck
//
// Una clase de OTRO paquete NO:
//   package pond.swan;   // paquete distinto
//   duck.quack();        // NO COMPILA (default no cruza de paquete)
//
// EN CORTO: default (sin palabra) = misma clase + mismo paquete; no cruza a otro paquete.

public class DefaultAccess {
}
