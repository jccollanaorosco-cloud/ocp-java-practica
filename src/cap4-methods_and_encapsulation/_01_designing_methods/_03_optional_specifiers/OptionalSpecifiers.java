package methods_and_encapsulation._01_designing_methods._03_optional_specifiers;

// ====== ESPECIFICADORES OPCIONALES ======
//
// Van despues del acceso. Puedes poner 0, 1 o varios, en cualquier orden.
// Los que importan:
//   static   -> metodo de CLASE (no necesita objeto).  (mas adelante)
//   final    -> no se puede sobreescribir en subclases. (Cap 5)
//   abstract -> sin cuerpo. (Cap 5)
//   (synchronized, native, strictfp: no entran al examen OCA)
//
// Que compila:
//   public final void walk2() {}          // OK
//   public static final void walk3() {}   // OK
//   public final static void walk4() {}   // OK (el orden de final/static da igual)
//   public modifier void walk5() {}       // NO COMPILA (modifier no existe)
//   public void final walk6() {}          // NO COMPILA (especificador va ANTES del tipo)
//   final public void walk7() {}          // OK (raro, pero se permite antes del acceso)
//
// EN CORTO: static/final/abstract van despues del acceso, en cualquier orden;
//           siempre ANTES del tipo de retorno.

public class OptionalSpecifiers {
}
