/**
 * Ejercicio 4
 *Realiza un conversor de euros a pesetas. La cantidad en euros que se quiere
 *convertir deberá estar almacenada en una variable.
 *
 * @author Fernando
 */

public class T2Ejercicio4 {
  public static void main(String[] args) {
    
    double euros = 15.55;    
    int ptas = (int) (euros * 166.386); 
       
    System.out.println(euros + " euros = " + ptas + " ptas");


  }
}
