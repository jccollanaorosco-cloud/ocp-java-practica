package methods_and_encapsulation._05_overloading_methods;

// ====== SOBRECARGA DE METODOS (overloading) ======
//
// Sobrecargar = varios metodos con el MISMO NOMBRE pero DISTINTOS parametros
// (distinto tipo, distinta cantidad, o distinto orden).
//
// Validas (cambian los parametros):
//   public void fly(int numMiles) {}
//   public void fly(short numFeet) {}
//   public boolean fly() { return false; }
//   void fly(int a, short b) {}
//   public void fly(short a, int b) throws Exception {}
//   (el acceso, static y las excepciones NO cuentan para sobrecargar)
//
// NO validas:
//   public void fly(int n) {}
//   public int fly(int n) {}          // NO COMPILA (solo cambia el tipo de retorno)
//   public static void fly(int n) {}  // NO COMPILA (solo cambia static; parametros iguales)
//   public void fly(int[] x) {}
//   public void fly(int... x) {}      // NO COMPILA (vararg cuenta como array = mismo parametro)
//
// ORDEN en que Java elige el metodo (de mejor a peor):
//   1) Coincidencia EXACTA de tipo         glide(int, int)
//   2) Un primitivo mas GRANDE             glide(long, long)
//   3) Tipo AUTOBOXED (wrapper)            glide(Integer, Integer)
//   4) Varargs                             glide(int...)
//
// Ejemplos:
//   fly("test") vs fly(Object) -> gana String (mas especifico).
//   fly(123) con fly(int) y fly(long) -> gana int (exacto).
//   play(4) con play(Long) y play(Long...) -> NO COMPILA (int->long->Long son 2 pasos;
//     Java solo hace UNA conversion).
//
// EN CORTO: sobrecargar = mismo nombre, parametros distintos; NO basta cambiar el
//           tipo de retorno; Java elige el mas especifico (exacto > grande > wrapper > varargs).

public class OverloadingMethods {
}
