package core_java_apis._01_creating_and_manipulating_strings._03_the_string_pool;

// ====== EL "POZO" DE STRINGS (string pool) ======
//
// Como los textos se usan MUCHISIMO, Java ahorra memoria REUSANDO los repetidos.
// Ese almacen de textos se llama string pool (o pozo de strings).
//
// Solo entran los textos "literales" (los que escribes con comillas):
//   "name"  -> literal, SI entra al pozo.
//   algo.toString() -> NO es literal, NO entra al pozo.
//
// Dos formas de crear un String que se ven iguales pero NO lo son:
//   String a = "Fluffy";              // usa el pozo (eficiente, lo normal)
//   String b = new String("Fluffy");  // con new: OBLIGA a crear un objeto NUEVO
//                                     // aparte, aunque sea menos eficiente
//
// En tu codigo normal NO usarias new para textos. Para el examen: debes saber
// que se PUEDE, y que new hace un objeto separado.
//
// EN CORTO: Java reusa textos repetidos (el pozo). "texto" entra al pozo;
//           new String("texto") crea uno aparte a proposito.

public class TheStringPool {
}
