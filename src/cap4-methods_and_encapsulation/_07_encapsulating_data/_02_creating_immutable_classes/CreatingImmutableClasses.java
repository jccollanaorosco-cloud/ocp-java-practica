package methods_and_encapsulation._07_encapsulating_data._02_creating_immutable_classes;

// ====== CLASES INMUTABLES (que no cambian) ======
//
// Inmutable = una vez creado el objeto, NO se puede cambiar. Se logra:
//   - SIN setters (solo getters).
//   - dando los valores en el CONSTRUCTOR.
//
//   public class ImmutableSwan {
//       private int numberEggs;
//       public ImmutableSwan(int numberEggs) { this.numberEggs = numberEggs; }
//       public int getNumberEggs() { return numberEggs; }   // solo getter
//   }
//   (inmutable se mide DESPUES de construir: puede tener valores, solo no cambian luego)
//
// CUIDADO con objetos mutables adentro (StringBuilder): si guardas o devuelves el
// MISMO objeto, dejas de ser inmutable. Solucion: COPIA defensiva.
//   public Mutable(StringBuilder b) { builder = new StringBuilder(b); } // copia al recibir
//   public StringBuilder getBuilder() { return new StringBuilder(builder); } // copia al dar
//   // o devolver algo inmutable:
//   public String getValue() { return builder.toString(); }
//
// Encapsular = evitar que cambien los campos DIRECTAMENTE.
// Inmutable   = evitar que cambien los campos DEL TODO.
//
// EN CORTO: inmutable = sin setters, valores por constructor; con objetos mutables
//           adentro, haz copias defensivas al recibir y al devolver.

public class CreatingImmutableClasses {
}
