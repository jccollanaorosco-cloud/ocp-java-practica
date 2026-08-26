package core_java_apis._06_working_with_dates_and_times._03_working_with_periods;

// ====== PERIODOS (Period): bloques de tiempo reutilizables ======
//
// Un Period es "una cantidad de tiempo" (dias, meses, anios) que puedes guardar y
// reusar, en vez de escribir plusMonths(1) a mano cada vez.
//
// 5 formas de crear un Period:
//   Period.ofYears(1);     // cada 1 anio
//   Period.ofMonths(3);    // cada 3 meses
//   Period.ofWeeks(3);     // cada 3 semanas
//   Period.ofDays(2);      // cada 2 dias
//   Period.of(1, 0, 7);    // 1 anio, 0 meses, 7 dias (anios, meses, dias)
//
// Se usa con plus:
//   Period period = Period.ofMonths(1);
//   upTo = upTo.plus(period);   // avanza un mes
//
// TRAMPA: NO se pueden encadenar los of.
//   Period.ofYears(1).ofWeeks(1);  // MAL: solo cuenta el ultimo (ofWeeks). Da warning.
//   Para "1 anio y 7 dias" usa:  Period.of(1, 0, 7);
//
// OJO donde se puede usar un Period:
//   date.plus(period)      -> OK (tiene fecha)
//   dateTime.plus(period)  -> OK (tiene fecha)
//   time.plus(period)      -> ERROR (una HORA no tiene dias/meses)
//
// (Existe tambien Duration, para tiempos chiquitos como horas/minutos/segundos.
//  No entra al examen, pero es bueno saber que existe.)
//
// EN CORTO: Period = bloque de tiempo (dias/meses/anios) reutilizable; se suma con
//           plus(); no encadenes los of; no se lo pongas a un LocalTime.

public class WorkingWithPeriods {
}
