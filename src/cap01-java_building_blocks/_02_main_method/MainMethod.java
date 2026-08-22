package java_building_blocks._02_main_method;

// ================= WRITING A main() METHOD =================
//
// El metodo main() es la PUERTA DE ENTRADA del programa: el punto por donde
// la JVM (Java Virtual Machine) empieza a ejecutar tu codigo.
// Sin main(), la JVM no sabe por donde arrancar.

// ---- Ejemplo mas simple del libro ----
// public class Zoo {
//   public static void main(String[] args) {
//   }
// }
// No hace nada util: solo declara el punto de entrada.
// Regla: el archivo debe llamarse igual que la clase -> Zoo.java

// ---- Como se compila y ejecuta (por consola) ----
// javac Zoo.java   -> compila y genera Zoo.class (bytecode que entiende la JVM)
// java Zoo         -> ejecuta (sin poner .class; el punto es reservado en la JVM)
// Necesitas el JDK para COMPILAR (trae el compilador javac).
// Para solo EJECUTAR basta el JRE.

// ---- Dos reglas simples por ahora ----
// 1) Cada archivo contiene una sola clase.
// 2) El nombre del archivo debe coincidir con el de la clase (respetando
//    mayusculas/minusculas) y terminar en .java

// ================= LA FIRMA:  public static void main(String[] args) =================
//
// public       -> modificador de acceso. "public" = se puede llamar desde cualquier lado.
//                 La JVM necesita poder llamarlo, por eso es public.
//
// static       -> ata el metodo a la CLASE, no a un objeto. Asi la JVM lo llama como
//                 Zoo.main() sin tener que crear un objeto primero.
//                 Si main() NO es static, Java lanza error y no arranca.
//
// void         -> tipo de retorno. main() no devuelve ningun valor.
//
// main         -> el nombre EXACTO que la JVM busca. Si lo escribes distinto, no arranca.
//
// String[] args -> lista de argumentos que se pasan al iniciar el programa.
//                  Se puede escribir de 3 formas equivalentes:
//                     String[] args   /   String args[]   /   String... args
//                  [] = arreglo (lista fija de elementos del mismo tipo).
//                  ... = varargs (lista variable de argumentos).
//                  El nombre "args" es libre, puedes usar otro.

// ================= USANDO LOS ARGUMENTOS =================
//
// public class Zoo {
//   public static void main(String[] args) {
//     System.out.println(args[0]);   -> imprime el PRIMER argumento
//     System.out.println(args[1]);   -> imprime el SEGUNDO argumento
//   }
// }
// OJO: los indices de un arreglo empiezan en 0 en Java (args[0] es el primero).
//
// Ejecucion:  java Zoo Bronx Zoo   -> imprime:  Bronx  /  Zoo
// Los espacios separan argumentos. Para un argumento con espacios, usa comillas:
//   java Zoo "San Diego" Zoo       -> imprime:  San Diego  /  Zoo
// Todos los argumentos se tratan como String, aunque parezcan numeros:
//   java Zoo Zoo 2                 -> imprime:  Zoo  /  2  (el 2 es texto)
//
// Si pides args[1] pero no pasaste un segundo argumento:
//   java Zoo Zoo
// Java imprime "Zoo" y luego falla con:
//   java.lang.ArrayIndexOutOfBoundsException: 1
// (intentaste leer una posicion del arreglo que no existe).

// ================= RESUMEN =================
// - JDK: necesario para COMPILAR (incluye el compilador). JRE: suficiente para EJECUTAR.
// - Los .class corren en la JVM, por eso funcionan en cualquier maquina con Java.

public class MainMethod {
    public static void main(String[] args) {
        // Version funcional del ejemplo, adaptada al nombre de este archivo.
        // Pulsa Run para ver la salida:
        System.out.println("Welcome!");
    }
}