/**
 * 
 * Ejercicio 2
 * Muestra los números múltiplos de 5 de 0 a 100 utilizando un bucle while .
 * 
 * @author Fernando 
 */
public class Tema5Ejercicio2 {

  public static void main(String[] args) {
    // int i defino la variable y lo pongo a cero
    // establezco donde para el bucle
    // i +=5 y a cada iteracion sume a 5
    int i = 0;
    while(i <= 100) {
      System.out.println(i);
      i +=5;
    }
  }
}
