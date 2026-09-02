package methods_and_encapsulation._04_passing_data_among_methods;

// ====== PASAR DATOS ENTRE METODOS (pass-by-value) ======
//
// Java es "pass-by-value": al pasar algo a un metodo, se pasa una COPIA. Lo que el
// metodo le ASIGNE a su parametro NO afecta al original de afuera.
//
// Con primitivos:
//   int num = 4;
//   newNumber(5);              // dentro num=8, pero...
//   System.out.println(num);   // 4 (el de afuera no cambio)
//
// Con referencias, TAMBIEN se copia (la flecha, no el objeto):
//   String name = "Webby";
//   speak(name);               // dentro name="Sparky"
//   System.out.println(name);  // Webby (reasignar el parametro no afecta afuera)
//
// PERO si LLAMAS UN METODO sobre el objeto (no reasignas), si se ve afuera:
//   StringBuilder name = new StringBuilder();
//   speak(name);               // dentro: s.append("Webby")  <- cambia el objeto
//   System.out.println(name);  // Webby (porque los dos apuntan al mismo objeto)
//
// Regla: REASIGNAR el parametro NO afecta afuera; LLAMAR metodos sobre el objeto SI.
//
// TRAMPA: si ignoras el valor que devuelve un metodo, se pierde:
//   number(number);           // devuelve algo pero no se guarda -> no cambia nada
//   letters = letters(letters); // aqui SI se guarda -> si cambia
//
// EN CORTO: Java pasa COPIAS; reasignar el parametro no afecta al original, pero
//           llamar metodos sobre el objeto si; y si ignoras el return, se pierde.

public class PassingDataAmongMethods {
}
