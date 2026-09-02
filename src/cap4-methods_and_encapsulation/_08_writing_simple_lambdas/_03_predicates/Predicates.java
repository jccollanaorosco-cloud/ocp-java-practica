package methods_and_encapsulation._08_writing_simple_lambdas._03_predicates;

// ====== PREDICATE (interfaz lista para lambdas) ======
//
// Las lambdas funcionan con interfaces de UN solo metodo (interfaces funcionales).
// En vez de crear tu propia interfaz cada vez, Java ya trae una: Predicate.
//   import java.util.function.*;
//   public interface Predicate<T> { boolean test(T t); }   // recibe algo, devuelve boolean
//
// Asi la usas (T es el tipo, aqui Animal):
//   private static void print(List<Animal> animals, Predicate<Animal> checker) {
//       for (Animal a : animals)
//           if (checker.test(a)) System.out.print(a + " ");
//   }
//   print(animals, a -> a.canHop());   // le pasas la lambda
//
// Java ya metio Predicate en ArrayList con removeIf(): borra los que cumplan la condicion:
//   List<String> bunnies = new ArrayList<>();  // [long ear, floppy, hoppy]
//   bunnies.removeIf(s -> s.charAt(0) != 'h'); // quita los que NO empiezan con 'h'
//   // queda: [hoppy]
//
// EN CORTO: Predicate<T> es una interfaz con test() que devuelve boolean; sirve para
//           lambdas sin crear tu propia interfaz; removeIf() la usa para borrar por condicion.

public class Predicates {
}
