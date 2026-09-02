package methods_and_encapsulation._02_working_with_varargs;

// ====== VARARGS (parametro de cantidad variable) ======
//
// Un vararg (tipo... nombre) recibe "muchos" valores y por dentro se usa como array.
// REGLA: el vararg debe ser el ULTIMO parametro (solo puede haber UNO por metodo).
//
//   public void walk1(int... nums) {}              // OK
//   public void walk2(int start, int... nums) {}   // OK (vararg al final)
//   public void walk3(int... nums, int start) {}   // NO COMPILA (vararg no va al final)
//   public void walk4(int... start, int... nums) {}// NO COMPILA (dos varargs)
//
// Al LLAMARLO puedes: pasar valores sueltos, pasar un array, o no pasar nada
// (Java crea un array vacio):
//   walk(1);                    // nums.length = 0 (array vacio)
//   walk(1, 2);                 // nums.length = 1
//   walk(1, 2, 3);              // nums.length = 2
//   walk(1, new int[]{4, 5});   // nums.length = 2 (le pasaste un array)
//   walk(1, null);              // OJO: null se toma como array null -> da error al usar .length
//
// Se accede como array normal: nums[0], nums[1], nums.length.
//
// EN CORTO: tipo... va al final y solo uno; se llama con valores sueltos, un array,
//           o nada (array vacio); null da error.

public class WorkingWithVarargs {
}
