/**
* Ejercicio 7
* Realiza un programa que calcule la media de tres notas.
* 
*
* @author Fernando
*/
public class Tema4Ejercicio7 {
    public static void main(String[] args) {
    
    //introduzco el dato que varía por  teclado
    System.out.println("Vamos a calcular la nota media del curso");
    System.out.println("Introduzca la nota 1er examen: ");
    double examen1 = Double.parseDouble(System.console().readLine());
    System.out.println("Introduzca la nota 2do examen: ");
    double examen2 = Double.parseDouble(System.console().readLine());
    System.out.println("Introduzca la nota 3er examen: ");
    double examen3 = Double.parseDouble(System.console().readLine());
    
    //Represento la formula para  resolver el problema
    double media = (examen1 + examen2 + examen3)/3;
    
    //Represento la  solución con dos  decimales
    System.out.print("La nota media es: ");
    System.out.printf("%.2f", media);
    System.out.print(" siga esforzandose.");
    
    

  }
}
