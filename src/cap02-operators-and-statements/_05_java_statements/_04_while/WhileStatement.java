package operators_and_statements._05_java_statements._04_while;

// ====== WHILE (repite MIENTRAS se cumpla algo) ======
//
// Repite el bloque mientras la condicion sea true.
// Revisa la condicion ANTES de cada vuelta, asi que PODRIA no ejecutarse ni una vez.
//   while (bitesOfCheese > 0 && roomInBelly > 0) {
//       bitesOfCheese--;
//       roomInBelly--;
//   }
//
// CUIDADO con el bucle INFINITO: si nunca cambias la variable de la condicion,
// se repite para siempre.
//   int x = 2;
//   while (x < 10)
//       y++;        // x nunca cambia -> loop infinito
//
// EN CORTO: while repite mientras la condicion sea true; revisa antes de entrar
//           (puede correr 0 veces); asegurate de cambiar la variable o sera infinito.

public class WhileStatement {
}
