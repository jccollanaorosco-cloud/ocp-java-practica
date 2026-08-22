package java_building_blocks._04_creating_objects._04_order_of_initialization;

// ============ ORDER OF INITIALIZATION (orden de inicializacion) ============
//
// Reglas:
//   1) Campos e instance initializers { } corren en el ORDEN en que aparecen.
//   2) El constructor corre AL FINAL (despues de todos ellos).
//
// Ejemplo 1:
//   private String name = "Fluffy";              // 1ro
//   { System.out.println("setting field"); }     // 2do
//   public Chick() { name = "Tiny"; ... }         // 3ro (constructor)
//   Salida:  setting field / setting constructor / Tiny
//   (name termina en "Tiny" porque el constructor corre al final y lo pisa)
//
// OJO: no puedes usar un campo antes de declararlo:
//   { System.out.println(name); }   // DOES NOT COMPILE
//   private String name = "Fluffy";
//
// Ejemplo 2 (imprime 5):
//   private int number = 3;   // 1ro -> 3
//   { number = 4; }           // 2do -> 4
//   public Egg() { number = 5; } // constructor al final -> 5
//
// RESUMEN: campos + initializers en orden de aparicion, y el constructor al ultimo.
//          No se puede referenciar un campo antes de declararlo (no compila).

public class OrderOfInitialization {
}