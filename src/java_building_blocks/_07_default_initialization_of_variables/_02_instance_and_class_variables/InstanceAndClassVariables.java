package java_building_blocks._07_default_initialization_of_variables._02_instance_and_class_variables;

// ============ INSTANCE AND CLASS VARIABLES ============
//
// Las variables que NO son locales son:
//   - instance variables (= "fields"/campos): una por cada objeto.
//   - class variables: se comparten entre todos los objetos.
//     Se reconocen porque llevan la palabra "static" delante. (mas en Cap. 4)
//
// A diferencia de las locales, estas NO necesitas inicializarlas:
// al declararlas ya reciben un VALOR POR DEFECTO.
//
// ---- Valores por defecto (memorizar, menos el de char) ----
//   boolean               -> false
//   byte, short, int, long-> 0
//   float, double         -> 0.0
//   char                  -> '\u0000' (NUL)
//   cualquier referencia a objeto (String, Date...) -> null
//
// Truco para recordar: el compilador usa lo mas simple ->
//   null para objetos, 0/false para primitivos.
//
// RESUMEN: instance (por objeto) y class (static, compartidas) SI tienen valor por
//          defecto: 0/0.0/false para primitivos y null para referencias.

public class InstanceAndClassVariables {
}