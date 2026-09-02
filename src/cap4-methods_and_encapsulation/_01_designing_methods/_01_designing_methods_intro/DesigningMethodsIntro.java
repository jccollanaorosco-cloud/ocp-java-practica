package methods_and_encapsulation._01_designing_methods._01_designing_methods_intro;

// ====== PARTES DE UN METODO ======
//
// Un metodo se declara asi (ejemplo real):
//   public final void nap(int minutes) throws InterruptedException { }
//
// Las partes, en orden:
//   public          -> modificador de acceso   (OPCIONAL: quien lo puede llamar)
//   final           -> especificador opcional   (OPCIONAL)
//   void            -> tipo de retorno           (OBLIGATORIO: que devuelve; void = nada)
//   nap             -> nombre del metodo         (OBLIGATORIO)
//   (int minutes)   -> lista de parametros       (OBLIGATORIO el(), pero puede ir vacio)
//   throws ...      -> lista de excepciones      (OPCIONAL)
//   { }             -> cuerpo del metodo         (OBLIGATORIO, aunque este vacio)
//
// Para llamarlo:  nap(10);
//
// El examen te enreda poniendo las partes en ORDEN equivocado. El orden correcto es:
//   [acceso] [especificador] tipoRetorno nombre(parametros) [throws...] { cuerpo }
//
// EN CORTO: tipo de retorno + nombre + () + {} son obligatorios; acceso, final y
//           throws son opcionales; el ORDEN importa.

public class DesigningMethodsIntro {
}
