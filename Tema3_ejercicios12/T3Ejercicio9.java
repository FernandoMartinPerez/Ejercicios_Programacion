/**
 * Ejercicio 9
 *Escribe un programa que calcule el volumen de un cono según la fórmula 
 * V =1/3 π r² h
 *
 * @author Fernando
 */

public class T3Ejercicio9 {
  
  //static final double pi = 3.141592654;
  
  public static void main(String[] args) {
    // Entrada de datos
    double pi = 3.141592654;
    
    String linea;
    System.out.print("Introduzca la altura en cm: ");
    linea = System.console().readLine();
    double altura;    
    altura = Double.parseDouble( linea);
    
    String linea2;
    System.out.print("Introduzca el radio en cm: ");
    linea2 = System.console().readLine();
    double radio;    
    radio = Double.parseDouble( linea2);
    
    // Operación
    double volumenCono =  (pi * (radio*radio) * altura)/3; 
    
    // Salida en pantalla
    System.out.print(volumenCono + " cm³");

  }
}
