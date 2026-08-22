package operators_and_statements._02_binary_arithmetic_operators._02_numeric_promotion;

// ====== PROMOCION NUMERICA (Java agranda tipos solo) ======
//
// A veces Java "promueve" (agranda) un tipo de dato automaticamente para que
// dos valores se puedan operar juntos. Piensa en tamanos:
//   byte < short < int < long < float < double
//
// Las 4 reglas:
//   1) Si dos valores son de tipos distintos, Java sube el mas chico al tipo del mas grande.
//   2) Si uno es entero y el otro con decimales, el entero se vuelve decimal.
//   3) byte, short y char SIEMPRE se vuelven int cuando se usan con un operador
//      aritmetico binario (aunque ninguno sea int).
//   4) Despues de todos esos cambios, el resultado tiene el tipo ya promovido.
//
// OJO: los unarios (++ --) NO cuentan para la regla 3.
//      (aplicar ++ a un short sigue dando short)
//
// Ejemplos:
//   int x=1; long y=33;    ->  x*y es LONG (int subio a long)
//   short x=10, y=3;       ->  x/y es INT  (short suben a int por la regla 3)
//   short x; float y; double z; -> x*y/z es DOUBLE (todo termina subiendo a double)
//
// TRAMPA famosa:
//   double x = 39.21;
//   float y = 2.1;         // OJO: 2.1 se toma como double
//   double r = x + y;      // NO COMPILA, porque y no cabe (falto la f: 2.1f)
//
// EN CORTO: Java agranda solo el tipo mas chico para poder operar;
//           byte/short/char se vuelven int al operar; el resultado toma el tipo grande.

public class NumericPromotion {
}
