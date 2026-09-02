package methods_and_encapsulation._01_designing_methods._02_access_modifiers;

// ====== MODIFICADORES DE ACCESO (quien puede llamar) ======
//
// 4 opciones, de mas cerrado a mas abierto:
//   private   -> solo la MISMA clase.
//   (default) -> misma clase + clases del MISMO paquete. (NO se escribe nada!)
//   protected -> lo de default + las SUBCLASES (aunque esten en otro paquete).
//   public    -> cualquiera, desde donde sea.
//
// OJO: "default" NO se escribe. Simplemente NO pones modificador.
//   (existe la palabra 'default' en Java, pero es del switch/interfaces, no de acceso)
//
// Que compila y que no:
//   public void walk1() {}      // OK (public)
//   default void walk2() {}     // NO COMPILA (default no se escribe)
//   void public walk3() {}      // NO COMPILA (el acceso va ANTES del tipo)
//   void walk4() {}             // OK (acceso default = sin palabra)
//
// EN CORTO: private < default(sin palabra) < protected < public.
//           El modificador va al inicio, antes del tipo de retorno.

public class AccessModifiers {
}
