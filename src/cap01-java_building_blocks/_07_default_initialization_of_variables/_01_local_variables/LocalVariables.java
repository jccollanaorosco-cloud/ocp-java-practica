package java_building_blocks._07_default_initialization_of_variables._01_local_variables;

// ============ LOCAL VARIABLES (variables locales) ============
//
// Variable local = la que se define DENTRO de un metodo.
// Regla: DEBEN inicializarse antes de usarse. No tienen valor por defecto
//        (contienen "basura") y el compilador NO te deja leerlas sin inicializar.
//
// ---- NO compila (x sin inicializar) ----
//   int y = 10;
//   int x;                 // declarada pero SIN valor
//   int reply = x + y;     // DOES NOT COMPILE (usa x sin inicializar)
//
// ---- SI compila (inicializada antes de usarla) ----
//   int x;         // declarada aqui
//   x = 3;         // inicializada aqui (antes de usarla)
//   int reply = x + y;   // OK
//
// ---- Caso con ramas if/else ----
//   int answer;
//   int onlyOneBranch;
//   if (check) {
//     onlyOneBranch = 1;
//     answer = 1;
//   } else {
//     answer = 2;         // answer se inicializa en AMBAS ramas -> OK
//   }
//   System.out.println(answer);          // OK
//   System.out.println(onlyOneBranch);   // DOES NOT COMPILE
//   (onlyOneBranch solo se inicializa si check es true; si es false queda sin valor)
//
// RESUMEN: una variable local no tiene valor por defecto; hay que inicializarla
//          antes de usarla. Si hay if/else, debe quedar inicializada en TODAS las ramas.

public class LocalVariables {
}