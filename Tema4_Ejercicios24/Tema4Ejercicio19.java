/**
* 
* Ejercicio 19 
* Realiza un programa que nos diga cuántos dígitos tiene un número entero que
* puede ser positivo o negativo. Se permiten números de hasta 5 dígitos.
*
* @author Fernando
*/ 
public class Tema4Ejercicio19 {
    public static void main(String[] args) {
    // Aquí comenzamos meter datos por consola
     
    System.out.println("Introduzca un numero entero");
    int numero = Integer.parseInt(System.console().readLine());
    
    if (numero < 10){
      numero = 1; 
      System.out.println("el número tiene "+ numero + " digito");
      
    } else if (numero < 100){
      numero = 2;
      System.out.println("el número tiene " + numero + " digitos");

    } else if (numero < 1000){
      numero = 3;
      System.out.println("el número tiene " + numero + " digitos");
    } else if (numero < 10000){
      numero = 4;
      System.out.println("el número tiene " + numero + " digitos");
    } else if (numero < 100000){
      numero = 5;
      System.out.println("el número tiene " + numero + " digitos");
    }
    
  }
}
