package core_java_apis._05_understanding_an_arraylist._05_converting_between_array_and_list;

// ====== CONVERTIR ENTRE array y List ======
//
// De List a array:
//   List<String> list = new ArrayList<>();
//   list.add("hawk"); list.add("robin");
//   Object[] o = list.toArray();               // por defecto da Object[] (no suele servir)
//   String[] s = list.toArray(new String[0]);  // asi da String[] (lo que quieres)
//                                              // el 0 hace que Java cree el array del tamano justo
//
// De array a List (con Arrays.asList):
//   String[] array = {"hawk", "robin"};
//   List<String> list = Arrays.asList(array);  // lista de TAMANO FIJO, "pegada" al array
//   list.set(1, "test");   // OK (reemplazar si se puede); cambia array Y list (estan ligados)
//   array[0] = "new";      // tambien cambia los dos
//   list.remove(1);        // ERROR (no puedes cambiar el TAMANO de una lista fija)
//
// Truco util (crear una lista en una linea):
//   List<String> list = Arrays.asList("one", "two");
//
// EN CORTO: toArray(new String[0]) pasa lista a array; Arrays.asList pasa array a
//           lista FIJA y ligada (no puedes cambiar su tamano).

public class ConvertingBetweenArrayAndList {
}
