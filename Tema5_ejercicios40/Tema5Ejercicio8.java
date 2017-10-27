/**
 * 
 * Ejercicio 8
 * Muestra la tabla de multiplicar de un número introducido por teclado.
 * 
 * @author Fernando 
 */
public class Tema5Ejercicio8 {
    public static void main(String[] args) {
    System.out.print("Introduzca un número para montras su tabla de multiplicar: ");
    
    int numero = Integer.parseInt(System.console().readLine());
    
    
    for (int i=0; i<=10; i++) {
      System.out.println(numero + " x " + i + " = " + numero * i);
      i++;
    }
  }
}
