/**
* Ejercicio 5
* Escribe un programa que calcule el área de un rectángulo.
*
* @author Fernando
*/
public class T3Ejercicio5 {
 public static void main(String[] args) {
   
    // En esta parte hacemos que los usuarios introduzcan los nº x consola
    String linea;
    System.out.print("Introduzca la altura: ");
    linea = System.console().readLine();
    int altura;    
    altura = Integer.parseInt( linea );
    
        
    System.out.print("Introduzca la base: ");
    linea = System.console().readLine();
    int base;
    base = Integer.parseInt( linea );
    
    // Aquí declaramos las variables y especificamos las operaciones
    int area = (base * altura);
    System.out.println( "Area = base x altura" );
    
    
    
    // Y aquí mostramos los resultados de las operaciones.
    System.out.println( "Area = " + base + " x " + altura + " = " + area);


}
}
