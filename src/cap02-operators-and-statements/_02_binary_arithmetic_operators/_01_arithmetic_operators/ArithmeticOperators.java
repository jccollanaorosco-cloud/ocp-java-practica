package operators_and_statements._02_binary_arithmetic_operators._01_arithmetic_operators;

// ====== OPERADORES ARITMETICOS ======
//
// Son los de toda la vida en mate:
//   +  sumar
//   -  restar
//   *  multiplicar
//   /  dividir
//   %  modulo (el RESTO de una division)
//
// Regla de oro: * / % se hacen ANTES que + -  (igual que en el cole).
//
// Ejemplo:
//   int x = 2 * 5 + 3 * 4 - 8;
//   primero:  2*5=10  y  3*4=12
//   queda:    10 + 12 - 8
//   luego de izq a der:  = 14
//
// Con parentesis cambia todo:
//   int x = 2 * ((5 + 3) * 4 - 8);
//   (5+3)=8 -> 8*4=32 -> 32-8=24 -> 2*24 = 48
//
// Se pueden usar con cualquier primitivo MENOS boolean y String.
// Con String, solo sirven + y += (para PEGAR textos, se llama concatenar):
//   "Hola " + "mundo"  ->  "Hola mundo"
//
// EL MODULO (%) es el que menos conocen:
//   Es el RESTO que sobra al dividir.
//   9 % 3 = 0   (9 se divide exacto entre 3, no sobra nada)
//   11 % 3 = 2  (11/3 da 3 y sobran 2)
//
// No confundas division con modulo (con enteros):
//   10 / 3 = 3   (division entera: se queda con el entero, sin decimales)
//   10 % 3 = 1   (lo que sobra)
//
// EN CORTO: + - * / y % (resto). Multiplicar/dividir/resto van antes que sumar/restar.
//           En texto solo sirve el +.

public class ArithmeticOperators {
}
