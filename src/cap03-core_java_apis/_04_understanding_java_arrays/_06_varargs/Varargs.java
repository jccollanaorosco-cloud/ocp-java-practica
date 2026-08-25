package core_java_apis._04_understanding_java_arrays._06_varargs;

// ====== VARARGS (cantidad variable de argumentos) ======
//
// Es una forma de recibir "muchos" argumentos como si fueran un array.
// Las 3 escrituras del main son equivalentes:
//   public static void main(String[] args)
//   public static void main(String args[])
//   public static void main(String... args)   // <- varargs (los 3 puntos ...)
//
// Dentro del metodo, usas 'args' como un array normal:
//   args.length   y   args[0]   son validos.
//
// EN CORTO: varargs (tipo... nombre) recibe muchos valores y por dentro se usa
//           igual que un array.

public class Varargs {
}
