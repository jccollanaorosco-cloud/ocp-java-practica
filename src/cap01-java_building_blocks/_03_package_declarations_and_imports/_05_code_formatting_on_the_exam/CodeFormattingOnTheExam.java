package java_building_blocks._03_package_declarations_and_imports._05_code_formatting_on_the_exam;

// ================= CODE FORMATTING ON THE EXAM =================
// (Como leer el codigo en el examen para ahorrar espacio)

// ---- Regla 1: los imports a veces se OMITEN ----
// Si la pregunta no trata sobre imports, el examen los quita para ahorrar espacio.
// PISTA: los numeros de linea NO empiezan en 1 (empiezan en 6, por ejemplo).
// Eso significa: "asume que lo omitido (imports) es correcto, concentrate en esto".

// ---- Regla 2: si ves linea 1 (o sin numeros) -> revisa los imports ----
// Cuando el codigo empieza en la linea 1 o no tiene numeros, YA NO puedes
// asumir imports validos: tienes que verificar que no falte ninguno.

// ---- Regla 3: el examen junta codigo en la misma linea ----
// Para ahorrar espacio unen llaves y sentencias en una linea. Ejemplo:
//
// 6: public void method(ArrayList list) {
// 7:   if (list.isEmpty()) { System.out.println("e");
// 8:   } else { System.out.println("n");
// 9: } }
// -> SI COMPILA. Empieza en la linea 6, o sea, DEBAJO de los imports (se asumen ok).
//    Ademas ArrayList esta en java.util (se asume importado).

// ---- Mismo codigo pero empezando en la linea 1 ----
//
// 1: public class LineNumbers {
// 2:   public void method(ArrayList list) {
// 3:     if (list.isEmpty()) { System.out.println("e");
// 4:   } else { System.out.println("n");
// 5: } } }
// -> NO COMPILA. Empieza en la linea 1, asi que NO puedes asumir imports previos.
//    Falta import java.util.ArrayList; -> por eso ArrayList no se reconoce.

// ---- Regla 4: codigo sin main() ----
// Si el fragmento no tiene main(), asume que el main(), la clase y los imports
// necesarios SI estan. Solo te preguntan si la parte mostrada compilaria al
// colocarla dentro de codigo valido alrededor.

// ================= RESUMEN =================
// 1) Numeros de linea que NO empiezan en 1 -> imports omitidos, asumelos correctos.
// 2) Linea 1 o sin numeros -> verifica los imports (pueden faltar).
// 3) ArrayList vive en java.util (debes saberlo desde el Cap. 3).
// 4) Sin main() -> asume que el resto del codigo valido existe.

public class CodeFormattingOnTheExam {
}