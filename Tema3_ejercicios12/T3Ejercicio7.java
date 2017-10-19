/**
 * Ejercicio 7
 * Escribe un programa que calcule el total de una factura a partir de la base
 *imponible.
 *
 * @author Fernando
 */

public class T3Ejercicio7 {
  public static void main(String[] args) {
    
    String linea;
    System.out.print("base imponible en euros: ");
    linea = System.console().readLine();
    double baseImponible;    
    baseImponible = Double.parseDouble( linea );
    
    String linea2;
    System.out.print("Introduzca el tipo impositivo %  ");
    linea2 = System.console().readLine();
    double iva;    
    iva = Double.parseDouble( linea2 );
    
    double totalIva = (baseImponible * iva)/100;
    double totalFactura = baseImponible + totalIva;
    
    
    
    System.out.println("Base Imponible: |" + baseImponible + " Euros");
    System.out.println("Iva:            | " + totalIva + " Euros");
    System.out.println("----------------|--------");
    System.out.println("Total Factura:  |" + (totalFactura) + " Euros");
    



  }
}
