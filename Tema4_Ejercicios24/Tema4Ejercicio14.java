/**
* 
* Ejercicio 14
* Realiza un programa que diga si un número introducido por teclado es par y/o
* divisible entre 5.
*
* @author Fernando
*/
public class Tema4Ejercicio14 {
    public static void main(String[] args) {
    // Aquí comenzamos meter datos por consola
    System.out.println("Este programa me dice si un numero es par y si es divisible por 0");
    System.out.println("Introduzca 1er número please:");
    int numero = Integer.parseInt(System.console().readLine());    
    
    // Resuelvo el problema y ya de paso muestro la solución por pantalla       
      if (numero % 2 == 0){
        System.out.println("el nº " + numero + "  es par");
        } else {System.out.println("el nº " + numero + "  no es par");
        }
      if (numero % 5 == 0){
        System.out.println("el nº " + numero + "  es divisible por 5");
        } else {System.out.println("el nº " + numero + "  no es divisible por 5");
        } 
    

  }
}
