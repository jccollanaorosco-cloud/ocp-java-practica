package java_building_blocks._05_object_references_and_primitives._01_primitive_types;

// ============ PRIMITIVE TYPES (8 tipos primitivos) ============
//
// Java tiene 8 tipos primitivos (los bloques basicos):
//   boolean -> true / false
//   byte    -> entero  8 bits  (-128 a 127)
//   short   -> entero 16 bits
//   int     -> entero 32 bits  (por defecto para numeros enteros)
//   long    -> entero 64 bits
//   float   -> decimal 32 bits (necesita una f:  123.45f)
//   double  -> decimal 64 bits (123.456)
//   char    -> caracter Unicode 16 bits  ('a')
//
// Claves:
//   - float y double = decimales; byte/short/int/long = sin decimales.
//   - Cada tipo usa el DOBLE de bits que el menor similar (short = 2x byte...).
//   - float SIEMPRE lleva f al final.

// ---- Literales (numeros escritos en el codigo) ----
// Por defecto un numero entero se asume int.
//   long max = 3123456789;   // DOES NOT COMPILE (se pasa del int)
//   long max = 3123456789L;  // OK -> la L lo marca como long (usa L mayuscula, no l)

// ---- Otras bases ----
//   octal (0-7)      -> prefijo 0     ej. 017   = 15
//   hexadecimal      -> prefijo 0x    ej. 0x1F  = 31
//   binario (0-1)    -> prefijo 0b    ej. 0b11  = 3
//   decimal normal                    ej. 56    = 56

// ---- Guion bajo en numeros (Java 7+) para leerlos mejor ----
//   int m = 1_000_000;   // OK
// NO se permite: al inicio, al final, ni pegado a un punto decimal:
//   _1000.00   // NO
//   1000.00_   // NO
//   1000_.00   // NO
//   1_00_0.0_0 // OK (raro pero legal)

// RESUMEN: 8 primitivos; int es el entero por defecto; float lleva f y long lleva L;
//          prefijos 0/0x/0b para octal/hex/binario; _ solo entre digitos.

public class PrimitiveTypes {
}