package methods_and_encapsulation._06_creating_constructors._01_creating_constructors_intro;

// ====== CONSTRUCTORES ======
//
// Un constructor es un metodo especial que: se llama IGUAL que la clase y NO tiene
// tipo de retorno (ni void). Sirve para crear e inicializar el objeto.
//
//   public class Bunny {
//       public Bunny() { System.out.println("constructor"); }
//   }
//
// No son constructores:
//   public bunny() { }       // NO COMPILA (minuscula, no coincide con la clase, y sin tipo)
//   public void Bunny() { }  // es un METODO normal (tiene void), no un constructor
//
// Se llama con new:  new Bunny()  -> Java reserva memoria y llama al constructor.
//
// 'this' sirve para referirte a la variable de instancia cuando choca con un parametro:
//   public class Bunny {
//       private String color;
//       public Bunny(String color) { this.color = color; }  // this.color = el campo
//   }
//   (sin this, Java usa el parametro por defecto)
//
// TRAMPA:  length = this.length;  // al reves! deja el campo en su valor viejo (0)
//
// EN CORTO: constructor = mismo nombre que la clase, sin tipo de retorno; se llama con
//           new; this.x apunta al campo cuando choca con un parametro.

public class CreatingConstructorsIntro {
}
