package methods_and_encapsulation._06_creating_constructors._02_default_constructor;

// ====== CONSTRUCTOR POR DEFECTO ======
//
// Si NO escribes NINGUN constructor, Java te crea uno vacio y sin parametros
// (el "default constructor"). Es como si hubieras escrito:  public Rabbit() {}
//
// SOLO se crea si no hay NINGUN constructor. Ejemplos:
//   class Rabbit1 { }                          // SI recibe el default
//   class Rabbit2 { public Rabbit2() {} }      // NO (ya tiene uno)
//   class Rabbit3 { public Rabbit3(boolean b){} } // NO (ya tiene uno)
//   class Rabbit4 { private Rabbit4() {} }     // NO (ya tiene uno, ademas private)
//
//   new Rabbit1();       // OK (default)
//   new Rabbit4();       // NO COMPILA desde afuera (constructor private)
//
// Un constructor private impide que otros creen objetos y que Java ponga el default.
// (util para clases con solo metodos static, o que controlan como se crean).
//
// EN CORTO: si no escribes constructor, Java pone uno vacio; si escribes cualquiera
//           (aunque sea private), ya no te pone el default.

public class DefaultConstructor {
}
