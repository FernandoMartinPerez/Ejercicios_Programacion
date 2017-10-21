/**
* 
* Ejercicio 13
* Escribe un programa que ordene tres números enteros introducidos por
* teclado.
*
* @author Fernando
*/
public class Tema4Ejercicio13 {
    public static void main(String[] args) {
    // Aquí comenzamos a recoger datos números enteros
    System.out.println("Este programa de mayor a menor números enteros");
    System.out.println("Introduzca 1er número please:");
    int numero1 = Integer.parseInt(System.console().readLine());
    
    System.out.println("Introduzca 2do número please:");
    int numero2 = Integer.parseInt(System.console().readLine());
    
    System.out.println("Introduzca 3er número please:");
    int numero3 = Integer.parseInt(System.console().readLine());
    
    // Como  vamos a resolver  el  problema tenemos 3 numeros (1 2 3)
    // las combinaciones son:
    //
    //        1>2>3 1>3>2
    //        2>1>3 2>3>1 
    //        3>1>2 3>2>1
    
    //Primer caso
      if ((numero1 > numero2 ) && (numero2 > numero3)){
        System.out.println(numero1 + " > " + numero2 + " > " + numero3);
        
        }  else if ((numero1 > numero2) && (numero3 > numero2)){
                  System.out.println(numero1 + " > " + numero3 + " > " + numero2);
                  
    //Segundo caso
        }  else if ((numero2 > numero1)&&(numero1 > numero3)){
                  System.out.println(numero2 + " > " + numero1 + " > " + numero3);
        }  else if ((numero2 > numero3) && (numero3 > numero1)){
                  System.out.println(numero2 + " > " + numero3 + " > " + numero1);
                  
    //Tercer caso
        }  else if ((numero3 > numero1) && (numero1 > numero2)){
                  System.out.println(numero3 + " > " + numero1 + " > " + numero2);
        }  else if ((numero3 > numero2) && (numero2 > numero1)){
                  System.out.println(numero3 + " > " + numero2 + " > " + numero1);
        }
  }
}
