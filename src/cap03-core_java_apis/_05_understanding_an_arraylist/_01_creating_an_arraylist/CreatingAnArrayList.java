package core_java_apis._05_understanding_an_arraylist._01_creating_an_arraylist;

// ====== CREAR UN ArrayList (una lista que SI cambia de tamano) ======
//
// El array tiene un problema: debes saber su tamano al crearlo y ya no cambia.
// El ArrayList SI crece o se achica cuando quieras. Igual guarda en orden y permite repetidos.
//
// Necesita import:  import java.util.ArrayList;   (o import java.util.*;)
//
// 3 formas viejas (aun funcionan):
//   ArrayList list1 = new ArrayList();       // tamano por defecto
//   ArrayList list2 = new ArrayList(10);     // reserva 10 espacios
//   ArrayList list3 = new ArrayList(list2);  // copia de otra lista
//
// Forma moderna (con <tipo>, se llama "generics" - dices que tipo guarda):
//   ArrayList<String> list4 = new ArrayList<String>();
//   ArrayList<String> list5 = new ArrayList<>();   // el <> vacio se llama "diamante"
//
// Dato: ArrayList ES un List (List es una "interfaz"). Puedes guardar un ArrayList
// en una variable List, pero NO al reves:
//   List<String> ok = new ArrayList<>();       // OK
//   ArrayList<String> mal = new List<>();       // NO COMPILA (List no se puede crear con new)
//
// EN CORTO: ArrayList es una lista que cambia de tamano; usa <String> para decir
//           que guarda; y un ArrayList se puede guardar en un List, pero no al reves.

public class CreatingAnArrayList {
}
