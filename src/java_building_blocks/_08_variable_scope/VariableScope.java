package java_building_blocks._08_variable_scope;

// ============ VARIABLE SCOPE (alcance de las variables) ============
//
// Scope = donde una variable "existe" y se puede usar.
// Cada par de llaves { } es un BLOQUE nuevo, y cada bloque tiene su scope.
//
// ---- Locales ----
// Los parametros del metodo y las declaradas dentro son locales.
//   public void eat(int piecesOfCheese) {  // parametro: local a todo el metodo
//     int bitesOfCheese = 1;               // local al metodo
//   }
//
// Una local NUNCA sale del metodo, pero puede tener scope MENOR:
//   if (hungry) { int bitesOfCheese = 1; } // solo existe dentro del if
//   System.out.println(bitesOfCheese);     // DOES NOT COMPILE (ya salio de scope)
//
// Un bloque interno SI puede usar variables del bloque externo, pero NO al reves.
//
// ---- Como resolverlo (truco examen) ----
// 1) Identifica los bloques contando pares de { } (de adentro hacia afuera).
// 2) Cada variable vive desde donde se declara hasta que cierra SU bloque.
//
// Ejemplo Mouse (4 variables):
//   static int MAX_LENGTH = 5;  // class variable (static): vive hasta que ACABA el programa
//   int length;                 // instance variable: vive mientras exista el objeto
//   public void grow(int inches){   // inches: local, hasta fin del metodo
//     if (length < MAX_LENGTH) {
//       int newSize = length + inches; // local al if: muere al cerrar el if
//     }
//   }
//
// ================= RESUMEN (reglas de scope) =================
//   Local     -> desde su declaracion hasta que cierra su bloque { }.
//   Instance  -> desde su declaracion hasta que el objeto es recolectado (GC).
//   Class(static) -> desde su declaracion hasta que TERMINA el programa.

public class VariableScope {
}