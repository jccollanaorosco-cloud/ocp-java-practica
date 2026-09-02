package methods_and_encapsulation._06_creating_constructors._05_final_fields;

// ====== CAMPOS final ======
//
// Una variable de instancia final se debe asignar EXACTAMENTE una vez. Se puede hacer:
//   - en la linea donde se declara,
//   - en un bloque inicializador de instancia,
//   - o EN EL CONSTRUCTOR.
//
//   public class MouseHouse {
//       private final int volume;
//       private final String name = "The Mouse House";   // asignada al declarar
//       public MouseHouse(int l, int w, int h) {
//           volume = l * w * h;   // asignada en el constructor -> OK
//       }
//   }
//
// Para cuando el constructor termina, TODAS las final ya deben tener valor.
//
// EN CORTO: un campo final se asigna una sola vez; el constructor es un lugar valido
//           para hacerlo, pero al terminar el constructor no puede quedar sin valor.

public class FinalFields {
}
