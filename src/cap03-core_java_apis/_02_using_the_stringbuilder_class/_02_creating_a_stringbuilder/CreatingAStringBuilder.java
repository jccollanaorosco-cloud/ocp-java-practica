package core_java_apis._02_using_the_stringbuilder_class._02_creating_a_stringbuilder;

// ====== CREAR UN StringBuilder ======
//
// Hay 3 formas:
//   StringBuilder sb1 = new StringBuilder();        // vacio
//   StringBuilder sb2 = new StringBuilder("animal"); // con un texto de arranque
//   StringBuilder sb3 = new StringBuilder(10);       // vacio, pero reserva espacio para 10
//
// TAMANO (size) vs CAPACIDAD (capacity):
//   - size     = cuantas letras tiene AHORITA.
//   - capacity = cuantas letras CABEN sin agrandarse.
//   En String son iguales (porque no cambia). En StringBuilder pueden ser distintos.
//   Si te pasas de la capacidad, Java la agranda solo. La capacidad por defecto es 16.
//
// EN CORTO: 3 formas de crearlo (vacio, con texto, o reservando espacio);
//           size = lo que tiene ahora, capacity = lo que le cabe.

public class CreatingAStringBuilder {
}
