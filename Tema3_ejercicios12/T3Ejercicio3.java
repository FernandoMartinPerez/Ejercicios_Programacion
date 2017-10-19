/**
 * Ejercicio 3
 * Realiza un conversor de pesetas a euros. La cantidad de pesetas 
 * que se quiere convertir debe ser introducida por teclado.
 *
 * @author Fernando
 */

public class T3Ejercicio3 {
  public static void main(String[] args) {
    
    //Esta parte sirve para introducir las ptas a cambiar
    // Variable "linea" como cadena caracteres
    // linea = para introducir por pantalla el valor de la 
    // variable linea, que un numero entero (int)
    String linea;
    System.out.print("Introduce las pesetas a cambiar: ");
    linea = System.console().readLine();
    int ptas;    
    ptas = Integer.parseInt( linea );
    // Aqui la conversion en decimales xq euros tiene decimales   
    double euros =  (double) (ptas / 166.386); 
    
    //Esto lo comento porque sale con mas de dos decimales.
    //System.out.println(ptas + " ptas = " + euros + " euros");
    
    System.out.printf("%d %-10s %.2f %-6s", ptas," ptas son ", euros," euros");
      // %d numero entero
      // %-10s cadena de 10 caracteres alineado a izq
      // %.2f numero con dos decimales
      // %-6s cadena de 6 caracteres alineado a izq
    

  }
}
