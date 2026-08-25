package core_java_apis._04_understanding_java_arrays._05_searching;

// ====== BUSCAR EN UN ARRAY (Arrays.binarySearch) ======
//
// binarySearch busca rapido, PERO el array DEBE estar ordenado primero.
//
// Que devuelve:
//   - Si LO ENCUENTRA -> la posicion (indice) donde esta.
//   - Si NO lo encuentra -> un NEGATIVO raro: -(donde deberia ir) - 1.
//   - Si el array NO esta ordenado -> resultado IMPREDECIBLE (no confies).
//
//   int[] numbers = {2,4,6,8};   // (ya ordenado)
//   Arrays.binarySearch(numbers, 2) -> 0   (esta en la posicion 0)
//   Arrays.binarySearch(numbers, 4) -> 1
//   Arrays.binarySearch(numbers, 1) -> -1  (deberia ir en 0 -> -(0)-1 = -1)
//   Arrays.binarySearch(numbers, 3) -> -2  (deberia ir en 1 -> -(1)-1 = -2)
//   Arrays.binarySearch(numbers, 9) -> -5  (deberia ir en 4 -> -(4)-1 = -5)
//
// Si el array NO estaba ordenado, en el examen la respuesta correcta suele ser
// "resultado impredecible".
//
// EN CORTO: binarySearch necesita array ORDENADO; si encuentra da la posicion,
//           si no da -(donde iria)-1; si no esta ordenado, impredecible.

public class Searching {
}
