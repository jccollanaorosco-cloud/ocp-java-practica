package operators_and_statements._03_unary_operators._01_logical_complement_and_negation;

// ====== OPERADORES !  y  -  (voltear valores) ======
//
// El signo !  (complemento logico) VOLTEA un boolean:
//   true  se vuelve  false
//   false se vuelve  true
//   Ej:  boolean x = false;  x = !x;  ->  ahora x es true
//
// El signo -  (negacion) cambia el signo de un numero:
//   double x = 1.21;  x = -x;  ->  -1.21   y otra vez -x -> 1.21
//
// NO se pueden mezclar tipos. Estas NO compilan:
//   int x = !5;         // ! es solo para boolean, no para numeros
//   boolean y = -true;  // el - es solo para numeros, no para boolean
//   boolean z = !0;     // no puedes voltear un numero, ni meter numero en boolean
//
// SUPER IMPORTANTE: en Java, 1 NO es lo mismo que true, y 0 NO es lo mismo que false.
// (en otros lenguajes si, pero aqui no).
//
// EN CORTO: !  voltea booleanos;  -  cambia el signo de numeros; no se mezclan.

public class LogicalComplementAndNegation {
}
