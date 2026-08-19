package java_building_blocks._04_creating_objects._01_constructors;

// ================= CONSTRUCTORS (constructores) =================
//
// Para crear un objeto (instancia) de una clase, usas la palabra "new".
// Ejemplo:
//   Random r = new Random();
//     Random  -> el tipo que vas a crear
//     r       -> nombre de la variable (donde se guarda la referencia al objeto)
//     new Random() -> crea el objeto de verdad

// ---- Que es Random() ----
// Random() parece un metodo (lleva parentesis), pero es un CONSTRUCTOR:
// un tipo especial de metodo que crea un objeto nuevo.

// ---- Definir tu propio constructor ----
// public class Chick {
//   public Chick() {
//     System.out.println("in constructor");
//   }
// }
//
// DOS reglas clave del constructor:
//   1) su nombre es IGUAL al nombre de la clase (Chick)
//   2) NO tiene tipo de retorno (ni void, ni nada)

// ---- Trampa del examen: esto NO es un constructor ----
// public void Chick() { }   // NOT A CONSTRUCTOR
// Tiene tipo de retorno (void), asi que es un metodo NORMAL, no un constructor.
// No se ejecuta al escribir new Chick().
// Ojo cuando veas un metodo que empieza con mayuscula Y tiene tipo de retorno.

// ---- Para que sirve un constructor ----
// Sirve para INICIALIZAR campos (aunque puedes poner cualquier codigo dentro).
// Otra forma de inicializar es directamente en la linea donde se declara el campo.
// Este ejemplo muestra las DOS formas:
//
// public class Chicken {
//   int numEggs = 0;      // inicializado en la linea
//   String name;
//   public Chicken() {
//     name = "Duke";      // inicializado en el constructor
//   }
// }

// ---- Constructor por defecto ----
// En la mayoria de clases NO necesitas escribir un constructor:
// el compilador te da uno "que no hace nada" (default constructor) automaticamente.
// (Hay un caso que SI obliga a declararlo -> se ve en el Capitulo 5.)

// ================= RESUMEN =================
// 1) new crea objetos: Tipo x = new Tipo();
// 2) El constructor se llama IGUAL que la clase y NO tiene tipo de retorno.
// 3) Si tiene tipo de retorno (ej. void) -> NO es constructor, es metodo normal.
// 4) Sirve para inicializar campos (o poner cualquier codigo).
// 5) Si no escribes uno, el compilador pone un constructor por defecto vacio.

public class Constructors {
}