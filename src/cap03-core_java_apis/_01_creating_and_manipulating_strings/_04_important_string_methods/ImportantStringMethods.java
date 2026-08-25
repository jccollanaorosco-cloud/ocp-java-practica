package core_java_apis._01_creating_and_manipulating_strings._04_important_string_methods;

// ====== METODOS IMPORTANTES DE STRING ======
//
// Recuerda: un texto es una fila de letras, y Java cuenta desde 0.
//   "animals"  ->  a=0  n=1  i=2  m=3  a=4  l=5  s=6
//
// length()  -> cuantas letras tiene (aqui SI se cuenta normal, desde 1)
//   "animals".length()  -> 7
//
// charAt(i) -> que letra hay en la posicion i (cuenta desde 0)
//   "animals".charAt(0) -> 'a'
//   "animals".charAt(6) -> 's'
//   "animals".charAt(7) -> ERROR (no existe esa posicion)
//
// indexOf(x) -> en que posicion aparece x por PRIMERA vez. Si no esta, da -1.
//   "animals".indexOf('a')     -> 0
//   "animals".indexOf("al")    -> 4
//   "animals".indexOf('a', 4)  -> 4   (empieza a buscar desde la posicion 4)
//   "animals".indexOf("al", 5) -> -1  (ya no lo encuentra)
//
// substring(inicio, fin) -> corta un pedazo. Incluye 'inicio' pero PARA ANTES de 'fin'.
//   "animals".substring(3)    -> "mals"   (desde 3 hasta el final)
//   "animals".substring(3,4)  -> "m"      (solo la letra de la posicion 3)
//   "animals".substring(3,7)  -> "mals"   (7 es el final, es lo mismo que substring(3))
//   "animals".substring(3,3)  -> ""       (mismo inicio y fin = vacio)
//   "animals".substring(3,2)  -> ERROR    (el fin no puede ser menor que el inicio)
//   "animals".substring(3,8)  -> ERROR    (8 no existe)
//   (substring es el mas tramposo: dibujalo con las posiciones para no perderte)
//
// toUpperCase() / toLowerCase() -> pasa a MAYUS o minus.
//   "animals".toUpperCase() -> "ANIMALS"
//   "Abc123".toLowerCase()  -> "abc123"   (los numeros no cambian)
//
// equals() / equalsIgnoreCase() -> compara si dos textos son iguales.
//   "abc".equals("ABC")            -> false (distinguen mayus/minus)
//   "abc".equalsIgnoreCase("ABC")  -> true  (ignora mayus/minus)
//
// startsWith() / endsWith() / contains() -> empieza con / termina con / contiene.
//   "abc".startsWith("a") -> true
//   "abc".endsWith("c")   -> true
//   "abc".contains("b")   -> true
//   (todos distinguen mayus de minus)
//
// replace(viejo, nuevo) -> cambia unas letras por otras.
//   "abcabc".replace('a','A') -> "AbcAbc"
//
// trim() -> quita los espacios (y tabs/enters) de los EXTREMOS, no los del medio.
//   "\t a b c\n".trim() -> "a b c"
//
// EN CORTO: cuenta desde 0; length cuenta letras; substring corta (incluye inicio,
//           para antes del fin); indexOf da -1 si no encuentra; los textos no cambian.

public class ImportantStringMethods {
}
