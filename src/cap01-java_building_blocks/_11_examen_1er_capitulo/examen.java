package java_building_blocks._11_examen_1er_capitulo;
 
// ==========================================================================
//                  EXAMEN CAPITULO 1 - Java Building Blocks
//     
// ==========================================================================
 
// --------------------------------------------------------------------------
// 1. Cuales de los siguientes son identificadores validos en Java? (varias)
//    A. A$B
//    B. _helloWorld
//    C. true
//    D. java.lang
//    E. Public
//    F. 1980_s
// RESPUESTA: A, B, E
// Regla: empieza con letra, $ o _; luego admite numeros; no ser palabra reservada.
//   A y B validos; E valido (Public con P mayus NO es la reservada public).
//   C no (true es reservada); D no (tiene punto); F no (empieza con numero).
// --------------------------------------------------------------------------
 
// --------------------------------------------------------------------------
// 2. Cual es la salida del siguiente programa?
//    1: public class WaterBottle {
//    2:   private String brand;
//    3:   private boolean empty;
//    4:   public static void main(String[] args) {
//    5:     WaterBottle wb = new WaterBottle();
//    6:     System.out.print("Empty = " + wb.empty);
//    7:     System.out.print(", Brand = " + wb.brand);
//    8: } }
//    A. Line 6 generates a compiler error.
//    B. Line 7 generates a compiler error.
//    C. There is no output.
//    D. Empty = false, Brand = null
//    E. Empty = false, Brand =
//    F. Empty = null, Brand = null
// RESPUESTA: D
// Instance vars con default: boolean=false, String=null. No hay error de compilacion.
// --------------------------------------------------------------------------
 
// --------------------------------------------------------------------------
// 3. Cuales son verdaderas? (varias)
//    4: short numPets = 5;
//    5: int numGrains = 5.6;
//    6: String name = "Scruffy";
//    7: numPets.length();
//    8: numGrains.length();
//    9: name.length();
//    A. Line 4 generates a compiler error.
//    B. Line 5 generates a compiler error.
//    C. Line 6 generates a compiler error.
//    D. Line 7 generates a compiler error.
//    E. Line 8 generates a compiler error.
//    F. Line 9 generates a compiler error.
//    G. The code compiles as is.
// RESPUESTA: B, D, E
//   L5: 5.6 no cabe en int. L7 y L8: los primitivos no tienen metodos.
//   L9 compila (String si tiene length()).
// --------------------------------------------------------------------------
 
// --------------------------------------------------------------------------
// 4. Dada la clase Snake, cual es verdadera? (varias)
//    1: public class Snake {
//    3:   public void shed(boolean time) {
//    5:     if (time) {
//    7:     }
//    8:     System.out.println(result);
//    10:  }
//    11: }
//    A. Si se inserta String result = "done"; en linea 2, compila.
//    B. Si se inserta en linea 4, compila.
//    C. Si se inserta en linea 6, compila.
//    D. Si se inserta en linea 9, compila.
//    E. Ninguno de los cambios hace que compile.
// RESPUESTA: E
// result se usa en la linea 8 (fuera del if). Dentro del if sale de scope;
// en la linea 9 va despues del uso. Ninguna opcion lo deja en scope y declarado antes.
// --------------------------------------------------------------------------
 
// --------------------------------------------------------------------------
// 5. Que import(s) puede(n) reemplazar INSERT IMPORTS HERE para compilar? (varias)
//    package aquarium;            public class Tank { }
//    package aquarium.jellies;    public class Jelly { }
//    package visitor;  INSERT IMPORTS HERE
//    public class AquariumVisitor { public void admire(Jelly jelly) { } }
//    A. import aquarium.*;
//    B. import aquarium.*.Jelly;
//    C. import aquarium.jellies.Jelly;
//    D. import aquarium.jellies.*;
//    E. import aquarium.jellies.Jelly.*;
//    F. Ninguno.
// RESPUESTA: C, D
// Jelly esta en aquarium.jellies -> import explicito (C) o su comodin (D).
//   A no baja a subpaquetes; B y E son sintaxis invalida.
// --------------------------------------------------------------------------
 
// --------------------------------------------------------------------------
// 6. Cuantos imports como MAXIMO se pueden quitar y aun compilar?
//    package aquarium; public class Water { }
//    package aquarium;
//    import java.lang.*;
//    import java.lang.System;
//    import aquarium.Water;
//    import aquarium.*;
//    public class Tank { public void print(Water water){ System.out.println(water); } }
//    A. 0   B. 1   C. 2   D. 3   E. 4   F. No compila.
// RESPUESTA: D  (3)
// Sobran: java.lang.* y java.lang.System (java.lang es automatico) y aquarium.Water
// (mismo paquete; ademas aquarium.* ya lo cubre).
// --------------------------------------------------------------------------
 
// --------------------------------------------------------------------------
// 7. Dos clases Water. Que snippets compilan? (varias)
//    package aquarium;           public class Water { boolean salty=false; }
//    package aquarium.jellies;   public class Water { boolean salty=true; }
//    package employee; INSERT IMPORTS HERE
//    public class WaterFiller { Water water; }
//    A. import aquarium.*;
//    B. import aquarium.Water;  import aquarium.jellies.*;
//    C. import aquarium.*;      import aquarium.jellies.Water;
//    D. import aquarium.*;      import aquarium.jellies.*;
//    E. import aquarium.Water;  import aquarium.jellies.Water;
//    F. Ninguno.
// RESPUESTA: B, C
// 
// --------------------------------------------------------------------------
 
// --------------------------------------------------------------------------
// 8. Cual llamada imprime "Blue Jay"?  (System.out.println(name[1]);)
//    A. java BirdDisplay Sparrow Blue Jay
//    B. java BirdDisplay Sparrow "Blue Jay"
//    C. java BirdDisplay Blue Jay Sparrow
//    D. java BirdDisplay "Blue Jay" Sparrow
//    E. java BirdDisplay.class Sparrow "Blue Jay"
//    F. java BirdDisplay.class "Blue Jay" Sparrow
//    G. No compila.
// RESPUESTA: B
// name[1] = SEGUNDO argumento (indices desde 0). "Blue Jay" entre comillas = 1 arg.
//   En B: name[0]=Sparrow, name[1]=Blue Jay. Las de .class fallan (se pasa la clase sin extension).
// --------------------------------------------------------------------------
 
// --------------------------------------------------------------------------
// 9. Que llena legalmente:  public static void main( ____ )  ? (varias)
//    A. String[] _names
//    B. String[] 123
//    C. String abc[]
//    D. String _Names[]
//    E. String... $n
//    F. String names
//    G. Ninguno.
// RESPUESTA: A, C, D, E
// Debe ser array de String con nombre valido.
//   B no (nombre empieza con numero); F no (sin [], no es array).
// --------------------------------------------------------------------------
 
// --------------------------------------------------------------------------
// 10. Cuales son puntos de entrada (main) legales ejecutables? (varias)
//    A. private static void main(String[] args)
//    B. public static final main(String[] args)
//    C. public void main(String[] args)
//    D. public static void test(String[] args)
//    E. public static void main(String[] args)
//    F. public static main(String[] args)
//    G. Ninguno.
// RESPUESTA: E
// Debe ser public, static, void y llamarse main.
//   A (private), B (sin void), C (no static), D (se llama test), F (sin void).
// --------------------------------------------------------------------------
 
// --------------------------------------------------------------------------
// 11. Cuales son verdaderas? (varias)  [defaults de INSTANCE variables]
//    A. double defaults to null.
//    B. int defaults to null.
//    C. String defaults to null.
//    D. double defaults to 0.0.
//    E. int defaults to 0.0.
//    F. String defaults to 0.0.
//    G. Ninguno.
// RESPUESTA: C, D
//   String -> null (C);  double -> 0.0 (D).
// --------------------------------------------------------------------------
 
// --------------------------------------------------------------------------
// 12. Cuales son verdaderas? (varias)  [defaults de LOCAL variables]
//    A. boolean defaults to null.
//    B. float defaults to 0.
//    C. Object defaults to null.
//    D. boolean defaults to false.
//    E. boolean defaults to true.
//    F. float defaults to 0.0.
//    G. Ninguno.
// RESPUESTA: G
// TRAMPA: las variables LOCALES no tienen valor por defecto. Toda afirmacion
// "una local defaults to X" es FALSA -> G.
// --------------------------------------------------------------------------
 
// --------------------------------------------------------------------------
// 13. Cuales son verdaderas? (varias)  [defaults de INSTANCE variables]
//    A. boolean defaults to false.
//    B. boolean defaults to true.
//    C. boolean defaults to null.
//    D. int defaults to 0.
//    E. int defaults to 0.0.
//    F. int defaults to null.
//    G. Ninguno.
// RESPUESTA: A, D
//   
// --------------------------------------------------------------------------
 
// --------------------------------------------------------------------------
// 14. Archivo en /my/directory/named/A/Bird.java. Compilando desde /my/directory,
//     que reemplaza INSERT CODE HERE? (varias)
//    A. package my.directory.named.a;
//    B. package my.directory.named.A;
//    C. package named.a;
//    D. package named.A;
//    E. package a;
//    F. package A;
//    G. No compila.
// RESPUESTA: B
// El package debe reflejar la ruta EXACTA desde /my/directory, con la A mayuscula
// (Java distingue mayus/minus).
// --------------------------------------------------------------------------
 
// --------------------------------------------------------------------------
// 15. Que lineas compilan? (varias)  [guiones bajos en numeros]
//    A. int i1 = 1_234;
//    B. double d1 = 1_234_.0;
//    C. double d2 = 1_234._0;
//    D. double d3 = 1_234.0_;
//    E. double d4 = 1_234.0;
//    F. Ninguno.
// RESPUESTA: A, E
//   A y E validos. B, C, D tienen _ pegado a un punto decimal o al final -> no compilan.
// --------------------------------------------------------------------------
 
// --------------------------------------------------------------------------
// 16. Que reemplaza INSERT CODE HERE para compilar? (varias)
//    public class Price { public void admission() {
//      INSERT CODE HERE
//      System.out.println(amount); } }
//    A. int amount = 9L;
//    B. int amount = 0b101;
//    C. int amount = 0xE;
//    D. double amount = 0xE;
//    E. double amount = 1_2_.0_0;
//    F. int amount = 1_2_;
//    G. Ninguno.
// RESPUESTA: B, C, D
//   0b101 (binario) y 0xE (hex) son int (B, C); 0xE tambien cabe en double (D).
//   A: 9L es long (no cabe en int). E y F: _ mal colocado.
// --------------------------------------------------------------------------
 
// --------------------------------------------------------------------------
// 17. Cuales son verdaderas? (varias)
//    public class Bunny { public static void main(String[] args) {
//      Bunny bun = new Bunny(); } }
//    A. Bunny is a class.
//    B. bun is a class.
//    C. main is a class.
//    D. Bunny is a reference to an object.
//    E. bun is a reference to an object.
//    F. main is a reference to an object.
//    G. Ninguno.
// RESPUESTA: A, E
//   Bunny es una clase (A); bun es una referencia a un objeto (E). main es un metodo.
// --------------------------------------------------------------------------
 
// --------------------------------------------------------------------------
// 18. Orden en que se pueden ensamblar para compilar? (varias)
//    A: class Rabbit {}   B: import java.util.*;   C: package animals;
//    A. A, B, C
//    B. B, C, A
//    C. C, B, A
//    D. B, A
//    E. C, A
//    F. A, C
//    G. A, B
// RESPUESTA: C, E
//   Orden PIC (package, import, class): C,B,A -> opcion C.
//   Sin import (opcional): package, class -> C,A -> opcion E.
// --------------------------------------------------------------------------
 
// --------------------------------------------------------------------------
// 19. Cuando es elegible cada objeto para GC? (varias)
//    1: public class Rabbit { 2: public static void main(String[] args) {
//    3: Rabbit one = new Rabbit();
//    4: Rabbit two = new Rabbit();
//    5: Rabbit three = one;
//    6: one = null;
//    7: Rabbit four = one;
//    8: three = null;
//    9: two = null;
//    10: two = new Rabbit();
//    11: System.gc();
//    12: } }
//    A. Objeto de linea 3, elegible tras linea 6.
//    B. Objeto de linea 3, elegible tras linea 8.
//    C. Objeto de linea 3, elegible tras linea 12.
//    D. Objeto de linea 4, elegible tras linea 9.
//    E. Objeto de linea 4, elegible tras linea 11.
//    F. Objeto de linea 4, elegible tras linea 12.
// RESPUESTA: B, D
//   Obj linea 3: lo apuntan 'one' y 'three=one'; one=null (l.6) no basta; three=null (l.8)
//     lo deja sin refs -> elegible tras l.8 (B).
//   Obj linea 4: lo apunta 'two'; two=null (l.9) lo deja sin refs -> elegible tras l.9 (D).
// --------------------------------------------------------------------------
 
// --------------------------------------------------------------------------
// 20. Que es verdad? (varias)
//    public class Bear { protected void finalize(){ System.out.println("Roar!"); }
//      public static void main(String[] args){ Bear bear=new Bear(); bear=null; System.gc(); } }
//    A. finalize() se llama con seguridad.
//    B. finalize() puede o no llamarse.
//    C. finalize() seguro NO se llama.
//    D. El GC seguro corre.
//    E. El GC puede o no correr.
//    F. El GC seguro NO corre.
//    G. No compila.
// RESPUESTA: B, E
//   finalize() puede o no llamarse (B); el GC puede o no correr (E).
//   System.gc() solo sugiere; nada garantizado. El codigo compila.
// --------------------------------------------------------------------------
 
// --------------------------------------------------------------------------
// 21. Que imprime?
//    1: public class Salmon { 2: int count;
//    3: public void Salmon() { 4: count = 4; 5: }
//    6: public static void main(String[] args) {
//    7: Salmon s = new Salmon(); 8: System.out.println(s.count); 9: } }
//    A. 0
//    B. 4
//    C. Falla la compilacion en la linea 3.
//    D. Falla en la linea 4.
//    E. Falla en la linea 7.
//    F. Falla en la linea 8.
// RESPUESTA: A  (imprime 0)
// public void Salmon() tiene tipo de retorno (void) -> NO es constructor, es metodo
// normal; no se llama con new. count queda en su default 0.
// --------------------------------------------------------------------------
 
// --------------------------------------------------------------------------
// 22. Cuales son verdaderas? (varias)
//    A. Java permite sobrecarga de operadores.
//    B. Codigo compilado en Windows corre en Linux.
//    C. Java tiene punteros a posiciones de memoria.
//    D. Java es un lenguaje procedural.
//    E. Java es un lenguaje orientado a objetos.
//    F. Java es un lenguaje de programacion funcional.
// RESPUESTA: B, E
//
// --------------------------------------------------------------------------
 
// --------------------------------------------------------------------------
// 23. Cuales son verdaderas? (varias)
//    A. javac compila un .class en un .java.
//    B. javac compila un .java en un .bytecode.
//    C. javac compila un .java en un .class.
//    D. java toma el nombre de la clase como parametro.
//    E. java toma el nombre del archivo .bytecode como parametro.
//    F. java toma el nombre del archivo .class como parametro.
// RESPUESTA: C, D
//   C: javac: .java -> .class.   D: java recibe el NOMBRE de la clase (sin extension).
// --------------------------------------------------------------------------
 public class examen {
}
