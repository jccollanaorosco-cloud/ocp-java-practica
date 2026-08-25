package core_java_apis._01_creating_and_manipulating_strings._01_concatenation;

// ====== JUNTAR TEXTOS CON +  (concatenacion) ======
//
// Con numeros, + SUMA.  Con textos, + los PEGA (junta).
//   1 + 2      -> 3      (numeros, suma)
//   "1" + "2"  -> "12"   (textos, se pegan)
//
// 3 reglas de oro (memorizalas!):
//   1) Si los dos lados son numeros -> es SUMA.
//   2) Si al menos uno es texto (String) -> es PEGAR.
//   3) Se lee de IZQUIERDA a DERECHA.
//
// Ejemplos:
//   1 + 2          -> 3      (dos numeros)
//   "a" + "b"      -> ab
//   "a" + "b" + 3  -> ab3    ("a"+"b"="ab", luego "ab"+3="ab3")
//   1 + 2 + "c"    -> 3c      (1+2=3, luego 3+"c"="3c")
//
// TRAMPA de examen (revisa los TIPOS):
//   int three = 3;
//   String four = "4";
//   1 + 2 + three + four
//   Paso a paso: 1+2=3 -> 3+three(3)=6 -> 6+four("4")="64"
//
// Y recuerda el +=:
//   String s = "1";
//   s += "2";   // ahora s vale "12"  (es lo mismo que s = s + "2")
//   s += 3;     // ahora s vale "123"
//
// EN CORTO: + suma si son numeros, PEGA si hay texto, y se lee de izq a der.

public class Concatenation {
}
