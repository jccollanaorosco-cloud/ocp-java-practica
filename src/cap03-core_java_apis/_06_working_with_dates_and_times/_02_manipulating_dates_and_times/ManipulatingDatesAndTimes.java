package core_java_apis._06_working_with_dates_and_times._02_manipulating_dates_and_times;

// ====== SUMAR Y RESTAR A FECHAS/HORAS ======
//
// Las fechas/horas son INMUTABLES (como String): tienes que GUARDAR el resultado,
// si no, se pierde.
//
// Sumar con plusXxx / restar con minusXxx:
//   LocalDate date = LocalDate.of(2014, Month.JANUARY, 20);   // 2014-01-20
//   date = date.plusDays(2);    // 2014-01-22
//   date = date.plusWeeks(1);   // 2014-01-29
//   date = date.plusMonths(1);  // 2014-02-28 (Java sabe que feb no tiene 29 en 2014)
//   date = date.plusYears(5);   // 2019-02-28
//   (tambien minusDays, minusHours, minusSeconds, etc.)
//
// Se pueden ENCADENAR:
//   dateTime.minusDays(1).minusHours(10).minusSeconds(30);
//
// TRAMPA 1 (ignorar el resultado):
//   date.plusDays(10);           // esto NO cambia date! (no lo guardaste)
//   System.out.println(date);    // sigue igual
//
// TRAMPA 2 (usar un metodo que no corresponde):
//   LocalDate date = ...;
//   date = date.plusMinutes(1);  // NO COMPILA (LocalDate no tiene HORA -> no hay minutos)
//
// Regla de oro de que se puede llamar en cada uno:
//   plusYears/Months/Weeks/Days -> LocalDate y LocalDateTime (NO LocalTime)
//   plusHours/Minutes/Seconds/Nanos -> LocalTime y LocalDateTime (NO LocalDate)
//
// EN CORTO: plusXxx/minusXxx suman/restan; GUARDA el resultado o se pierde;
//           a una fecha no le sumes horas, ni a una hora le sumes dias.

public class ManipulatingDatesAndTimes {
}
