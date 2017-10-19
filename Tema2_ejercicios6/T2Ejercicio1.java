/**
 * Escribe un programa en el que se declaren las variables enteras x e y . Asignales
 *los valores 144 y 999 respectivamente. A continuación, muestra por pantalla
 *el valor de cada variable, la suma, la resta, la división y la multiplicación.
 *
 * @author Fernando
 */

public class T2Ejercicio1 {
  public static void main(String[] args) {

    int x = 144;
    int y = 999;

    int suma = x + y;
    System.out.println("La suma de mis variables es " + suma);
    
    int multi = x * y;
    System.out.println("La multiplicación de mis variables es " + multi);
    
    int resta = x - y;
    System.out.println("La resta de mis variables es " + resta);
    
    double division = (double) y / (double)x;
    System.out.println("La division de mis variables es " + division);   
  }
}
