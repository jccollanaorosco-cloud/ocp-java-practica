package core_java_apis._05_understanding_an_arraylist._02_using_an_arraylist;

// ====== USAR UN ArrayList (metodos) ======
//
// Nota: en las firmas veras "E". No es una clase real: significa "el tipo que guarda
// la lista" (lo que pusiste entre < >). Si no pusiste tipo, E es Object.
// Ademas, ArrayList tiene toString(), asi que puedes imprimirlo y se ve bonito.
//
// add(elemento) / add(indice, elemento) -> agrega (al final, o en una posicion).
//   List<String> birds = new ArrayList<>();
//   birds.add("hawk");        // [hawk]
//   birds.add(1, "robin");    // [hawk, robin]
//   birds.add(0, "blue jay"); // [blue jay, hawk, robin]
//   (con <String> solo deja meter String; si no pones tipo, entra cualquier cosa)
//
// remove(objeto) / remove(indice) -> quita.
//   remove("cardinal") -> false (no estaba)   remove("hawk") -> true
//   remove(0) -> quita el de la posicion 0.  remove(100) -> ERROR (no existe)
//
// set(indice, nuevo) -> reemplaza SIN cambiar el tamano.
//   birds.set(0, "robin");   // cambia el de la posicion 0
//   birds.set(1, "robin");   // ERROR si no existe la posicion 1
//
// isEmpty() -> esta vacia?   size() -> cuantos tiene?
// clear() -> borra todo.
// contains(x) -> tiene x? (usa equals por dentro)
// equals(otra) -> dos listas son iguales si tienen lo MISMO y en el MISMO orden.
//   [a,b] vs [b,a] -> NO son iguales (orden distinto).
//
// EN CORTO: add (agrega), remove (quita), set (reemplaza), size (cuenta),
//           contains (busca), equals (mismo contenido y mismo orden).

public class UsingAnArrayList {
}
