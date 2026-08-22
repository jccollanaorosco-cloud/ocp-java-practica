package operators_and_statements._04_additional_binary_operators._05_equality_operators;

// ====== OPERADORES DE IGUALDAD  ==  y  != ======
//
// Comparan y devuelven boolean:
//   ==  son iguales?
//   !=  son distintos?
//
// Se usan en 3 casos y NO puedes mezclar tipos:
//   1) dos numeros (se promueven si hace falta):  5 == 5.00 -> true
//   2) dos booleanos
//   3) dos objetos (incluye null y String)
//
// Estas NO compilan (tipos mezclados):
//   boolean a = true == 3;
//   boolean b = false != "Giraffe";
//   boolean c = 3 == "Kangaroo";
//
// TRAMPA (confundir = con ==):
//   boolean y = false;
//   boolean x = (y = true);   // esto ASIGNA true a y, no compara
//   System.out.println(x);    // imprime true
//   (si fuera (y == true) ahi si estaria comparando)
//
// Con OBJETOS, == compara si son EL MISMO objeto (misma direccion), no su contenido:
//   File x = new File("myFile.txt");
//   File y = new File("myFile.txt");
//   File z = x;
//   x == y  -> false   (mismo texto, pero son 2 objetos distintos)
//   x == z  -> true    (z apunta al mismo objeto que x)
//
// EN CORTO: == compara valores en primitivos, pero en objetos compara si son
//           EL MISMO objeto, no si tienen el mismo contenido. Cuidado con = vs ==.

public class EqualityOperators {
}
