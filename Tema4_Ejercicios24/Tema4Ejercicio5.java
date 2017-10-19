/**
* Ejercicio 5
* Realiza un programa que resuelva una ecuación de primer grado (del tipo ax +
* b = 0).
* 
*
* @author Fernando
*/
public class Tema4Ejercicio5 {
    public static void main(String[] args) {
    //Aqui metemos los datos por pantalla
    System.out.println("Resolvamos una ecuación de primer grado como ax + b = 0");
    System.out.println();
    System.out.println("Introduzca el valor de a:");
    int a = Integer.parseInt(System.console().readLine());
    System.out.println("Introduzca el valor de b:");
    int b = Integer.parseInt(System.console().readLine());
    
    
    // Si a  menor que 1 no se puede  calcular
    // sino ax + b = 0 --> x = -b/a
    if (a < 1) {
      System.out.println("a es menor que 1 no se puede calcular ");
      
    } else {
      double solucion = (double)-b/a;
      System.out.println("x = " + solucion);
    }
  }
}
