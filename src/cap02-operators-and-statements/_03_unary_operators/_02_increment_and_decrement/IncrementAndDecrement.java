package operators_and_statements._03_unary_operators._02_increment_and_decrement;

// ====== ++ y --  (sumar o restar 1) ======
//
// ++  suma 1     --  resta 1
//
// Lo clave es DONDE pones el signo:
//   PRE  (++x):  primero cambia, LUEGO usa el valor nuevo.
//   POST (x++):  primero usa el valor viejo, LUEGO cambia.
//
// Ejemplo facil:
//   int counter = 0;
//   System.out.println(counter);     // 0
//   System.out.println(++counter);   // 1  (sube y muestra el nuevo)
//   System.out.println(counter);     // 1
//   System.out.println(counter--);   // 1  (muestra el viejo y despues baja)
//   System.out.println(counter);     // 0
//
// Ejemplo tramposo (de examen), x=3:
//   int x = 3;
//   int y = ++x * 5 / x-- + --x;
//   Se lee asi, de izq a der:
//     ++x -> x=4, usa 4 ->   4 * 5 / x-- + --x
//     x-- -> usa 4, luego x=3 -> 4 * 5 / 4 + --x
//     --x -> x=2, usa 2 ->   4 * 5 / 4 + 2
//     = 20 / 4 + 2 = 5 + 2 = 7
//   Resultado:  x = 2   y   y = 7
//
// EN CORTO: ++ sube 1, -- baja 1. Si va ANTES (++x) cambia y luego usa;
//           si va DESPUES (x++) usa el viejo y luego cambia.

public class IncrementAndDecrement {
}
