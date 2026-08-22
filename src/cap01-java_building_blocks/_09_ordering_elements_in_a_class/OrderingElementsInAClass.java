package java_building_blocks._09_ordering_elements_in_a_class;

// ============ ORDERING ELEMENTS IN A CLASS ============
// (orden correcto de los elementos en un archivo)
//
// ---- Orden y si es obligatorio ----
//   1) package    -> opcional, pero si esta va PRIMERO (1ra linea no-comentario)
//   2) import     -> opcional, va JUSTO despues del package
//   3) class      -> OBLIGATORIA, despues de los imports
//   4) fields y methods -> opcionales, en cualquier orden DENTRO de la clase
//   * Los comentarios pueden ir en cualquier parte.
//
// Truco para recordar el orden: PIC (picture) = Package, Import, Class.
// (fields y methods: solo deben estar DENTRO de la clase)
//
// ---- OK ----
//   package structure;
//   import java.util.*;
//   public class Meerkat {
//     double weight;
//     public double getWeight() { return weight; }
//     double height;   // los fields no tienen que ir juntos
//   }
//
// ---- NO compila ----
//   import java.util.*;
//   package structure;   // DOES NOT COMPILE (package debe ir ANTES del import)
//   String name;         // DOES NOT COMPILE (un field no puede ir fuera de una clase)
//   public class Meerkat { }
//
// ---- Varias clases en un archivo ----
// Se permite, pero solo UNA puede ser public, y la public debe coincidir
// con el nombre del archivo. Ej. en Meerkat.java:
//   public class Meerkat { }
//   class Paw { }
// (tambien es valido que NINGUNA sea public)
//
// RESUMEN: orden PIC (package, import, class); fields/methods dentro de la clase
//          y en cualquier orden; solo una clase public por archivo (= nombre del archivo).

public class OrderingElementsInAClass {
}