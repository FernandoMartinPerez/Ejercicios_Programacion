/**
* 
* Ejercicio 9
* Realiza un programa que nos diga cuántos dígitos tiene un número introducido
* por teclado.
*
* @author Fernando
*/ 
// Importamos scanner para que otros IDE nos reconozca lo introducido por teclado
import java.util.Scanner;

public class Tema5Ejercicio9 {
    public static void main(String[] args) {
    // Creo la entrada de escaner
    Scanner s = new Scanner(System.in);
    // variable con tres sentecias
    int numeroDeDigitos = 1, n, numeroIntroducido;
    
    // Aquí comenzamos meter datos por consola
    // Math.abs no hace el numero absoluto sin signo.
    System.out.println("Introduzca un número entero y te digo el nº de digitos: ");
    
    //Aqui metemos los digitos
    numeroIntroducido = Math.abs(s.nextInt());
    //int numeroIntroducido = Math.abs (Integer.parseInt(System.console().readLine()));
    
    n = numeroIntroducido;
    
    // mientras n mayor 10 divido entre diez y le sumo 1 para obtener los digitos.
    while (n > 10) {
      n /= 10;
      numeroDeDigitos++;
    }
    
    System.out.println(numeroIntroducido + " tiene " + numeroDeDigitos + " dígito/s.");

  }
}
