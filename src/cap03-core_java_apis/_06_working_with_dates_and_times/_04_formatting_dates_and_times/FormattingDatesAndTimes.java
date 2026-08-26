package core_java_apis._06_working_with_dates_and_times._04_formatting_dates_and_times;

// ====== DARLE FORMATO A FECHAS/HORAS ======
//
// Sacar datos sueltos:
//   date.getDayOfWeek();  // MONDAY
//   date.getMonth();      // JANUARY
//   date.getYear();       // 2020
//   date.getDayOfYear();  // 20
//
// Para mostrarlas bonito se usa DateTimeFormatter (import java.time.format.*).
//
// Formatos ISO (para computadoras):
//   date.format(DateTimeFormatter.ISO_LOCAL_DATE);       // 2020-01-20
//   time.format(DateTimeFormatter.ISO_LOCAL_TIME);       // 11:12:34
//
// Formatos ya hechos SHORT y MEDIUM (los que salen en el examen):
//   DateTimeFormatter shortF = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT);
//   DateTimeFormatter medF   = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM);
//   shortF.format(dateTime);  // 1/20/20 11:12 AM
//   medF.format(dateTime);    // Jan 20, 2020 11:12:34 AM
//
// OJO: pedir un formato de FECHA sobre una HORA (o al reves) da ERROR en ejecucion.
//   ofLocalizedDate sobre un time  -> ERROR.
//
// Tu propio formato con ofPattern(...):
//   DateTimeFormatter f = DateTimeFormatter.ofPattern("MMMM dd, yyyy, hh:mm");
//   dateTime.format(f);  // January 20, 2020, 11:12
//   Simbolos (no memorices, solo reconoce):
//     M = mes (M=1, MM=01, MMM=Jan, MMMM=January)
//     d = dia    y = anio (yy=20, yyyy=2020)
//     h = hora   m = minuto     (OJO: M mayus=mes, m minus=minuto!)
//
// EN CORTO: DateTimeFormatter da formato; SHORT y MEDIUM son los del examen;
//           ojo M(mes) vs m(minuto); pedir formato que no corresponde da error.

public class FormattingDatesAndTimes {
}
