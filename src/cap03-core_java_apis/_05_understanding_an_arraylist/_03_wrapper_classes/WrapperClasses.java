package core_java_apis._05_understanding_an_arraylist._03_wrapper_classes;

// ====== CLASES ENVOLTORIO (wrapper) ======
//
// Un ArrayList guarda OBJETOS, no primitivos. Para meter primitivos, cada uno
// tiene su version "objeto" (wrapper):
//   boolean -> Boolean      int    -> Integer
//   byte    -> Byte         long   -> Long
//   short   -> Short        float  -> Float
//   char    -> Character    double -> Double
//
// Convertir un String a numero. Truco para recordar:
//   parseXxx()  -> devuelve un PRIMITIVO (el nombre del primitivo esta en el metodo)
//   valueOf()   -> devuelve un WRAPPER (objeto)
//   int primitivo = Integer.parseInt("123");     // int
//   Integer objeto = Integer.valueOf("123");      // Integer
//
// Si el texto no sirve, salta error (NumberFormatException):
//   Integer.parseInt("a")        // ERROR
//   Integer.valueOf("123.45")    // ERROR
//
// Character NO tiene parse/valueOf (para letras usas charAt del String).
//
// EN CORTO: cada primitivo tiene su wrapper (int->Integer...); parseInt da primitivo,
//           valueOf da wrapper; texto invalido -> error.

public class WrapperClasses {
}
