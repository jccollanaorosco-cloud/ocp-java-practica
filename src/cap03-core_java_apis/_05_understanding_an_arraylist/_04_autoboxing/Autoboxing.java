package core_java_apis._05_understanding_an_arraylist._04_autoboxing;

// ====== AUTOBOXING (Java convierte primitivo <-> wrapper solo) ======
//
// Desde Java 5, puedes escribir el primitivo y Java lo mete solito en su wrapper.
//   List<Double> weights = new ArrayList<>();
//   weights.add(50.5);              // Java convierte double 50.5 -> Double (autoboxing)
//   double first = weights.get(0);  // Double -> double (unboxing)
//
// CUIDADO con null:
//   List<Integer> heights = new ArrayList<>();
//   heights.add(null);           // permitido
//   int h = heights.get(0);      // ERROR (NullPointerException: no puede sacar int de null)
//
// TRAMPA famosa con Integer y remove:
//   List<Integer> numbers = new ArrayList<>();
//   numbers.add(1); numbers.add(2);   // [1, 2]
//   numbers.remove(1);                 // OJO: quita el de la POSICION 1 (el 2), no el numero 1!
//   System.out.println(numbers);       // [1]
//   Como ya existe remove(int posicion), Java usa esa y NO hace autoboxing.
//   Si quieres quitar el NUMERO 2: numbers.remove(new Integer(2));
//
// EN CORTO: Java convierte primitivo<->wrapper solo; cuidado: sacar de un null explota,
//           y remove(1) quita la POSICION 1, no el numero 1.

public class Autoboxing {
}
