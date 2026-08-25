package core_java_apis._03_understanding_equality;

// ====== IGUALDAD:  ==  vs  .equals() ======
//
// ==  con OBJETOS pregunta: "son EL MISMO objeto?" (misma direccion en memoria),
//     NO si tienen el mismo contenido.
//
//   StringBuilder one = new StringBuilder();
//   StringBuilder two = new StringBuilder();
//   StringBuilder three = one.append("a");
//   one == two   -> false  (son 2 objetos distintos)
//   one == three -> true   (append devuelve el MISMO objeto, asi que apuntan igual)
//
// Con STRINGS se pone raro por el "pozo" (string pool):
//   String x = "Hello World";
//   String y = "Hello World";
//   x == y   -> true   (los dos literales apuntan al MISMO del pozo)
//
//   String z = " Hello World".trim();   // se calcula en tiempo de EJECUCION
//   x == z   -> false  (z es un objeto NUEVO, no el del pozo)
//
//   String w = new String("Hello World");
//   x == w   -> false  (new obliga a un objeto aparte)
//
// LECCION: NUNCA uses == para comparar el CONTENIDO de textos. Usa .equals():
//   x.equals(z) -> true   (equals compara las LETRAS de adentro)
//
// Dato: String tiene equals() (compara contenido). StringBuilder NO lo tiene
// (su equals compara si son el mismo objeto, igual que ==).
//
// EN CORTO: == pregunta "mismo objeto?"; .equals() pregunta "mismo contenido?".
//           Para textos, usa SIEMPRE .equals().

public class UnderstandingEquality {
}
