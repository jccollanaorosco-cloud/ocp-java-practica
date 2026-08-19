package java_building_blocks._03_package_declarations_and_imports._02_redundant_imports;

// ================= REDUNDANT IMPORTS (imports que sobran) =================
//
// java.lang es un paquete ESPECIAL: se importa SOLO, automaticamente.
// Por eso puedes usar System sin ponerle import.

// ---- Ejemplo del libro: cuales imports sobran ----
// 1: import java.lang.System;   -> REDUNDANTE (java.lang ya se importa solo)
// 2: import java.lang.*;        -> REDUNDANTE (java.lang ya se importa solo)
// 3: import java.util.Random;   -> necesario (importa Random)
// 4: import java.util.*;        -> REDUNDANTE aqui (Random ya vino en la linea 3)
//
// -> 3 imports sobran (lineas 1, 2 y 4).
// Nota: si la linea 3 NO existiera, entonces java.util.* (linea 4) YA no sobraria,
//       porque seria la que trae Random.

// ---- Otro caso de redundancia ----
// Importar una clase que esta en el MISMO paquete que la tuya tambien sobra:
// Java ya busca automaticamente en el paquete actual.

// ================= QUE IMPORTS FUNCIONAN =================
// (Ejemplo: Files y Paths estan en el paquete java.nio.file)
//
// Dos formas correctas:
//   import java.nio.file.*;        -> comodin: trae Files y Paths de una
// o bien, explicitos:
//   import java.nio.file.Files;
//   import java.nio.file.Paths;

// ================= IMPORTS QUE NO FUNCIONAN =================
// import java.nio.*;              -> MAL: el * solo cubre CLASES de java.nio,
//                                    no baja a "file.*"
// import java.nio.*.*;            -> MAL: solo se permite UN comodin, y va al final
// import java.nio.file.Paths.*;   -> MAL: no puedes importar metodos, solo clases

// ================= RESUMEN (para el examen) =================
// 1) java.lang se importa automaticamente -> importarlo sobra.
// 2) Clases del mismo paquete -> no hace falta importarlas.
// 3) El * solo trae CLASES de UN paquete, no subpaquetes ni metodos.
// 4) Solo UN comodin por import, y siempre al final.

public class RedundantImports {
}