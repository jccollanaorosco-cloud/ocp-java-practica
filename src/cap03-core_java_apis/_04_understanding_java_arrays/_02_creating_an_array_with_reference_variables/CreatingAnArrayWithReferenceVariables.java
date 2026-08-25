package core_java_apis._04_understanding_java_arrays._02_creating_an_array_with_reference_variables;

// ====== ARRAYS DE OBJETOS (referencias) ======
//
// El array puede ser de cualquier tipo, hasta de tus propias clases o de String.
//   String[] bugs = { "cricket", "beetle", "ladybug" };
//   String[] alias = bugs;              // alias apunta al MISMO array
//   bugs.equals(alias) -> true          (mismo objeto)
//
// El array NO guarda los objetos adentro: guarda "flechas" (referencias) que
// apuntan a donde estan los objetos de verdad.
//
// Si NO lo creas, apunta a null:
//   String[] names;              // null (no existe todavia)
//   String[] names = new String[2];  // array de 2 casilleros, cada uno en null
//
// Casteo con arrays (forzar tipos):
//   String[] strings = { "hola" };
//   Object[] objects = strings;               // ok (Object es mas general)
//   String[] otra = (String[]) objects;       // ok (casteo a algo mas especifico)
//   otra[0] = new StringBuilder();            // NO COMPILA (un String[] solo guarda String)
//   objects[0] = new StringBuilder();         // compila, pero EXPLOTA al correr (ArrayStoreException)
//
// EN CORTO: un array de objetos guarda flechas a los objetos; sin crear vale null;
//           meter el tipo equivocado da error.

public class CreatingAnArrayWithReferenceVariables {
}
