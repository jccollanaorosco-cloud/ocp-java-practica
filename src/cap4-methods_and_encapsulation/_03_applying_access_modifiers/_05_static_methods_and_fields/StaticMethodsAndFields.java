package methods_and_encapsulation._03_applying_access_modifiers._05_static_methods_and_fields;

// ====== METODOS Y VARIABLES static ======
//
// static = pertenece a la CLASE, no a un objeto. Se comparte entre todos.
// No necesitas crear un objeto para usarlo. El main() es static, por eso arranca solo.
//
// Se llama con el NOMBRE de la clase:
//   System.out.println(Koala.count);
//   Koala.main(new String[0]);
//
// TRAMPA 1: puedes llamar un static desde una variable, y Java mira el TIPO, no el objeto:
//   Koala k = new Koala();
//   System.out.println(k.count);  // 0
//   k = null;
//   System.out.println(k.count);  // 0 (NO da error aunque k sea null! porque count es static)
//
// TRAMPA 2: solo hay UNA copia de la variable static:
//   Koala.count = 4;
//   koala1.count = 6;
//   koala2.count = 5;
//   System.out.println(Koala.count);  // 5 (todos comparten la misma)
//
// Contar instancias es un uso tipico:
//   private static int count;
//   public Counter() { count++; }   // cada objeto nuevo suma 1
//
// EN CORTO: static = de la clase, una sola copia compartida; se llama por el nombre
//           de la clase; ojo, no explota con null porque no usa el objeto.

public class StaticMethodsAndFields {
}
