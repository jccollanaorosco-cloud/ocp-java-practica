package java_building_blocks._01_java_class_structure._03_classes_vs_files;

// CLASSES VS FILES 

// 
// class Animal {        -> define la clase Animal. NO dice public, y es valido.
//   String name;        -> campo (variable) llamado name, de tipo texto (String).
// }                     -> cierra la clase.
// Demuestra: una clase puede existir sin la palabra public.

// 
// public class Animal {   -> clase Animal, esta vez SI publica (accesible desde cualquier lado).
//   private String name;  -> campo name, private = solo se usa dentro de esta clase.
// }                       -> cierra Animal.
// class Animal2 {         -> segunda clase en el MISMO archivo, sin public.
// }                       -> cierra Animal2.
// Demuestra: puede haber 2 clases en un archivo, pero solo UNA puede ser public.

//
// Si una clase es public, el archivo debe llamarse igual que la clase.
// public class Animal  -> debe estar en Animal.java
// public class Animal2 -> debe estar en Animal2.java

// 
// 1) Una clase no esta obligada a ser public.
// 2) En un archivo puede haber varias clases, pero solo una public.
// 3) La clase public debe coincidir en nombre con el archivo .java

public class ClassesVsFiles {
}