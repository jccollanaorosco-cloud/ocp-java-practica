package methods_and_encapsulation._03_applying_access_modifiers._07_static_variables;

// ====== VARIABLES static (y constantes) ======
//
// Una static se puede inicializar donde se declara:
//   private static int counter = 0;
//
// CONSTANTE = una static que nunca cambia. Usa 'final' y se nombra en MAYUS_CON_GUION:
//   private static final int NUM_BUCKETS = 45;
//   NUM_BUCKETS = 5;   // NO COMPILA (una final no se puede reasignar)
//
// OJO con final + objeto: no puedes REASIGNAR la variable, pero SI puedes usar sus metodos:
//   private static final ArrayList<String> values = new ArrayList<>();
//   values.add("changed");   // OK (no reasignas values, solo la usas)
//   values = new ArrayList<>(); // esto SI seria error
//
// EN CORTO: final = constante (no se reasigna), se nombra en MAYUS; pero con objetos
//           final, aun puedes llamar sus metodos (add), solo no reasignar.

public class StaticVariables {
}
