package methods_and_encapsulation._01_designing_methods._07_optional_exception_list;

// ====== LISTA DE EXCEPCIONES (opcional) ======
//
// Con 'throws' avisas que el metodo PODRIA lanzar errores (excepciones).
// Es opcional. Si hay varias, se separan con coma.
//
//   public void a() { }                                   // sin excepciones
//   public void b() throws IllegalArgumentException { }   // una
//   public void c() throws IllegalArgumentException, InterruptedException { } // dos
//
// (quien LLAMA a este metodo tendra que manejar o volver a lanzar esas excepciones,
//  eso se ve en el Cap 6)
//
// EN CORTO: throws (opcional) avisa que el metodo puede lanzar excepciones;
//           varias se separan con coma.

public class OptionalExceptionList {
}
