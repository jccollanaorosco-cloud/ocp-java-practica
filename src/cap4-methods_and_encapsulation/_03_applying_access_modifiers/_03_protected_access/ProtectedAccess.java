package methods_and_encapsulation._03_applying_access_modifiers._03_protected_access;

// ====== ACCESO protected ======
//
// protected = todo lo de default (mismo paquete) + las SUBCLASES (aunque esten en
// otro paquete). Una subclase "hereda" con extends.
//
//   package pond.shore;
//   public class Bird { protected String text = "floating"; protected void floatInWater(){} }
//
//   package pond.goose;
//   public class Gosling extends Bird {   // subclase en otro paquete
//       public void swim() { floatInWater(); System.out.println(text); } // OK (hereda)
//   }
//
// EL GOTCHA (lo mas confuso del examen): con protected desde otro paquete,
//   - si usas el miembro SIN variable (por herencia) -> OK.
//   - si lo usas A TRAVES de una VARIABLE, el tipo de esa variable debe ser tu clase
//     o subclase tuya; si es del tipo padre (Bird), NO compila.
//
//   class Swan extends Bird {                 // Swan esta en otro paquete que Bird
//       void a() { floatInWater(); }          // OK (por herencia, sin variable)
//       void b() { Swan o = new Swan(); o.floatInWater(); } // OK (variable tipo Swan)
//       void c() { Bird o = new Bird(); o.floatInWater(); } // NO COMPILA (variable tipo Bird)
//   }
//
// EN CORTO: protected = mismo paquete + subclases. Ojo: por herencia OK, pero a traves
//           de una variable, el tipo debe ser tu clase/subclase, no el padre.

public class ProtectedAccess {
}
