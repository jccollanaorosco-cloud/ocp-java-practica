package methods_and_encapsulation._01_designing_methods._04_return_type;

// ====== TIPO DE RETORNO (que devuelve el metodo) ======
//
// Es OBLIGATORIO. Si no devuelve nada, se pone void ("sin contenido").
// Si NO es void, DEBE tener un return con un valor del tipo correcto.
//
//   public void walk1() { }              // OK (void, return opcional)
//   public void walk2() { return; }      // OK (void con return vacio)
//   public String walk3() { return ""; } // OK (devuelve String)
//   public String walk4() { }            // NO COMPILA (falta el return)
//   public walk5() { }                   // NO COMPILA (falta el tipo de retorno)
//   String walk6(int a){ if(a==4) return ""; }  // NO COMPILA (si a no es 4, no retorna!)
//
// El valor que devuelves debe CABER en el tipo de retorno:
//   int m() { return 9L; }   // NO COMPILA (un long no cabe en int)
//
// EN CORTO: el tipo de retorno es obligatorio; si no es void hay que retornar SIEMPRE
//           un valor que quepa en ese tipo.

public class ReturnType {
}
