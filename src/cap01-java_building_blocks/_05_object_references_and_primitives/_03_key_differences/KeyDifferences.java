package java_building_blocks._05_object_references_and_primitives._03_key_differences;

// ============ KEY DIFFERENCES (primitivo vs referencia) ============
//
// 1) null:
//    - una referencia SI puede ser null (no apunta a ningun objeto).
//    - un primitivo NO puede ser null -> error de compilacion.
//      int value = null;    // DOES NOT COMPILE
//      String s = null;     // OK (String es referencia)
//
// 2) Metodos:
//    - una referencia (si no es null) puede LLAMAR metodos.
//    - un primitivo NO tiene metodos.
//      String reference = "hello";
//      int len = reference.length();   // OK: length() es metodo de String
//      int bad = len.length();         // DOES NOT COMPILE (len es int, no tiene metodos)
//    (se reconoce un metodo por los parentesis () al final)
//
// 3) Nombres:
//    - los primitivos van en minuscula (int, double, boolean...).
//    - las clases de Java empiezan con MAYUSCULA (String, Date...).

// RESUMEN: referencia puede ser null y tiene metodos; primitivo no puede ser null
//          ni tiene metodos. Primitivos = minuscula; clases = Mayuscula.

public class KeyDifferences {
}