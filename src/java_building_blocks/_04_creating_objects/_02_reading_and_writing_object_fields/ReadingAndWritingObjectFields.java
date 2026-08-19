package java_building_blocks._04_creating_objects._02_reading_and_writing_object_fields;

// ============ READING AND WRITING OBJECT FIELDS ============
// (Leer y escribir los campos de un objeto)

// ---- Dos terminos clave ----
// GETTING (leer)   = obtener el valor de una variable.
// SETTING (escribir) = asignarle un valor a una variable.

// ---- Ejemplo del libro ----
// public class Swan {
//   int numberEggs;                     // variable de instancia
//   public static void main(String[] args) {
//     Swan mother = new Swan();         // crea el objeto
//     mother.numberEggs = 1;            // SET: escribe la variable (le pone 1)
//     System.out.println(mother.numberEggs); // GET: lee la variable para imprimirla
//   }
// }
//
// Se accede al campo con:  objeto.campo   (aqui  mother.numberEggs)
// (En el Cap. 4 se ve como PROTEGER el campo para que no le pongan, por ejemplo,
//  un numero negativo de huevos.)

// ---- Tambien puedes leer/escribir campos en su propia linea de declaracion ----
// 1: public class Name {
// 2:   String first = "Theodore";        // escribe el campo first
// 3:   String last  = "Moose";           // escribe el campo last
// 4:   String full  = first + last;      // LEE first y last, y ESCRIBE full
// 5: }
//
// Linea 2 y 3 -> solo escriben.
// Linea 4     -> hace las dos: lee (first, last) y escribe (full).

// ================= RESUMEN =================
// 1) Leer un campo = "getting"; escribir un campo = "setting".
// 2) Se accede con  objeto.campo  (ej. mother.numberEggs).
// 3) Puedes escribir un campo al declararlo, e incluso usar otros campos
//    ya declarados para calcular su valor.

public class ReadingAndWritingObjectFields {
}