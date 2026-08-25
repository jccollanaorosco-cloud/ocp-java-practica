package core_java_apis._02_using_the_stringbuilder_class._01_mutability_and_chaining;

// ====== StringBuilder: SI se puede cambiar ======
//
// Problema: con String, pegar letras en un bucle crea MUCHISIMOS objetos basura.
//   String alpha = "";
//   for(char c='a'; c<='z'; c++) alpha += c;   // crea 27 objetos! ineficiente
//
// Solucion: StringBuilder. A diferencia de String, este SI se puede cambiar
// (es MUTABLE) y NO crea basura en cada paso.
//   StringBuilder alpha = new StringBuilder();
//   for(char c='a'; c<='z'; c++) alpha.append(c);  // reusa el mismo objeto
//
// DIFERENCIA CLAVE al encadenar:
//   - String: cada metodo devuelve un texto NUEVO.
//   - StringBuilder: se cambia a SI MISMO y se devuelve a si mismo.
//
// Por eso todas las variables terminan apuntando al MISMO objeto:
//   StringBuilder a = new StringBuilder("abc");
//   StringBuilder b = a.append("de");        // a y b son el MISMO objeto -> "abcde"
//   b = b.append("f").append("g");           // sigue siendo el mismo -> "abcdefg"
//   Al final:  a = "abcdefg"  y  b = "abcdefg"  (hay UN solo objeto)
//
// EN CORTO: StringBuilder SI cambia (mutable) y al encadenar se modifica a si mismo,
//           por eso todas las variables apuntan al mismo objeto.

public class MutabilityAndChaining {
}
