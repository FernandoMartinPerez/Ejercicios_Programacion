/**
* Ejercicio 6
* Realiza un programa que calcule el tiempo que tardará en 
* * caer un objeto desde una altura h. Aplica la fórmula 
* t = Raiz de (2*h)/g siendo g = 9.81m/s
* 
*
* @author Fernando
*/
public class Tema4Ejercicio6 {
    public static void main(String[] args) {
      
    //introduzco un dato que no varía con  decimales
    double gravedad = 9.81;
    
    //introduzco el dato que varía por  teclado
    System.out.println("Cuanto tardara en caer una objeto");
    System.out.println();
    System.out.println("Introduzca altura en metros:");
    double altura = Double.parseDouble(System.console().readLine());
    
    //Represento la formula para  resolver el problema
    double tiempo = Math.sqrt(2*altura/gravedad);
    
    //Represento la  solución con dos  decimales
    System.out.print("Tardará en caer: ");
    System.out.printf("%.2f", tiempo);
    System.out.print(" segundos");
    
    

  }
}
