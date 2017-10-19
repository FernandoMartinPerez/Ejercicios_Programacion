/**
* Ejercicio 1
* Realiza un programa que pida dos números y que luego muestre
* el resultado de su multiplicación.
*
* @author Fernando
*/
public class T3Ejercicio1 {
 public static void main(String[] args) {
    String linea;
    System.out.print("Por favor, introduce un número: ");
    linea = System.console().readLine();
    int primerNumero;    
    primerNumero = Integer.parseInt( linea );
    
    System.out.print("introduce otro, por favor: ");
    linea = System.console().readLine();
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
