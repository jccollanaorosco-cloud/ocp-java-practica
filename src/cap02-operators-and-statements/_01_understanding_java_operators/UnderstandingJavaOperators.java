package operators_and_statements._01_understanding_java_operators;

// ====== ENTENDIENDO LOS OPERADORES DE JAVA ======
//
// Un OPERADOR es un simbolito que hace algo con unos valores.
// A esos valores se les llama OPERANDOS. Ej: en  3 + 2, el + es el operador
// y el 3 y el 2 son los operandos.
//
// Hay 3 tipos, segun cuantos operandos usan:
//   - unario   -> usa 1     (ej:  -x   o   x++)
//   - binario  -> usa 2     (ej:  3 + 2)
//   - ternario -> usa 3     (ej:  a ? b : c)
//
// OJO IMPORTANTE: Java NO siempre lee de izquierda a derecha.
// Hay un ORDEN DE PRIORIDAD (como en mate: primero multiplicar, luego sumar).
//
// Ejemplo que engana:
//   int y = 4;
//   double x = 3 + 2 * --y;
//   Paso a paso:
//     1) --y  -> y se vuelve 3
//     2) 2 * 3 -> 6
//     3) 3 + 6 -> 9
//     4) x es double, asi que 9 se guarda como 9.0
//   Al final:  x = 9.0  y  y = 3
//
// Los parentesis MANDAN: si quieres cambiar el orden, pones ( ) y eso se hace primero.
//
// Orden de prioridad (de lo que se hace PRIMERO a lo ultimo):
//   1. x++  x--      (post)
//   2. ++x  --x      (pre)
//   3. +  -  !       (otros unarios)
//   4. *  /  %       (multiplicar, dividir, resto)
//   5. +  -          (sumar, restar)
//   6. <<  >>  >>>   (corrimientos, casi no salen)
//   7. <  >  <=  >=  instanceof
//   8. ==  !=
//   9. &  ^  |       (logicos)
//  10. &&  ||        (corto circuito)
//  11. ? :           (ternario)
//  12. =  +=  -=  ...(asignaciones)
//
// Si dos operadores tienen la MISMA prioridad -> ahi si, izquierda a derecha.
//
// EN CORTO: un operador hace algo con valores; hay unarios, binarios y ternarios;
//           y se aplican en un orden de prioridad, no siempre de izq a der.

public class UnderstandingJavaOperators {
}
