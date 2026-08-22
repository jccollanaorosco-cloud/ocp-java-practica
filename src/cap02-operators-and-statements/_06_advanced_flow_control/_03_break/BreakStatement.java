package operators_and_statements._06_advanced_flow_control._03_break;

// ====== BREAK (salir del bucle de golpe) ======
//
// break CORTA el bucle y sale de una. Sin etiqueta, sale del bucle MAS CERCANO.
//   for (...) {
//       if (encontre) {
//           break;   // me salgo del for ya mismo
//       }
//   }
//
// Con ETIQUETA, puedes salir de un bucle de AFUERA (no solo del interno):
//   PARENT_LOOP: for (int i=0; i<list.length; i++) {
//       for (int j=0; j<list[i].length; j++) {
//           if (list[i][j] == buscado) {
//               break PARENT_LOOP;   // sale de TODO, no solo del for interno
//           }
//       }
//   }
//
// Detalle: con  break PARENT_LOOP  encuentra el PRIMER valor y sale.
//          con  break  (sin etiqueta) solo sale del for interno, sigue el externo.
//          sin  break  recorre todo y se queda con el ULTIMO que coincida.
//
// EN CORTO: break sale del bucle; sin etiqueta del mas cercano, con etiqueta
//           del que tu digas (util en bucles anidados).

public class BreakStatement {
}
