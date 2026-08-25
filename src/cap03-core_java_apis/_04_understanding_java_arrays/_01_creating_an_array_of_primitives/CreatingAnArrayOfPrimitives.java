package core_java_apis._04_understanding_java_arrays._01_creating_an_array_of_primitives;

// ====== CREAR UN ARRAY DE PRIMITIVOS ======
//
// Un array es una LISTA ordenada de casilleros del mismo tipo. Cuenta desde 0.
//
// Forma normal (dices tipo y tamano):
//   int[] numbers1 = new int[3];   // 3 casilleros, todos empiezan en 0 (el default de int)
//
// Con valores desde el inicio:
//   int[] numbers2 = new int[] {42, 55, 99};
//   int[] numbers2 = {42, 55, 99};   // atajo (array anonimo)
//
// Los corchetes [] pueden ir antes o despues del nombre (todas valen igual):
//   int[] a;   int []b;   int c[];   int d [];   // lo normal es la primera
//
// TRAMPA con las comas:
//   int[] ids, types;   // DOS arrays int[]  (ids y types)
//   int ids[], types;   // UN array int[] (ids) y UN int normal (types)!
//   (el [] pegado a un nombre solo afecta a ESE nombre)
//
// EN CORTO: array = lista de casilleros del mismo tipo, cuenta desde 0;
//           new int[3] los llena con el valor por defecto (0 para int).

public class CreatingAnArrayOfPrimitives {
}
