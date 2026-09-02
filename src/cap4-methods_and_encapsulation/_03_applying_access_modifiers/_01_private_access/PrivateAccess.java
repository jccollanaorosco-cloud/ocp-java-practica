package methods_and_encapsulation._03_applying_access_modifiers._01_private_access;

// ====== ACCESO private ======
//
// private = SOLO el codigo de la MISMA clase puede usar ese metodo o variable.
//
//   package pond.duck;
//   public class FatherDuck {
//       private String noise = "quack";
//       private void quack() { System.out.println(noise); } // OK, misma clase
//   }
//
// Otra clase NO puede tocar lo private (aunque este en el mismo paquete):
//   duck.quack();          // NO COMPILA (quack es private de FatherDuck)
//   System.out.println(duck.noise); // NO COMPILA (noise es private)
//
// EN CORTO: private = solo la misma clase. Nadie mas, ni en el mismo paquete.

public class PrivateAccess {
}
