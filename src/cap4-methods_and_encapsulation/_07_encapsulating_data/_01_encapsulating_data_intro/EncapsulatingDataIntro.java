package methods_and_encapsulation._07_encapsulating_data._01_encapsulating_data_intro;

// ====== ENCAPSULAR DATOS (getters y setters) ======
//
// Problema: si un campo no es private, cualquiera lo puede cambiar mal:
//   int numberEggs;    // sin private
//   mother.numberEggs = -1;   // huevos negativos! no queremos eso
//
// Solucion (encapsular): pones el campo PRIVATE y das metodos publicos para leer/escribir,
// con una "guardia" que valida:
//   public class Swan {
//       private int numberEggs;                       // private
//       public int getNumberEggs() { return numberEggs; }   // getter (leer)
//       public void setNumberEggs(int numberEggs) {          // setter (escribir)
//           if (numberEggs >= 0)                              // guardia: no negativos
//               this.numberEggs = numberEggs;
//       }
//   }
//
// Reglas JavaBeans (nombres):
//   - campo private.
//   - getter: getX()  (o isX() si el campo es boolean).
//   - setter: setX(...).
//   - despues de get/set/is va la primera letra del campo en MAYUS.
//   Ejemplos:
//     boolean playing; -> getter correcto es isPlaying() (NO getPlaying)
//     String name;     -> getName()/setName() (name() y setname() estan MAL)
//
// EN CORTO: encapsular = campo private + getX/setX publicos con validacion;
//           boolean usa isX(); respeta las mayusculas.

public class EncapsulatingDataIntro {
}
