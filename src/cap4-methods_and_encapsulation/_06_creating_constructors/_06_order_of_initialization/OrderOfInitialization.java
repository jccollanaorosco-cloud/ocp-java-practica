package methods_and_encapsulation._06_creating_constructors._06_order_of_initialization;

// ====== ORDEN DE INICIALIZACION (memorizar!) ======
//
// Cuando creas un objeto, Java ejecuta en ESTE orden:
//   1) Si hay superclase, se inicializa primero (Cap 5).
//   2) Variables static y bloques static, en el ORDEN en que aparecen.
//   3) Variables de instancia y bloques de instancia, en orden de aparicion.
//   4) El constructor.
//
// OJO: las reglas 3 y 4 SOLO corren si creas un objeto (new). Si solo usas la clase
// sin new, corren solo 1 y 2.
//
// Ejemplo:
//   private String name = "Torchie";
//   { System.out.println(name); }
//   private static int COUNT = 0;
//   static { System.out.println(COUNT); }
//   static { COUNT += 10; System.out.println(COUNT); }
//   public Init() { System.out.println("constructor"); }
//   // Salida al hacer new Init():  0  10  Torchie  constructor
//   // (primero los static en orden: 0 y 10; luego instancia: Torchie; luego constructor)
//
// EN CORTO: 1 superclase, 2 statics (en orden), 3 instancia (en orden), 4 constructor.

public class OrderOfInitialization {
}
