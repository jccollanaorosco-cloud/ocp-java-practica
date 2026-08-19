package java_building_blocks._01_java_class_structure._01_fields_and_methods;

// ============ FIELDS AND METHODS (campos y metodos) ============
//
// Una clase Java tiene 2 elementos principales (= sus "members"):
//   - fields (campos)   = variables. Guardan el ESTADO.
//   - methods (metodos) = operan sobre ese estado.
//
// Clase mas simple posible:
//   public class Animal { }
//     public -> otras clases pueden usarla
//     class  -> defines una clase
//     Animal -> nombre de la clase
//
// Con un campo:
//   String name;   -> variable "name" de tipo String (texto).
//
// Metodos (ver la clase de abajo):
//   public String getName()          -> devuelve un String (return type = String)
//   public void setName(String n)    -> void = no devuelve nada;
//                                       recibe un PARAMETRO (n de tipo String)
//
// method signature (firma) = declaracion completa del metodo. Ejemplo:
//   public int numberVisitors(int month)
//     return type = int ; parametro = month (int)
//
// RESUMEN: campos guardan estado; metodos operan sobre el.
//          void = no retorna; parametro = dato que recibe el metodo.

public class Animal {
    String name;

    public String getName() {
        return name;
    }

    public void setName(String newName) {
        name = newName;
    }
}