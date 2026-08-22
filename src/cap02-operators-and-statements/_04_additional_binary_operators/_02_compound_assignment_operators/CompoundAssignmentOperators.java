package operators_and_statements._04_additional_binary_operators._02_compound_assignment_operators;

// ====== ASIGNACION COMPUESTA  +=  -=  *=  etc ======
//
// Son atajos. En vez de escribir la variable dos veces:
//   x = x * z;   // forma larga
//   x *= z;      // forma corta (hace lo mismo)
//
// Para el examen bastan  +=  y  -=  (pero todas funcionan igual).
//
// Regla: solo sirven sobre variables que YA existen (no puedes declarar con ellas).
//
// Lo mas util: hacen el CAST solo, sin que tu lo pongas.
//   long x = 10;
//   int y = 5;
//   y = y * x;   // NO COMPILA (y*x se vuelve long y no cabe en int)
//   y *= x;      // SI compila: Java castea el resultado a int automaticamente
//
// EN CORTO: x *= z  es lo mismo que  x = x*z, pero mas corto y ademas
//           castea solo al tipo de la izquierda.

public class CompoundAssignmentOperators {
}
