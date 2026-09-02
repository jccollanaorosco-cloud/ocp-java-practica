package methods_and_encapsulation._08_writing_simple_lambdas._01_lambda_example;

// ====== EJEMPLO DE LAMBDA (por que sirven) ======
//
// Una lambda es un "bloquecito de codigo" que puedes pasar como si fuera un valor.
// Piensa en ella como un metodo SIN NOMBRE que pasas a otro metodo.
//
// Problema sin lambdas: para cada chequeo (puede saltar? puede nadar?) necesitabas
// crear una clase entera (CheckIfHopper, CheckIfSwims...). Mucho codigo para algo simple.
//
// Con lambdas, pasas el chequeo en una linea:
//   print(animals, a -> a.canHop());       // los que pueden saltar
//   print(animals, a -> a.canSwim());      // los que pueden nadar
//   print(animals, a -> ! a.canSwim());    // los que NO pueden nadar
//
// Esto usa "ejecucion diferida": escribes el codigo ahora, pero corre despues
// (cuando el metodo print lo llama por dentro).
//
// EN CORTO: una lambda es un metodo sin nombre que pasas como valor; evita crear
//           una clase entera para cada cosita.

public class LambdaExample {
}
