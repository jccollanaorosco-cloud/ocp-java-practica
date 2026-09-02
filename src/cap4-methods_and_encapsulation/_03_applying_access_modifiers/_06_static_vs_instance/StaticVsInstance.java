package methods_and_encapsulation._03_applying_access_modifiers._06_static_vs_instance;

// ====== static vs instance (quien puede llamar a quien) ======
//
// REGLA CLAVE: un metodo static NO puede llamar directo a algo de instancia (no-static),
// porque el static no tiene un objeto detras.
//
//   public class Static {
//       private String name = "...";           // instancia
//       public static void first() { }          // static
//       public void third() { ... name ... }    // instancia (usa name)
//       public static void main(String[] a) {
//           first();    // OK (static llama static)
//           third();    // NO COMPILA (static NO puede llamar a un metodo de instancia)
//       }
//   }
//
// Tabla:
//   static -> static:      SI (por nombre de clase)
//   static -> instancia:   NO
//   instancia -> static:   SI
//   instancia -> instancia:SI
//
// Otro ejemplo:
//   public static int count;
//   public static void addGorilla() { count++; }   // OK (static usa static)
//   public void babyGorilla() { count++; }          // OK (instancia usa static)
//   public static void announceToEveryone() {
//       addGorilla();    // OK
//       babyGorilla();   // NO COMPILA (static no puede llamar instancia)
//   }
//
// EN CORTO: static solo llama static; instancia puede llamar a los dos.

public class StaticVsInstance {
}
