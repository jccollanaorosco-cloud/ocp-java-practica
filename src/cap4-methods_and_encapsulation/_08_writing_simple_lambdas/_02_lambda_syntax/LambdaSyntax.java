package methods_and_encapsulation._08_writing_simple_lambdas._02_lambda_syntax;

// ====== SINTAXIS DE LAMBDAS ======
//
// Estas dos hacen EXACTAMENTE lo mismo (una corta, otra larga):
//   a -> a.canHop()
//   (Animal a) -> { return a.canHop(); }
//
// Partes:  parametro  ->  cuerpo
//   -> es la "flecha" que separa el parametro del cuerpo.
//
// Que puedes OMITIR (version corta):
//   - los parentesis: solo si hay UN parametro y NO escribes su tipo.
//   - las llaves { }, el 'return' y el ';' : solo si el cuerpo es UNA sola linea.
//   (si pones llaves, entonces SI necesitas return y ;)
//
// Ejemplos validos (0, 1 o 2 parametros):
//   () -> true                                 // 0 parametros
//   a -> a.startsWith("test")                  // 1 parametro (sin tipo, sin parentesis)
//   (String a) -> a.startsWith("test")         // 1 parametro con tipo (necesita parentesis)
//   (a, b) -> a.startsWith("test")             // 2 parametros
//   (String a, String b) -> a.startsWith("test")
//
// Invalidos:
//   a, b -> a.startsWith("test")               // NO: faltan parentesis (2 parametros)
//   a -> { a.startsWith("test"); }             // NO: con llaves falta 'return'
//   a -> { return a.startsWith("test") }       // NO: falta el ';'
//
// EN CORTO: parametro -> cuerpo; sin parentesis solo si es 1 parametro sin tipo;
//           con llaves necesitas return y ;.

public class LambdaSyntax {
}
