package operators_and_statements._04_additional_binary_operators._01_assignment_operators;

// ====== OPERADOR DE ASIGNACION  =  ======
//
// El =  guarda en la variable de la IZQUIERDA el valor de la DERECHA.
//   int x = 1;   // x ahora vale 1
//
// Java agranda solo (chico -> grande), pero si intentas meter algo GRANDE en
// una variable CHICA, se queja (error), salvo que uses un "cast".
//
// Estas NO compilan:
//   int x = 1.0;                 // 1.0 es double, no cabe en int
//   short y = 1921222;           // ese numero es muy grande para short
//   int z = 9f;                  // la f lo hace float
//   long t = 192301398193810323; // Java lo lee como int y no cabe (faltaria una L)
//
// Se arreglan con CAST (forzar el tipo con parentesis):
//   int x = (int)1.0;
//   short y = (short)1921222;    // aqui pasa algo raro: se guarda como 20678 (overflow)
//   int z = (int)9l;
//   long t = 192301398193810323L;
//
// OVERFLOW: cuando un numero es tan grande que no cabe, "da la vuelta" y sale negativo.
//   System.out.print(2147483647 + 1);  // -2147483648  (2147483647 es el int maximo)
//
// Caso clasico:
//   short x = 10, y = 3;
//   short z = x * y;         // NO COMPILA (short*short se vuelve int)
//   short z = (short)(x*y);  // asi SI (le dices "yo me hago cargo")
//
// Dato curioso: una asignacion tambien "vale" su valor:
//   long y = (x = 3);   // x queda en 3 y ademas y tambien queda en 3
//
// EN CORTO: = guarda de derecha a izquierda; de grande a chico necesitas cast;
//           si no cabe, hay overflow (da la vuelta).

public class AssignmentOperators {
}
