/**
* 
* Ejercicio 18
* Escribe un programa que diga cuál es la primera cifra de un número entero
* introducido por teclado. Se permiten números de hasta 5 cifras.
*
* @author Fernando
*/ 
// importamos el Scanner de java

public class Tema4Ejercicio18 {
    public static void main(String[] args) {
    // Aquí comenzamos meter datos por consola
    
    int numeros, d1,d2,d3,d4,d5;
    
    System.out.print("Introduce un número entero de 5 cifras: ");
    int numero = Integer.parseInt(System.console().readLine());
    System.out.println();
    
    d1 = numero % 10;
    d2 = numero % 100 / 10;
    d3 = numero % 1000 / 100;
    d4 = numero % 10000 / 1000;
    d5 = numero % 100000 / 10000;
    
    // Resuelvo el problema y ya de paso muestro la solución por pantalla       
    
    
    System.out.println("La primera cifra del número");
    System.out.println("que has introducido es: " + d5);
    

  }
}
