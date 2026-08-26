package core_java_apis._06_working_with_dates_and_times._05_parsing_dates_and_times;

// ====== LEER UN TEXTO Y CONVERTIRLO EN FECHA/HORA (parse) ======
//
// Es lo contrario de format: de String -> fecha/hora, con parse().
// Puedes darle un formato, o dejar el que viene por defecto.
//
//   DateTimeFormatter f = DateTimeFormatter.ofPattern("MM dd yyyy");
//   LocalDate date = LocalDate.parse("01 02 2015", f);  // usa tu formato
//   LocalTime time = LocalTime.parse("11:22");          // usa el formato por defecto
//   System.out.println(date);  // 2015-01-02
//   System.out.println(time);  // 11:22
//
// Si algo no cuadra (el texto no coincide con el formato, o la fecha es invalida),
// Java lanza un error en ejecucion.
//
// EN CORTO: parse() convierte un texto en fecha/hora (opcionalmente con un formato);
//           si el texto no cuadra, da error.

public class ParsingDatesAndTimes {
}
