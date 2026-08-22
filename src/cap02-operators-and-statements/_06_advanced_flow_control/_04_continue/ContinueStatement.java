package operators_and_statements._06_advanced_flow_control._04_continue;

// ====== CONTINUE (saltar a la siguiente vuelta) ======
//
// continue NO sale del bucle: solo TERMINA la vuelta actual y salta a la siguiente.
// Es como decir "esta vuelta ya, pasa a la que sigue".
//   for (...) {
//       if (algo) {
//           continue;   // salta el resto de ESTA vuelta
//       }
//       System.out.print(...);  // esto se salta cuando hay continue
//   }
//
// Igual que break, puede usar ETIQUETA para saltar la vuelta del bucle de AFUERA:
//   FIRST_CHAR_LOOP: for (int a=1; a<=4; a++) {
//       for (char x='a'; x<='c'; x++) {
//           if (a==2 || x=='b') continue FIRST_CHAR_LOOP;  // salta al bucle externo
//           System.out.print(" " + a + x);
//       }
//   }
//
// Diferencia clave:
//   break    -> se SALE del bucle.
//   continue -> se SALTA lo que falta y sigue con la SIGUIENTE vuelta.
//
// EN CORTO: continue no sale, solo brinca a la siguiente vuelta; con etiqueta
//           brinca la vuelta del bucle que indiques.

public class ContinueStatement {
}
