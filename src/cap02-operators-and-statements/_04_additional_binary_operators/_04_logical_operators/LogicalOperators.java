package operators_and_statements._04_additional_binary_operators._04_logical_operators;

// ====== OPERADORES LOGICOS  &  |  ^   y corto-circuito  &&  || ======
//
// Con booleanos, se leen asi (piensa en un truco para recordarlos):
//   &  (AND, "y")            -> true SOLO si AMBOS son true
//   |  (OR inclusivo, "o")   -> false SOLO si AMBOS son false
//   ^  (OR exclusivo, "xor") -> true SOLO si son DIFERENTES
//
// (con numeros hacen cosas bit a bit, pero eso NO entra al examen)
//
// Los de CORTO CIRCUITO  &&  y  ||  son casi iguales a & y |, PERO:
// si con el lado izquierdo ya se sabe el resultado, NO evaluan el derecho.
//   boolean x = true || (y < 4);   // como la izq ya es true, ni mira la derecha
//
// Por eso son utiles para revisar null sin que explote el programa:
//   if (x != null && x.getValue() < 5) { ... }
//   Si x es null, el && corta y NUNCA llama x.getValue() -> no hay error.
//   Con & (sin corto) SI evaluaria ambos y reventaria con NullPointerException.
//
// TRAMPA de examen:
//   int x = 6;
//   boolean y = (x >= 6) || (++x <= 7);
//   Como (x>=6) ya es true, el ++x NUNCA se ejecuta -> x sigue siendo 6.
//
// EN CORTO: & (y), | (o), ^ (distintos). Los dobles && || cortan si ya saben
//           el resultado, y por eso protegen de errores tipo null.

public class LogicalOperators {
}
