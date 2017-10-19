/**
 * Ejercicio 4
 * Escribe un programa que sume, reste, multiplique y divida dos números
 * introducidos por teclado.
*
* @author Fernando
*/
public class T3Ejercicio4 {
 public static void main(String[] args) {
   
    // En esta parte hacemos que los usuarios introduzcan los nº x consola
    String linea;
    System.out.print("Por favor, introduce un número: ");
    linea = System.console().readLine();
    int primerNumero;    
    primerNumero = Integer.parseInt( linea );
    
    System.out.print("introduce otro, por favor: ");
    linea = System.console().readLine();
    int segundoNumero;
    segundoNumero = Integer.parseInt( linea );
    
    // Aquí declaramos las variables y especificamos las operaciones
    int suma;
    suma = (primerNumero + segundoNumero);
    int resta;
    resta = (primerNumero - segundoNumero);
    int multiplicacion = (primerNumero * segundoNumero);
    int division = (primerNumero / segundoNumero);
    
    
    // Y aquí mostramos los resultados de las operaciones.
    System.out.print( primerNumero );
    System.out.print( " + " );
    System.out.print( segundoNumero);
    System.out.println(" = " + suma);
    
    
    System.out.print( primerNumero );
    System.out.print( " - " );
    System.out.print( segundoNumero);
    System.out.println(" = " + resta);
    
    
    System.out.print( primerNumero );
    System.out.print( " * " );
    System.out.print( segundoNumero);
    System.out.println(" = " + multiplicacion);
    
    
    System.out.print( primerNumero );
    System.out.print( " / " );
    System.out.print( segundoNumero);
    System.out.println(" = " + division);
    System.out.println("=============");
    
    System.out.println( "La + es " + suma );
    System.out.println( "La - es " + resta );
    System.out.println( "La x es " + multiplicacion );
    System.out.println( "La : es " + division );

}
}
