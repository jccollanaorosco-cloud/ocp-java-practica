package core_java_apis._02_using_the_stringbuilder_class._03_important_stringbuilder_methods;

// ====== METODOS IMPORTANTES DE StringBuilder ======
//
// charAt(), indexOf(), length(), substring() -> funcionan IGUAL que en String.
//   (ojo: substring() devuelve un String, NO cambia el StringBuilder)
//
// append(x) -> agrega x AL FINAL. Es el mas usado. Acepta casi cualquier tipo.
//   new StringBuilder().append(1).append('c').append("-").append(true) -> "1c-true"
//
// insert(posicion, x) -> mete x en esa posicion (las posiciones se corren!).
//   StringBuilder sb = new StringBuilder("animals");
//   sb.insert(7,"-"); // "animals-"
//   sb.insert(0,"-"); // "-animals-"
//   sb.insert(4,"-"); // "-ani-mals-"
//   (dibujalo, porque al insertar cambian las posiciones)
//
// delete(inicio, fin) / deleteCharAt(pos) -> borra un pedazo / una sola letra.
//   new StringBuilder("abcdef").delete(1,3) -> "adef"
//   deleteCharAt(5) sobre "adef" -> ERROR (ya no hay posicion 5)
//
// reverse() -> voltea el texto.
//   new StringBuilder("ABC").reverse() -> "CBA"
//
// toString() -> convierte el StringBuilder en un String normal.
//
// EN CORTO: append (agrega al final), insert (mete en una posicion),
//           delete (borra), reverse (voltea), toString (lo pasa a String).

public class ImportantStringBuilderMethods {
}
