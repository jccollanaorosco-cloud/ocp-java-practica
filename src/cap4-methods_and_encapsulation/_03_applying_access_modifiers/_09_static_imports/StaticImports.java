package methods_and_encapsulation._03_applying_access_modifiers._09_static_imports;

// ====== IMPORTS static ======
//
// Un import normal trae CLASES. Un import static trae MIEMBROS static (metodos/variables)
// para usarlos sin escribir el nombre de la clase cada vez.
//
//   import static java.util.Arrays.asList;   // importa el metodo asList
//   ...
//   List<String> list = asList("one", "two");  // ya no escribes Arrays.asList
//
// Errores tipicos (el examen los adora):
//   import static java.util.Arrays;         // NO COMPILA (static import es para MIEMBROS, no clases)
//   static import java.util.Arrays.*;       // NO COMPILA (es "import static", no "static import")
//   Arrays.asList("one");                   // NO COMPILA si NO importaste la clase Arrays (solo el metodo)
//
// Si importas dos miembros con el MISMO nombre -> error (igual que con clases).
//
// EN CORTO: import static trae metodos/variables static; se escribe "import static";
//           es para miembros, no para clases.

public class StaticImports {
}
