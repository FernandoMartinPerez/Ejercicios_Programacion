/**
 * 
 * Ejercicio 6
 * Muestra los números del 320 al 160, contando de 20 en 20 hacia atrás
 * utilizando un bucle do-while.
 * 
 * @author Fernando 
 */
public class Tema5Ejercicio6 {

  public static void main(String[] args) {
    // int i defino la variable y lo pongo a cero
    // establezco donde para el bucle
    // i -=20 y a cada iteracion reste de 20 en 20
    int i = 320;
      do {
        System.out.println(i);
        i -= 20;
      }while( i >= 160);
  }
}
