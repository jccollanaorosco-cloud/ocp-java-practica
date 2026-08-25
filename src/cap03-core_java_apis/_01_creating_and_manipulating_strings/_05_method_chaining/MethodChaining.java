package core_java_apis._01_creating_and_manipulating_strings._05_method_chaining;

// ====== ENCADENAR METODOS (method chaining) ======
//
// Es llamar varios metodos pegados en una sola linea, uno tras otro.
//
// Forma larga (paso a paso):
//   String start = "AniMaL ";
//   String a = start.trim();          // "AniMaL"
//   String b = a.toLowerCase();       // "animal"
//   String c = b.replace('a','A');    // "Animal"
//
// Forma encadenada (lo mismo, mas corto):
//   String result = "AniMaL ".trim().toLowerCase().replace('a','A'); // "Animal"
//
// Como se lee: empieza por la IZQUIERDA, resuelve el primer metodo, y con ese
// resultado llama el siguiente, y asi hasta el punto y coma.
//
// OJO (String es inmutable):
//   String a = "abc";
//   String b = a.toUpperCase();               // "ABC"
//   b = b.replace("B","2").replace('C','3');  // "A23"
//   a NUNCA cambia (sigue "abc"); b termina en "A23".
//
// EN CORTO: encadenar = pegar metodos en una linea; se leen de izq a der;
//           el String original nunca cambia.

public class MethodChaining {
}
