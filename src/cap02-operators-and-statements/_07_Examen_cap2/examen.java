// ==========================================================================
//              EXAMEN CAPITULO 2 - Operators and Statements
//           Preguntas completas, opciones, respuesta y fundamento
// ==========================================================================

// --------------------------------------------------------------------------
// 1. Que operadores de Java se pueden usar con variables boolean? (varias)
//    A. ==   B. +   C. --   D. !   E. %   F. <=
// RESPUESTA: A, D
//   == compara dos boolean (ok);  ! voltea un boolean (ok).
//   + - -- % <= son para numeros, no para boolean.
// --------------------------------------------------------------------------

// --------------------------------------------------------------------------
// 2. Que tipo(s) permiten compilar? (varias)
//    byte x = 5;  byte y = 10;  ____ z = x + y;
//    A. int   B. long   C. boolean   D. double   E. short   F. byte
// RESPUESTA: A, B, D
//   byte + byte se PROMUEVE a int. Entonces z debe poder guardar un int:
//   int (ok), long (int cabe en long), double (int cabe en double).
//   short y byte NO (un int no cabe en ellos sin cast); boolean nunca.
// --------------------------------------------------------------------------

// --------------------------------------------------------------------------
// 3. Salida de CompareValues?
//    3: int x = 0;
//    4: while(x++ < 10) {}
//    5: String message = x > 10 ? "Greater than" : false;
//    6: System.out.println(message+","+x);
//    A. Greater than,10   B. false,10   C. Greater than,11
//    D. false,11   E. No compila por la linea 4   F. No compila por la linea 5
// RESPUESTA: F
//   El ternario tiene "Greater than" (String) y false (boolean); se asigna a un
//   String pero no hay un tipo comun valido -> la linea 5 no compila.
// --------------------------------------------------------------------------

// --------------------------------------------------------------------------
// 4. Que cambio hace que compile? (varias)
//    3: long x = 10;
//    4: int y = 2 * x;
//    A. Ningun cambio; compila asi.
//    B. Castear x en linea 4 a int.
//    C. Cambiar x en linea 3 a short.
//    D. Castear 2 * x en linea 4 a int.
//    E. Cambiar y en linea 4 a short.
//    F. Cambiar y en linea 4 a long.
// RESPUESTA: B, C, D, F
//   2 * x es long (int * long), no cabe en int -> tal cual NO compila (A falso).
//   B: 2*(int)x -> int (ok).  C: short*2 -> int, cabe en int (ok).
//   D: (int)(2*x) (ok).  F: long y = long (ok).
//   E falla: 2*x es long y no cabe en short.
// --------------------------------------------------------------------------

// --------------------------------------------------------------------------
// 5. Salida?
//    6: for(int x : list) {   // list = [10, 14]
//    7:   System.out.print(x + ", ");
//    8:   break;
//    9: }
//    A. 10, 14,   B. 10, 14   C. 10,   D. No compila (l.7)   E. No compila (l.8)
//    F. Bucle infinito
// RESPUESTA: C
//   Imprime "10, " y el break corta en la primera vuelta.
// --------------------------------------------------------------------------

// --------------------------------------------------------------------------
// 6. Salida?
//    3: int x = 4;
//    4: long y = x * 4 - x++;
//    5: if(y<10) System.out.println("Too Low");
//    6: else System.out.println("Just right");
//    7: else System.out.println("Too High");
//    A. Too Low   B. Just Right   C. Too High   D. NullPointerException
//    E. No compila (l.6)   F. No compila (l.7)
// RESPUESTA: F
//   Un if no puede tener DOS else. El segundo else (linea 7) no compila.
// --------------------------------------------------------------------------

// --------------------------------------------------------------------------
// 7. Salida?
//    3: int x = 5;
//    4: System.out.println(x > 2 ? x < 4 ? 10 : 8 : 7);
//    A. 5   B. 4   C. 10   D. 8   E. 7   F. No compila (l.4)
// RESPUESTA: D
//   x>2 es true -> evalua (x<4 ? 10 : 8). x=5, x<4 es false -> 8.
// --------------------------------------------------------------------------

// --------------------------------------------------------------------------
// 8. Salida?
//    3: boolean x = true, z = true;
//    4: int y = 20;
//    5: x = (y != 10) ^ (z=false);
//    6: System.out.println(x+", "+y+", "+z);
//    A. true, 10, true   B. true, 20, false   C. false, 20, true
//    D. false, 20, false   E. false, 20, true   F. No compila (l.5)
// RESPUESTA: B
//   (y!=10) -> true.  (z=false) -> asigna false a z, y vale false.
//   true ^ false = true (XOR: distintos -> true).  x=true, y=20, z=false.
// --------------------------------------------------------------------------

// --------------------------------------------------------------------------
// 9. Cuantas veces imprime "Hello World"?
//    3: for(int i=0; i<10 ; ) {
//    4:   i = i++;
//    5:   System.out.println("Hello World");
//    6: }
//    A. 9   B. 10   C. 11   D. No compila (l.3)   E. No compila (l.5)
//    F. Bucle infinito
// RESPUESTA: F
//   i = i++ usa el valor viejo (0) y aunque i sube, la asignacion lo regresa a 0.
//   i se queda en 0 para siempre -> bucle infinito.
// --------------------------------------------------------------------------

// --------------------------------------------------------------------------
// 10. Salida?
//    3: byte a = 40, b = 50;
//    4: byte sum = (byte) a + b;
//    5: System.out.println(sum);
//    A. 40   B. 50   C. 90   D. No compila (l.4)   E. Valor indefinido
// RESPUESTA: D
//   El cast pega mas fuerte: ((byte)a) + b -> byte + byte -> int.
//   Meter un int en un byte sin cast del total -> no compila (l.4).
// --------------------------------------------------------------------------

// --------------------------------------------------------------------------
// 11. Salida?
//    3: int x = 5 * 4 % 3;
//    A. 2   B. 3   C. 5   D. 6   E. No compila (l.3)
// RESPUESTA: A
//   * y % tienen igual prioridad -> izq a der: 5*4=20, 20%3=2.
// --------------------------------------------------------------------------

// --------------------------------------------------------------------------
// 12. Salida?
//    3: int x = 0;
//    4: String s = null;
//    5: if(x == s) System.out.println("Success");
//    6: else System.out.println("Failure");
//    A. Success   B. Failure   C. No compila (l.4)   D. No compila (l.5)
// RESPUESTA: D
//   No se puede comparar con == un int y un String (tipos incompatibles) -> l.5.
// --------------------------------------------------------------------------

// --------------------------------------------------------------------------
// 13. Salida?
//    3: int x1 = 50, x2 = 75;
//    4: boolean b = x1 >= x2;
//    5: if(b = true) System.out.println("Success");
//    6: else System.out.println("Failure");
//    A. Success   B. Failure   C. No compila (l.4)   D. No compila (l.5)
// RESPUESTA: A
//   b = true es ASIGNACION (no ==): pone b en true y el if usa true -> Success.
// --------------------------------------------------------------------------

// --------------------------------------------------------------------------
// 14. Salida?
//    3: int c = 7;
//    4: int result = 4;
//    5: result += ++c;
//    6: System.out.println(result);
//    A. 8   B. 11   C. 12   D. 15   E. 16   F. No compila (l.5)
// RESPUESTA: C
//   ++c -> c=8; result = 4 + 8 = 12.
// --------------------------------------------------------------------------

// --------------------------------------------------------------------------
// 15. Salida?
//    3: int x = 1, y = 15;
//    4: while x < 10
//    5:   y--;
//    6: x++;
//    7: System.out.println(x+", "+y);
//    A. 10, 5   B. 10, 6   C. 11, 5   D. No compila (l.3)   E. No compila (l.4)
//    F. Bucle infinito
// RESPUESTA: E
//   Al while le faltan los parentesis: debe ser while(x < 10). Linea 4 no compila.
// --------------------------------------------------------------------------

// --------------------------------------------------------------------------
// 16. Salida?
//    3: do {
//    4:   int y = 1;
//    5:   System.out.print(y++ + " ");
//    6: } while(y <= 10);
//    A. 1..9   B. 1..10   C. 1..11   D. No compila (l.6)   E. Bucle infinito
// RESPUESTA: D
//   y se declara DENTRO del do; en la condicion while (linea 6) y esta fuera de
//   scope -> no compila.
// --------------------------------------------------------------------------

// --------------------------------------------------------------------------
// 17. Salida?
//    3: boolean keepGoing = true;
//    4: int result = 15, i = 10;
//    5: do {
//    6:   i--;
//    7:   if(i==8) keepGoing = false;
//    8:   result -= 2;
//    9: } while(keepGoing);
//    10: System.out.println(result);
//    A. 7   B. 9   C. 10   D. 11   E. 15   F. No compila (l.8)
// RESPUESTA: D
//   Vuelta 1: i=9, no es 8, result=13.
//   Vuelta 2: i=8, keepGoing=false, result=11; while(false) -> sale. result=11.
// --------------------------------------------------------------------------

// --------------------------------------------------------------------------
// 18. Salida?
//    3: int count = 0;
//    4: ROW_LOOP: for(int row = 1; row <=3; row++)
//    5:   for(int col = 1; col <=2 ; col++) {
//    6:     if(row * col % 2 == 0) continue ROW_LOOP;
//    7:     count++;
//    8:   }
//    9: System.out.println(count);
//    A. 1   B. 2   C. 3   D. 4   E. 6   F. No compila (l.6)
// RESPUESTA: B
//   row=1,col=1: 1 impar -> count=1; col=2: 2 par -> continue ROW_LOOP.
//   row=2,col=1: 2 par -> continue ROW_LOOP (no suma).
//   row=3,col=1: 3 impar -> count=2; col=2: 6 par -> continue. Total count=2.
// --------------------------------------------------------------------------

// --------------------------------------------------------------------------
// 19. Resultado?
//    3: int m = 9, n = 1, x = 0;
//    4: while(m > n) {
//    5:   m--;
//    6:   n += 2;
//    7:   x += m + n;
//    8: }
//    9: System.out.println(x);
//    A. 11   B. 13   C. 23   D. 36   E. 50   F. No compila (l.7)
// RESPUESTA: D
//   m=8,n=3 -> x=11; m=7,n=5 -> x=23; m=6,n=7 -> x=36; luego 6>7 falso -> sale. x=36.
// --------------------------------------------------------------------------

// --------------------------------------------------------------------------
// 20. Resultado?
//    3: final char a = 'A', d = 'D';
//    4: char grade = 'B';
//    5: switch(grade) {
//    6:   case a:
//    7:   case 'B': System.out.print("great");
//    8:   case 'C': System.out.print("good"); break;
//    9:   case d:
//    10:  case 'F': System.out.print("not good");
//    11: }
//    A. great   B. greatgood   C. No compila (l.3)   D. No compila (l.6)
//    E. No compila (l.6 y l.9)
// RESPUESTA: B
//   a y d son final char con literal -> case valido (compila).
//   grade='B' entra en case 'B' -> "great"; sin break CAE a case 'C' -> "good";
//   luego break. Resultado: greatgood.
// --------------------------------------------------------------------------

// ==========================================================================
//  RESUMEN DE RESPUESTAS
//  1:AD  2:ABD  3:F  4:BCDF  5:C  6:F  7:D  8:B  9:F  10:D
//  11:A  12:D  13:A  14:C  15:E  16:D  17:D  18:B  19:D  20:B
// ==========================================================================

public class examen {
}