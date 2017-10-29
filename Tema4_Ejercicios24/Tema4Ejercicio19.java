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
    // Math.abs no hace el numero absoluto sin signo.
    System.out.println("Introduzca un numero entero");
    int digitos = Math.abs (Integer.parseInt(System.console().readLine()));
    
    if (digitos < 10){
      digitos = 1; 
    
    } else if (digitos < 100){
      digitos = 2;
      

    } else if (digitos < 1000){
      digitos = 3;
      
    } else if (digitos < 10000){
      digitos = 4;
      
    } else if (digitos < 100000){
      digitos = 5;
      
    }
      System.out.println("el número tiene "+ digitos + " digito/s");
  }
}
