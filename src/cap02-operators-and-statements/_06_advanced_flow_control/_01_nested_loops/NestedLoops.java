package operators_and_statements._06_advanced_flow_control._01_nested_loops;

// ====== BUCLES ANIDADOS (un bucle dentro de otro) ======
//
// Un for dentro de otro for (o while dentro de while, etc). Sirve para tablas/matrices.
//   int[][] m = {{5,2,1,3},{3,9,8,9},{5,7,12,7}};
//   for (int[] fila : m) {              // el de AFUERA corre 3 veces (una por fila)
//       for (int i=0; i<fila.length; i++) {  // el de ADENTRO corre por cada elemento
//           System.out.print(fila[i] + "\t");
//       }
//       System.out.println();
//   }
//   Imprime la matriz fila por fila.
//
// Idea: por CADA vuelta del de afuera, el de adentro da TODAS sus vueltas.
//
// EN CORTO: bucles dentro de bucles; el interno se ejecuta completo en cada vuelta
//           del externo. Ideal para matrices.

public class NestedLoops {
}
