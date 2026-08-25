package core_java_apis._02_using_the_stringbuilder_class._04_stringbuilder_vs_stringbuffer;

// ====== StringBuilder vs StringBuffer ======
//
// Los dos hacen lo mismo (armar textos que cambian), PERO:
//   - StringBuilder -> mas RAPIDO. Es el que debes usar.
//   - StringBuffer  -> mas LENTO, porque es "thread safe" (seguro con hilos).
//                      Es viejo; lo veras en codigo antiguo.
//
// Para el examen casi no lo preguntan, pero por si aparece uno viejo:
// si ves StringBuffer, piensa "es como StringBuilder pero mas lento".
//
// EN CORTO: usa StringBuilder (rapido). StringBuffer es su version vieja y lenta.

public class StringBuilderVsStringBuffer {
}
