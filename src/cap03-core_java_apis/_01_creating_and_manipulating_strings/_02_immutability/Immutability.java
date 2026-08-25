package core_java_apis._01_creating_and_manipulating_strings._02_immutability;

// ====== LOS STRINGS NO SE PUEDEN CAMBIAR (inmutables) ======
//
// Una vez que creas un texto (String), YA NO se puede cambiar por dentro.
// No puedes hacerlo mas grande, ni mas chico, ni cambiar una letra.
// Piensa en una caja llena hasta el tope que NO se puede estirar.
//
// "Inmutable" = que NO cambia.  "Mutable" = que SI cambia.
// Para el examen: recuerda que String es INMUTABLE.
//
// TRAMPA famosa (te tiran un metodo para confundirte):
//   String s1 = "1";
//   String s2 = s1.concat("2");  // s2 = "12"
//   s2.concat("3");              // esto crea "123"... pero NADIE lo guarda!
//   System.out.println(s2);      // imprime "12"  (s2 no cambio)
//
// El truco: concat() NO cambia el texto viejo, crea uno NUEVO.
// Si no guardas ese nuevo en una variable, se pierde.
//
// EN CORTO: un String nunca cambia; los metodos crean textos NUEVOS.
//           Si no guardas el nuevo, no pasa nada.

public class Immutability {
}
