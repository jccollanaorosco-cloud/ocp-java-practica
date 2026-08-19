package java_building_blocks._04_creating_objects._03_instance_initializer_blocks;

// ============ INSTANCE INITIALIZER BLOCKS ============
//
// Code block = codigo entre llaves { }.
//   - Dentro de un metodo -> corre cuando llamas al metodo.
//   - FUERA de un metodo   -> es un "instance initializer".
//
// Ejemplo:
//   3: public static void main(String[] args) {
//   4:   { System.out.println("Feathers"); }
//   5: }
//   6: { System.out.println("Snowy"); }
//
//   -> 3 bloques de codigo  y  1 instance initializer.
//
// Contar bloques  = contar pares de { }  (deben estar balanceados o no compila).
// Contar initializers = solo los { } que estan FUERA de un metodo (aqui: linea 6).
//
// RESUMEN:
//   bloque = { }.  Dentro de metodo corre al llamarlo; fuera = instance initializer.
//   Bloques: cuenta todos los { }.  Initializers: solo los { } fuera de metodos.

public class InstanceInitializerBlocks {
}