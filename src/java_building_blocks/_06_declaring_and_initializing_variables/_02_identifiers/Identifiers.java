package java_building_blocks._06_declaring_and_initializing_variables._02_identifiers;

// ============ IDENTIFIERS (nombres validos) ============
// Aplica a variables, metodos, clases y campos.
//
// 3 REGLAS de un identificador legal:
//   1) Empieza con LETRA, $ o _   (no con numero)
//   2) Los siguientes caracteres pueden incluir numeros
//   3) NO puede ser una palabra reservada de Java (class, public, int, ...)
//
// Java distingue mayus/minus, pero NO uses versiones tipo "Class" para evadir (mala idea).
//
// ---- LEGALES ----
//   okidentifier
//   $OK2Identifier
//   _alsoOK1d3ntifi3r
//   __SStillOkbutKnotsonice$
//
// ---- NO legales ----
//   3DPointClass   -> empieza con numero
//   hollywood@vine -> @ no es letra, digito, $ ni _
//   *$coffee       -> * no es letra, digito, $ ni _
//   public         -> es palabra reservada
//
// Convencion: CamelCase (cada palabra con mayuscula inicial) -> ThisIsMyClass.
// TIP examen: si ves un identificador raro, primero revisa si es LEGAL;
//             si no lo es -> "does not compile" y ya no analices nada mas.
//
// RESUMEN: empieza con letra/$/_, luego admite numeros, y no puede ser palabra reservada.

public class Identifiers {
}