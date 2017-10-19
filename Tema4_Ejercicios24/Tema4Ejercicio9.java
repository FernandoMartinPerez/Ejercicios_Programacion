/**
* Ejercicio 9
* Ejercicio 9
* Realiza un programa que resuelva una ecuación de segundo grado
* ax^2 + bx + c = 0
*
* @author Fernando
*/
public class Tema4Ejercicio9 {
    public static void main(String[] args) {
    
    //introduzco el dato que varía por  teclado
    System.out.println("Vamos a calcular una ecuación de segundo grado:");
    System.out.println("Introduzca el valor de a: ");
    double a = Double.parseDouble(System.console().readLine());
    System.out.println("Introduzca el valor de b: ");
    double b = Double.parseDouble(System.console().readLine());
    System.out.println("Introduzca el valor de c: ");
    double c = Double.parseDouble(System.console().readLine());
    
    //Represento la formula para  resolver el problema
    //Divide y venceras
    
    double dentroRaiz = (b*b)-(4*a*c);
    double raiz = Math.sqrt(dentroRaiz);
    
    double solucion1 = (-b + raiz)/(2*a);
    double solucion2 = (-b - raiz)/(2*a);
    
      if (a <=0)  {
        System.out.println("No se puede hacer porque a es igual o menor que cero");}
      else{
        System.out.println("la soluciones son: ");
        System.out.printf("x1 = %.2f\n", solucion1);
        System.out.printf("x2 = %.2f\n",  solucion2);
        }
                  
    
    
    
    
   
}
}
