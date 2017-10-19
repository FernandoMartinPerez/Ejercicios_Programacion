/**
 * Ejercicio 2
 * Realiza un conversor de euros a pesetas. La cantidad de euros que se quiere
 * convertir debe ser introducida por teclado.
 *
 * @author Fernando
 */

public class T3Ejercicio2 {
  public static void main(String[] args) {
    
    System.out.print("Introduce los euros a cambiar: ");
    double euros;
    euros = Double.parseDouble( System.console().readLine() );
        
    int ptas = (int) (euros * 166.386); 
       
    System.out.println(euros + " euros son " + ptas + " ptas");


  }
}
