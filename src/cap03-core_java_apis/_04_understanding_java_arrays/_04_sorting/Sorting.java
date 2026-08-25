package core_java_apis._04_understanding_java_arrays._04_sorting;

// ====== ORDENAR UN ARRAY (Arrays.sort) ======
//
// Java ordena facil con  Arrays.sort(array).
// Necesita el import:  import java.util.Arrays;
//
//   int[] numbers = {6, 9, 1};
//   Arrays.sort(numbers);   // ahora es {1, 6, 9}
//
// OJO con textos: se ordenan como en el diccionario (alfabetico), NO por su valor.
//   String[] s = {"10", "9", "100"};
//   Arrays.sort(s);   // da: 10  100  9   (porque "1" va antes que "9" como letra)
//   (Regla: numeros antes que letras, y MAYUS antes que minus)
//
// EN CORTO: Arrays.sort ordena; los textos se ordenan como palabras (alfabetico),
//           no por su numero.

public class Sorting {
}
