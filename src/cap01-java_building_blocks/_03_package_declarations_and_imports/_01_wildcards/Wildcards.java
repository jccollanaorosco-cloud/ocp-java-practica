package java_building_blocks._03_package_declarations_and_imports._01_wildcards;

// ================= WILDCARDS (import con *) =================
//
// Las clases de un mismo paquete suelen importarse juntas. En vez de importarlas
// una por una, puedes usar un atajo con * (comodin / wildcard).

// ---- Ejemplo del libro ----
// import java.util.*;   -> importa TODAS las clases del paquete java.util
//                          (entre ellas java.util.Random).
//
// public class ImportExample {
//   public static void main(String[] args) {
//     Random r = new Random();          -> crea un objeto Random
//     System.out.println(r.nextInt(10)); -> imprime un numero al azar de 0 a 9
//   }
// }

// ---- Que hace el * exactamente ----
// El * es un comodin que coincide con TODAS las clases del paquete.
// Con java.util.* , toda clase de java.util queda disponible al compilar.
//
// OJO, el * SOLO importa CLASES. NO importa:
//   - subpaquetes (paquetes hijos)
//   - campos (fields)
//   - metodos
// (Existe un caso especial, el "static import", que importa otros tipos;
//  eso se ve en el Capitulo 4.)

// ---- Mito: "importar muchas clases hace lento el programa" ----
// FALSO. No lo hace lento. El compilador se encarga de averiguar que se usa
// realmente. Cual approach usar es preferencia personal.

// ---- Los dos estilos (ambos aparecen en el examen) ----
// 1) Listar cada clase:  import java.util.Random;
//    -> codigo mas facil de leer, sobre todo para principiantes.
// 2) Usar el comodin:    import java.util.*;
//    -> acorta la lista de imports.

// Para probarlo de verdad, el import va ARRIBA del todo, justo despues del package:
// import java.util.*;

public class Wildcards {
    public static void main(String[] args) {
        // Version funcional (adaptada al nombre de este archivo).
        // NOTA: para que esto corra, descomenta el import de arriba
        //       (import java.util.*;) que debe ir justo despues del package.
        // Random r = new Random();
        // System.out.println(r.nextInt(10));
    }
}