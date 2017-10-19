/**
 * Ejercicio 6
 *Escribe un programa que calcule el total de una factura a partir de la base
 *imponible (precio sin IVA). La base imponible estará almacenada en una
 *variable.
 *
 * @author Fernando
 */

public class T2Ejercicio6 {
  public static void main(String[] args) {
    
    double baseImponible = 15;
    double iva = (baseImponible *21) /100; 
    
    System.out.println("Base Imponible: |" + baseImponible + " Euros");
    System.out.println("Iva:            | " + iva + " Euros");
    System.out.println("----------------|--------");
    System.out.println("Total Factura:  |" + (iva + baseImponible) + " Euros");
    



  }
}
