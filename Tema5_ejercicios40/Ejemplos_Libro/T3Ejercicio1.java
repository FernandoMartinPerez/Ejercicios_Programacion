/**
* Ejercicio 1
* Realiza un programa que pida dos números y que luego muestre
* el resultado de su multiplicación.
*
* @author Fernando
*/
import java.util.Scanner;

public class T3Ejercicio1 {
 public static void main(String[] args) {
   Scanner s = new Scanner(System.in);
   
    String linea;
    System.out.print("Por favor, introduce un número: ");
    linea = s.nextLine();
    int primerNumero;    
    primerNumero = Integer.parseInt(s.nextLine());
    
    System.out.print("introduce otro, por favor: ");
    linea = s.nextLine();
    int segundoNumero;
    segundoNumero = Integer.parseInt( linea );
    
    int total;
    total = primerNumero * segundoNumero;
    System.out.print(primerNumero);
    System.out.print(" multiplicado por ");
    System.out.println(segundoNumero);
    System.out.print("Es igual a ");
    System.out.print(total);
}
}
