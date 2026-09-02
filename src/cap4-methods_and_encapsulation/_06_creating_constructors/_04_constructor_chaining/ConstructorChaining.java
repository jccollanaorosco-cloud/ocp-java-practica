package methods_and_encapsulation._06_creating_constructors._04_constructor_chaining;

// ====== ENCADENAR CONSTRUCTORES (constructor chaining) ======
//
// Tecnica comun: cada constructor agrega un parametro y llama al siguiente con this(),
// hasta el que hace todo el trabajo.
//
//   public Mouse(int weight) { this(weight, 16); }
//   public Mouse(int weight, int numTeeth) { this(weight, numTeeth, 6); }
//   public Mouse(int weight, int numTeeth, int numWhiskers) {
//       this.weight = weight; this.numTeeth = numTeeth; this.numWhiskers = numWhiskers;
//   }
//
//   new Mouse(15).print();   // imprime  15 16 6
//   (el de 1 parametro llama al de 2, que llama al de 3, que asigna todo)
//
// EN CORTO: cada constructor llama al siguiente con this(), agregando valores por
//           defecto, hasta el que asigna todos los campos.

public class ConstructorChaining {
}
