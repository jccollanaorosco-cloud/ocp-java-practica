package methods_and_encapsulation._03_applying_access_modifiers._04_public_access;

// ====== ACCESO public ======
//
// public = cualquiera, desde cualquier paquete, puede usarlo. El mas abierto y facil.
//
//   package pond.duck;
//   public class DuckTeacher {
//       public String name = "helpful";
//       public void swim() { ... }
//   }
//
//   // desde OTRO paquete:
//   teacher.swim();      // OK
//   teacher.name;        // OK
//
// TABLA RESUMEN (puede acceder?):
//                                   private  default  protected  public
//   misma clase                       SI       SI        SI        SI
//   otra clase, mismo paquete         NO       SI        SI        SI
//   subclase, otro paquete            NO       NO        SI        SI
//   no-subclase, otro paquete         NO       NO        NO        SI
//
// EN CORTO: public = todos, desde donde sea.

public class PublicAccess {
}
