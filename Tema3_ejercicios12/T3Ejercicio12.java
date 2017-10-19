/**
*                     Ejercicio 12
* Realiza un programa que calcule la nota que hace falta sacar en el segundo
* examen de la asignatura Programación para obtener la media deseada. Hay
* que tener en cuenta que la nota del primer examen cuenta el 40% y la del
* segundo examen un 60%.
*
*         Ejemplo 1:
*    Introduce la nota del primer examen: 7
*    ¿Qué nota quieres sacar en el trimestre? 8.5
*    Para tener un 8.5 en el trimestre necesitas sacar un 9.5 en el segundo examen.
*         Ejemplo 2:
*    Introduce la nota del primer examen: 8
*    ¿Qué nota quieres sacar en el trimestre? 7
*    Para tener un 7 en el trimestre necesitas sacar un 6.33 en el segundo examen.
*/
public class T3Ejercicio12 {
  public static void main(String[] args) {
    // Entrada de datos
    String linea;
    System.out.print("Introduce la nota del primer examen: ");
    linea = System.console().readLine();
    double nota1;    
    nota1 = Double.parseDouble( linea );
    
    String linea2;
    System.out.print("¿Qué nota quieres sacar en el trimestre? ");
    linea2 = System.console().readLine();
    double mediaTrimestre;    
    mediaTrimestre = Double.parseDouble( linea2 );

    // Operación
    // la nota de mediaTrimestre seria el 100%
    // la nota1 el 40%
    // la nota2 el 60% 
    // multiplico la media por 100; nota2*60 = (mediaTrimestre * 100) - nota1 * 40   
    double nota2 = ((mediaTrimestre * 100) - (nota1 * 40))/ 60; 
      
    
    // Salida en pantalla
    
    System.out.print(nota2);
    

  }
}
