package java_building_blocks._03_package_declarations_and_imports._03_naming_conflicts;

// ================= NAMING CONFLICTS (nombres que chocan) =================
//
// Los paquetes permiten que dos clases tengan el MISMO nombre en lugares distintos.
// Ejemplo clasico: la clase Date existe en DOS paquetes:
//   java.util.Date   y   java.sql.Date

// ---- Caso simple: quiero la Date de java.util ----
// import java.util.*;      -> sirve
// import java.util.Date;   -> sirve (mas claro)

// ---- Caso que NO compila: Date en dos comodines ----
// import java.util.*;
// import java.sql.*;   // DOES NOT COMPILE
// Error: "The type Date is ambiguous"  (Java no sabe cual Date usar)

// ---- Solucion: el import EXPLICITO gana sobre el comodin ----
// import java.util.Date;   -> explicito: manda esta
// import java.sql.*;       -> comodin: trae el resto de java.sql
// Ahora SI compila: Java usa java.util.Date y de java.sql toma las demas clases.

// ---- Empate de explicitos: NO compila ----
// import java.util.Date;
// import java.sql.Date;
// Error: "The import java.sql.Date collides with another import statement"
// (no puede haber DOS "por defecto" para el mismo nombre)

// ================= USAR LAS DOS Date A LA VEZ =================
//
// Opcion A: importas una, y a la otra la llamas por su NOMBRE COMPLETO
//           (paquete + punto + clase = "fully qualified name"):
//   import java.util.Date;
//   public class Conflicts {
//       Date date;                 -> es java.util.Date (la importada)
//       java.sql.Date sqlDate;     -> nombre completo para la otra
//   }
//
// Opcion B: no importas ninguna y usas el nombre completo en ambas:
//   public class Conflicts {
//       java.util.Date date;
//       java.sql.Date sqlDate;
//   }

// ================= RESUMEN =================
// 1) Dos comodines con la misma clase -> "ambiguous", no compila.
// 2) El import EXPLICITO gana sobre el comodin (*).
// 3) Dos imports explicitos del mismo nombre -> "collides", no compila.
// 4) Para usar ambas: importa una y a la otra llamala por su nombre completo
//    (paquete.Clase), o usa el nombre completo en las dos.

public class NamingConflicts {
}