/**
 * 
 * Ejercicio 4
 * Muestra los números del 320 al 160, contando de 20 en 20 hacia atrás
 * utilizando un bucle for .
 * 
 * @author Fernando 
 */
public class Tema5Ejercicio4 {

  public static void main(String[] args) {
    // int i defino la variable y lo pongo a cero
    // establezco donde para el bucle
    // i -=20 y a cada iteracion reste de 20 en 20
    for(int i = 320; i >= 160; i -= 20) {
      System.out.println(i);
    }
  }
}
