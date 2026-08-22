package operators_and_statements._05_java_statements._03_switch;

// ====== SWITCH (elegir entre muchos casos) ======
//
// Revisa un valor y salta al 'case' que coincide. Si ninguno coincide, va al 'default'
// (que es opcional). Es como un menu de opciones.
//   switch (dayOfWeek) {
//       case 0:  System.out.println("Domingo"); break;
//       case 6:  System.out.println("Sabado");  break;
//       default: System.out.println("Dia de semana"); break;
//   }
//
// TIPOS que acepta el switch (memorizar):
//   int/Integer, byte/Byte, short/Short, char/Character, String, y enum.
//   NO acepta boolean ni long.
//
// Los 'case' deben ser CONSTANTES en compilacion: un literal, un enum, o una
// variable 'final' que se inicializo con un literal.
//   final String suffix = "JR";   // este SI sirve como case
//   String middleName = "Patricia"; // este NO (no es final) -> no compila como case
//
// EL break ES CLAVE:
//   - break termina el switch.
//   - si te OLVIDAS el break, el flujo "cae" (fall-through) al siguiente case y
//     sigue ejecutando hasta encontrar un break o terminar. Esto lo aman en el examen!
//
// El default puede ir en cualquier posicion, no tiene que ir al final.
//
// EN CORTO: switch elige entre casos; acepta int/char/String/enum (no boolean ni long);
//           los case son constantes; sin break "cae" al siguiente case.

public class SwitchStatement {
}
