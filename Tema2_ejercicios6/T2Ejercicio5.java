/**
 * Ejercicio 5
 * Realiza un conversor de pesetas a euros. La cantidad en pesetas que se quiere
 * convertir deberá estar almacenada en una variable.
 *
 * @author Fernando
 */

public class T2Ejercicio5 {
  public static void main(String[] args) {
    
    int ptas = 750;    
    double euros =  (double) (ptas / 166.386); 
       
    System.out.println(ptas + " ptas = " + euros + " euros");
    
    System.out.printf("%d %-10s %.2f %-6s", ptas," ptas son ", euros," euros");
      // %d numero entero
      // %-10s cadena de 10 caracteres alineado a izq
      // %.2f numero con dos decimales
      // %-6s cadena de 6 caracteres alineado a izq
    
    
    
    



  }
}
