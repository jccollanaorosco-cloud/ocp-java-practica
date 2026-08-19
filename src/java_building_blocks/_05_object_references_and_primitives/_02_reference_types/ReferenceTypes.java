package java_building_blocks._05_object_references_and_primitives._02_reference_types;

// ============ REFERENCE TYPES (tipos por referencia) ============
//
// Un reference type apunta a un OBJETO (instancia de una clase).
// Diferencia con los primitivos:
//   - primitivo -> guarda el valor directo en su memoria.
//   - referencia -> NO guarda el objeto, guarda la DIRECCION donde esta (un "pointer").
// En Java no puedes ver esa direccion fisica; solo usas la referencia para llegar al objeto.

// ---- Declarar referencias ----
//   java.util.Date today;   // today solo puede apuntar a un objeto Date
//   String greeting;        // greeting solo puede apuntar a un String

// ---- Asignar un valor a una referencia (2 formas) ----
//   1) apuntarla a otro objeto del mismo tipo.
//   2) crear un objeto nuevo con new.
// Ejemplo:
//   today = new java.util.Date();  // today apunta a un Date nuevo
//   greeting = "How are you?";     // greeting apunta a un String
//
// Los objetos NO tienen nombre: solo se acceden a traves de su referencia.

// RESUMEN: una referencia guarda la direccion del objeto (no el objeto).
//          Se le asigna con otro objeto del mismo tipo o con new.

public class ReferenceTypes {
}