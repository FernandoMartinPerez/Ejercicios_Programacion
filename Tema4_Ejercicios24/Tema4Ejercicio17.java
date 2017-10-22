/**
* 
* Ejercicio 17
* Escribe un programa que diga cuál es la última cifra de un número entero
* introducido por teclado.
*
* @author Fernando
*/
public class Tema4Ejercicio17 {
    public static void main(String[] args) {
    // Aquí comenzamos meter datos por consola
    System.out.print("Introduce un número entero: ");
    int numero = Integer.parseInt(System.console().readLine());
    System.out.println();
    
    // Resuelvo el problema y ya de paso muestro la solución por pantalla       
    int unidades = numero % 10;
    System.out.println("La última cifra del número");
    System.out.println("que has introducido es: " + unidades);
    

  }
}
