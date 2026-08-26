package core_java_apis._06_working_with_dates_and_times._01_creating_dates_and_times;

// ====== CREAR FECHAS Y HORAS (Java 8+) ======
//
// Necesita import:  import java.time.*;
//
// Hay 3 tipos, segun cuanta info quieres:
//   LocalDate     -> SOLO fecha (ej: tu cumpleanos). Sin hora.
//   LocalTime     -> SOLO hora (ej: medianoche). Sin fecha.
//   LocalDateTime -> fecha Y hora juntas.
//
// La fecha/hora de AHORA con now():
//   LocalDate.now();      // 2015-01-20
//   LocalTime.now();      // 12:45:18.401
//   LocalDateTime.now();  // 2015-01-20T12:45:18.401  (la T separa fecha y hora)
//
// Crear una fecha especifica con of(...):
//   LocalDate d1 = LocalDate.of(2015, Month.JANUARY, 20);
//   LocalDate d2 = LocalDate.of(2015, 1, 20);   // el mes tambien como numero
//   OJO: aqui los MESES cuentan desde 1 (enero=1), NO desde 0.
//
// Horas (puedes dar mas o menos detalle):
//   LocalTime.of(6, 15);           // hora y minuto
//   LocalTime.of(6, 15, 30);       // + segundos
//   LocalTime.of(6, 15, 30, 200);  // + nanosegundos
//
// Juntar fecha y hora:
//   LocalDateTime.of(2015, Month.JANUARY, 20, 6, 15, 30);
//   LocalDateTime.of(date1, time1);
//
// TRAMPAS de examen:
//   new LocalDate();                    // NO COMPILA (no se usa new, se usa of/now)
//   LocalDate.of(2015, Month.JANUARY, 32); // ERROR (no existe el dia 32)
//
// EN CORTO: LocalDate (fecha), LocalTime (hora), LocalDateTime (ambas);
//           se crean con now() u of(); nada de new; los meses cuentan desde 1.

public class CreatingDatesAndTimes {
}
