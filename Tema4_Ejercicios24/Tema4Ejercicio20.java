/**
* 
* Ejercicio 20
* Realiza un programa que diga si un número entero positivo introducido por
* teclado es capicúa. Se permiten números de hasta 5 cifras.
*
* @author Fernando
*/ 

public class Tema4Ejercicio20 {

  public static void main(String[] args) {
    
    int n;
    boolean capicua = false;
    
    System.out.print("Introduzca un número entero de hasta 5 cifras: ");
    n = Integer.parseInt(System.console().readLine());
    
    
    // número de una cifra
    // si tiene una cifra es capicua
    if (n < 10) {
      capicua = true;
    }
    
    // número de dos cifras
    // si tiene dos cifras resto debe ser igual al cociente
    // Ej 44 : 10 = 4 y el resto 4
    if ((n >= 10) && (n < 100)) {
      if ((n / 10) == (n % 10)) {
        capicua = true;
      }
    }

    // número de tres cifras
    // si tiene 3 cifras el cociente entre 100 y el resto entre 10
    // ej 343 : 100 = 3 + 3 de resto == de 343 % 10 (es 343 : 10 = 34(34 x 10 +3) y resto 3) 
    if ((n >= 100) && (n < 1000)) {
      if ((n / 100) == (n % 10)) {
        capicua = true;
      }
    }

    // número de cuatro cifras 
    if ((n >= 1000) && (n < 10000)) {
      if (((n / 1000) == (n % 10)) && ((( n / 100 ) % 10)== (( n / 10) % 10))) {
        capicua = true;
      }
    }
    
    // número de cinco cifras
    if (n >= 10000) {
      if (((n / 10000) == (n % 10) ) && ((((n / 1000) % 10)) == ((n / 10) % 10))) {
        capicua = true;
      }
    }
    
    if (capicua) {
      System.out.println("El nº " + n + " es capicúa.");
    } else {
      System.out.println("El nº " + n + " no es capicúa.");
    }
  }
}
