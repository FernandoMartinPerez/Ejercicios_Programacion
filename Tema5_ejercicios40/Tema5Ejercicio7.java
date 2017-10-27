/**
 * 
 * Ejercicio 7
 * Realiza el control de acceso a una caja fuerte. La combinación será un
 * número de 4 cifras. El programa nos pedirá la combinación para abrirla. Si no
 * acertamos, se nos mostrará el mensaje “Lo siento, esa no es la combinación”
 * y si acertamos se nos dirá “La caja fuerte se ha abierto satisfactoriamente”.
 * Tendremos cuatro oportunidades para abrir la caja fuerte.
 * 
 * @author Fernando 
 */
public class Tema5Ejercicio7 {
    public static void main(String[] args) {
    // vamos a establecer las variables 4 intentos, meter la clave y que la 
    // clave no valida
    int intentos = 4;
    int intClave;
    boolean clave = false;
    
    do {
      System.out.print("Introduzca la clave de la caja fuerte: ");
      intClave = Integer.parseInt(System.console().readLine());
      // Si nº introducido es 1979 es verdadero sino clave no valida
      if (intClave == 1979) {
        clave = true;
      } else {
        System.out.println("Clave no valida");
      }
      // los intentos van bajando en 1 en 1
      intentos--;
      // mientras los intentos mayor que 0 y distinto a clave "falso".
    } while((intentos > 0) && (!clave));
    
      if (clave) { //si clave true caja abierta
        System.out.println("Caja abierta.");
      } else { //si clave incorrecta, intentos agotados
        System.out.println("Lo siento, intentos agotados.");
    }
  }
}
