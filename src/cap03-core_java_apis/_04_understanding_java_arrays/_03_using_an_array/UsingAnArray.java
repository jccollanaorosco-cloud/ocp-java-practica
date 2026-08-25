package core_java_apis._04_understanding_java_arrays._03_using_an_array;

// ====== USAR UN ARRAY ======
//
//   String[] mammals = {"monkey", "chimp", "donkey"};
//   mammals.length  -> 3        (cuantos casilleros hay; es .length, SIN parentesis!)
//   mammals[0]      -> "monkey" (primer elemento, cuenta desde 0)
//   mammals[2]      -> "donkey" (ultimo)
//
// OJO: length cuenta los casilleros, no importa si estan vacios (null).
//   String[] birds = new String[6];
//   birds.length -> 6   (aunque los 6 esten en null)
//
// Recorrer con for:
//   int[] numbers = new int[10];
//   for(int i=0; i < numbers.length; i++) numbers[i] = i + 5;
//
// ERRORES clasicos (ArrayIndexOutOfBoundsException) en un array de tamano 10:
//   numbers[10] = 3;               // solo van del 0 al 9!
//   numbers[numbers.length] = 5;   // length(10) tampoco existe como indice
//   for(int i=0; i <= numbers.length; i++) ...  // el <= se pasa por 1 (usa <)
//
// EN CORTO: .length (sin parentesis) cuenta casilleros; los indices van de 0 a length-1;
//           pasarte da error.

public class UsingAnArray {
}
