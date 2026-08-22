package java_building_blocks._06_declaring_and_initializing_variables._01_declaring_multiple_variables;

// ============ DECLARING MULTIPLE VARIABLES ============
// (declarar varias variables en una sola linea)
//
// Puedes declarar varias variables en un statement SI son del MISMO tipo.
//
//   String s1, s2;                -> declara 2 (ninguna inicializada)
//   String s3 = "yes", s4 = "no"; -> declara 2 e inicializa las 2
//   -> total: 4 variables String
//
// TRAMPA del examen:
//   int i1, i2, i3 = 0;   -> declara 3, pero SOLO inicializa i3.
//   (cada parte separada por coma es su propia declaracion; el = 0 es solo de i3)
//
// NO compila (tipos distintos en el mismo statement):
//   int num, String value;   // DOES NOT COMPILE
//   (el atajo de la coma solo sirve si comparten tipo)
//
// ---- Cuales son legales ----
//   boolean b1, b2;          -> LEGAL (2 sin inicializar)
//   String s1 = "1", s2;     -> LEGAL (2, solo una inicializada)
//   double d1, double d2;    -> NO LEGAL (no se repite el tipo; seria: double d1, d2;)
//   int i1; int i2;          -> LEGAL (son 2 statements separados por ; en la misma linea)
//   int i3; i4;              -> NO LEGAL (i4 no tiene tipo -> "i4;" solo, invalido)
//
// TIP examen: si ves un ; raro, imagina cada parte en su propia linea y evalua.
//
// RESUMEN: coma para varias variables SOLO del mismo tipo, sin repetir el tipo;
//          cada = inicializa solo a SU variable; el ; separa statements distintos.

public class DeclaringMultipleVariables {
}